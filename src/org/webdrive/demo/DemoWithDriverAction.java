package org.webdrive.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.webdriver.action.WebDriverAction;

public class DemoWithDriverAction {
    @Test
    public void loginWithBlankField(){
        WebDriver driver = new ChromeDriver();
        WebDriverAction myAction = new WebDriverAction(driver);

        myAction.openURL("https://google.com/account");
        myAction.click("//span[@class='RveJvd snByac']");
        String contentMsg = myAction.getText("//div[@class='GQ8Pzc']");
        Assert.assertEquals(contentMsg,"Enter an email or phone number");
        myAction.closeBrowser();
    }
}
