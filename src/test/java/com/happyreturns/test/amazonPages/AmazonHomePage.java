package com.happyreturns.test.amazonPages;

import com.happyreturns.test.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends DriverBase {

    protected WebDriver driver;

    public Boolean navigateToAmazon() throws Exception {
        driver = getDriver();
        driver.get("https://www.amazon.com/");
        return true;
    }

    public Boolean findLanguageSelectionSelectSpanish() throws Exception {
        WebDriver driver = getDriver();
        final WebElement element = driver.findElement(By.id("icp-nav-flyout"));
        element.click();
        return true;

    }

    public boolean languageSelectionCLickOnCancel() {
        return false;
    }

}
