package com.tester.Pages.PageObjectModel.vwo.improved_POM;

import com.tester.Base.CommonToAllPage;
import com.tester.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends CommonToAllPage {

    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameOnDashboard = By.xpath("//h6");

    // Page Actions
    public String loggedInUserName() {
        WaitHelpers.visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }
}
