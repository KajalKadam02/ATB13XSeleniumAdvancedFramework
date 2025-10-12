package com.tester.tests.vwo.PageObjectModelTC;

import com.tester.Base.CommonToAllTest;
import com.tester.Pages.PageObjectModel.vwo.improved_POM.DashBoardPage;
import com.tester.Pages.PageObjectModel.vwo.improved_POM.LoginPage;
import com.tester.Utils.PropertiesReader;
import com.tester.driver.DriverManager;
import com.tester.listeners.RetryAnalyzer;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.tester.driver.DriverManager.getDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestVWOLogin_04_Retry_prop_Improved_POM extends CommonToAllTest {

    //  D
    // L
    // V

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_04_Retry_prop_Improved_POM.class);


    @Owner("Kajal")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testFail() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
//      Allure.addAttachment("Log output", "text/plain", "This is some log text");
        Assert.assertTrue(false);
    }

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPass() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
//        new TakeScreenShot().takeScreenshot("testPass_1");
        Assert.assertTrue(true);
    }

}
