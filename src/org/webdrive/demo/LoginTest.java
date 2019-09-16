package org.webdrive.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void testLoginWithBlankField(){
        //open browser chrome
        WebDriver driver = new ChromeDriver();

        // access the application: account.google.com
        driver.get("https://google.com/account");

        // click login
        By nextBy = By.xpath("//span[@class='RveJvd snByac']");
        WebElement nextBtn = driver.findElement(nextBy);
        nextBtn.click();

        //Get error message
        By errorMsgBy = By.xpath("//div[@class='GQ8Pzc']");
        WebElement errMsg = driver.findElement(errorMsgBy);
        String contentMsg = errMsg.getText();

        //Verify
        Assert.assertEquals(contentMsg,"Enter an email or phone number 1");

        //close browser
        driver.close();
    }
    @Test
    public void testLoginWithBlankPassword(){
        //open browser chrome
        WebDriver driver = new ChromeDriver();

        // access the application: account.google.com
        driver.get("https://google.com/account");

        //enter username
        By emailIdBy = By.id("identifierId");
        WebElement emailId = driver.findElement(emailIdBy);
        emailId.sendKeys("nguyenngoctan1990");

        // click login
        By nextBy = By.xpath("//span[@class='RveJvd snByac']");
        WebElement nextBtn = driver.findElement(nextBy);
        nextBtn.click();

        // click Next
        By next1By = By.id("passwordNext");
        WebElement next1Btn = driver.findElement(next1By);
        next1Btn.click();

        //Get error message
        By errorMsgBy = By.xpath("//div[@class='GQ8Pzc']");
        WebElement errMsg = driver.findElement(errorMsgBy);
        String contentMsg = errMsg.getText();

        //Verify
        Assert.assertEquals(contentMsg,"Enter an email or phone number");

        //close browser
        driver.close();
    }
}

