package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import untils.DriverManager;

public class WebActionsCommon {
    private WebDriver webDriver;
    public WebElement getWebElementVisibility(String locatorValue){
        By locator = By.xpath(locatorValue);
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),20);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void openBrowser(String url){
        webDriver.get(url);
    }
    public void clickOnElement(String locatorValue){
        getWebElementVisibility(locatorValue).click();

    }
    public void getValueElement(String locatorValue){

    }

}
