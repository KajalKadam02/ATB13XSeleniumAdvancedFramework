package com.tester.tests.vwo.PageObjectModelTC;

import com.tester.Base.CommonToAllTest;
import com.tester.Utils.TakeScreenshot;
import com.tester.listeners.RetryAnalyzer;
import com.tester.listeners.ScreenshotListener;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.tester.driver.DriverManager.getDriver;
@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestVWOLogin_05_TakeScreenshot_Retry_prop_Improved_POM extends CommonToAllTest {

    //  D
    // L
    // V

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_05_TakeScreenshot_Retry_prop_Improved_POM.class);


    @Owner("Kajal")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testFail() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
      Allure.addAttachment("Log output", "text/plain", "This is some log text");
        Assert.assertTrue(false);
    }

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPass() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        new TakeScreenshot().takeScreenshot("testPass_1");
        Assert.assertTrue(true);
    }

}
