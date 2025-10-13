package com.tester.tests.vwo.PageFactoryTC;

import com.tester.Base.CommonToAllTest;
import com.tester.Pages.PageFactory.LoginPage_PF;
import com.tester.Utils.PropertiesReader;
import com.tester.driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_PF extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF.class);


    @Test
    public void testLoginNegativeVWO_PF() {
        logger.info("Starting the Testcases Page Factory");


        LoginPage_PF loginPage_PF = new LoginPage_PF(DriverManager.getDriver());
        String error_msg = loginPage_PF.loginToVWOLoginValidCred();


        logger.info("Error msg I got "+ error_msg);
        logger.info("Finished the Testcases Page Factory");


        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));
    }
}
