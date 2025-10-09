package com.tester.Pages.PageObjectModel.vwo;

import com.tester.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {

    WebDriver driver;

    public DashBoardPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private By userNameOnDashboard = By.xpath("//h6");

    public String loggedInUserName()
    {
        WaitHelpers.waitJVM(10000);
        driver.get("https://app.vwo.com/#/dashboard");
        return driver.findElement(userNameOnDashboard).getText();

    }

}
