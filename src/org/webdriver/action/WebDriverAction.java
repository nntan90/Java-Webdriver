package org.webdriver.action;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverAction {
    WebDriver driver = null;

    public WebDriverAction(WebDriver driver) {
        this.driver = driver;
    }

    public void click(String locator){
        //viet code thuc hien click len mot doi tuong
        driver.findElement(By.xpath(locator)).click();

    }

    public void sendKey(String locator, String value){
        // code dien du lieu vao field text
        driver.findElement(By.xpath(locator)).sendKeys(value);

    }

    public String getText(String locator){
        return  driver.findElement(By.id(locator)).getText();

    }

    public void closeBrowser(){
        driver.close();
    }

    public void openURL(String url){
        driver.get(url);
    }
}
