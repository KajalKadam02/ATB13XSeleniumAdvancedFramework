package com.tester.tests.vwo.PageObjectModelTC;

import com.tester.Pages.PageObjectModel.vwo.normal_POM.DashBoardPage;
import com.tester.Pages.PageObjectModel.vwo.normal_POM.LoginPage;
import com.tester.Utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWOLogin_01_Normal_POM {

    //D
    //L
    //V

    @Owner("Kajal")
    @Description("TC#1 - Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login()
    {
        //Driver manager code - 1- D
        WebDriver driver = new ChromeDriver();

        // Page Class code (POM code)-2- L
        LoginPage loginPage = new LoginPage(driver);
        String error_msg = loginPage.loginToVWOLoginInvalidCred(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        //Assertions - 3 - V
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");

        driver.quit();

    }

    @Owner("Kajal")
    @Description("TC#2-Verify that valid creds dashboard page is loaded")
    @Test
    public void test_positive_vwo_login()
    {
        //Driver manager code - 1- D
        WebDriver driver = new ChromeDriver();

        // Page Class code (POM code)-2- L
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToVWOLoginValidCred(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));

        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn, PropertiesReader.readKey("expected_username"));

        driver.quit();


    }

}
