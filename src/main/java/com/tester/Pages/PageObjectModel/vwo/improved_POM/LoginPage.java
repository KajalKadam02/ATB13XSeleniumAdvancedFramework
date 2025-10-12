package com.tester.Pages.PageObjectModel.vwo.improved_POM;

import com.tester.Base.CommonToAllPage;
import com.tester.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.tester.driver.DriverManager.getDriver;

public class LoginPage extends CommonToAllPage {

    //  WebDriver
    // Page Class
    // Page Locators
    // Page Actions

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // // Step 1 - Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    public String loginToVWOLoginInvalidCred(String user, String pwd)
    {
        openvwoUrl();
        enterInput(username, user);
        enterInput(password, pwd);
        clickElement(signButton);
        WaitHelpers.checkVisibility(getDriver(),error_message);
        return getText(error_message);
        
    }

    public void loginToVWOLoginValidCred(String user, String pwd) {

        openvwoUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);

        // Wait - Thread sleep
        WaitHelpers.waitJVM(5000);

    }

}
