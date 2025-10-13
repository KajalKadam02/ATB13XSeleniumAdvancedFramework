package com.tester.Pages.PageFactory;

import com.tester.Base.CommonToAllPage;
import com.tester.Utils.PropertiesReader;
import com.tester.Utils.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF extends CommonToAllPage {

    WebDriver driver;

    public LoginPage_PF(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    // private By username = By.id("login-username");
    @FindBy(id = "login-username")
    private WebElement username;

   //private By password = By.id("login-password");
    @FindBy(name = "password")
    private WebElement password;

   // private By signButton = By.id("js-login-btn");
    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;

    public String loginToVWOLoginValidCred() {

        try {
            openvwoUrl();
            enterInput(username, PropertiesReader.readKey("invalid_username"));
            enterInput(password, PropertiesReader.readKey("invalid_password"));
            clickElement(signButton);
            WaitHelpers.waitJVM(5000);
        } catch (Exception e) {
            System.out.println("Elements Not found!");
        }
        return getText(error_message);

    }

    }


