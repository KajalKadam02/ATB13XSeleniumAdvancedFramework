package com.tester.tests.vwo.PageObjectModelTC;

import com.tester.Base.CommonToAllTest;
import com.tester.Pages.PageObjectModel.vwo.improved_POM.DashBoardPage;
import com.tester.Pages.PageObjectModel.vwo.improved_POM.LoginPage;
import com.tester.Utils.PropertiesReader;
import com.tester.driver.DriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWOLogin_03_prop_Improved_POM extends CommonToAllTest {


    //  D
    // L
    // V

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_03_prop_Improved_POM.class);


    @Owner("Kajal")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() {

        logger.info("Starting the Testcases Page Object Model");


        // Page Class Code (POM Code) - 2 - L
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCred(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        // Assertions - 3 - V

        logger.info("Asserting the invalid credentials");

        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));



    }

    @Owner("Kajal")
    @Description("TC#2-Verify that valid cred dashboard page is loaded")
    @Test
    public void test_positive_vwo_login() {

        logger.info("Starting the Testcases Page Object Model");


        // Page Class Code (POM Code) - 2 - L
        LoginPage loginPage_VWO = new LoginPage(DriverManager.getDriver());
        loginPage_VWO.loginToVWOLoginValidCred(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashBoardPage dashBoardPage = new DashBoardPage(DriverManager.getDriver());
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        logger.info("Done the Test cases");
        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));



    }

}
