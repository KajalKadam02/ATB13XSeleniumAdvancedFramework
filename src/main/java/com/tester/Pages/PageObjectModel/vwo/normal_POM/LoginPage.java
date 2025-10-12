package com.tester.Pages.PageObjectModel.vwo.normal_POM;

import com.tester.Utils.PropertiesReader;
import com.tester.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;



    //Page class

    //Step 0 - Parametrized constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }




    // Step 1 - Page Locators

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signIn = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    // If you are not using it , don't keep.
    //private By signBySSO = By.xpath("//button[normalize-space()='Sign in using SSO']");




    // Step 2 - Page Actions
    public String loginToVWOLoginInvalidCred(String user, String pwd)
    {
        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signIn).click();

        WaitHelpers.checkVisibility(driver, error_message);
        String error_message_text = driver.findElement(error_message).getText();
        return error_message_text;

    }

    public void loginToVWOLoginValidCred(String user, String pwd)
    {
        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signIn).click();

        //Wait - Tread Sleep
        WaitHelpers.waitJVM(5000);

    }
}
