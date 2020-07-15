package com.happyreturns.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseSeleniumClass extends DriverBase {


    /**
     * CHALLENGE :
     * For our challenge, we need to create a Selenium test that navigates to Google.com
     * and performs a search for "Happy Returns".
     * <p>
     * After the results are displayed, assert that www.happyreturns.com is the first result
     * returned from Google.
     * <p>
     * Notes : Feel free to create classes, rename this class, approach this challenge however you'd like.
     * Keep it simple or get fancy with it if you have time.
     * <p>
     * Time: 30 minutes
     **/


    public Boolean navigateToGoogle() throws Exception {
        WebDriver driver = getDriver();
        driver.get("https://google.com");
        return true;
    }

    public Boolean navigateToAmazon() throws Exception {
        WebDriver driver = getDriver();
        driver.get("https://www.amazon.com/");
        return true;
    }

    public Boolean findLanguageSelectionSelectSpanish() throws Exception{
        WebDriver driver = getDriver();
        final WebElement element = driver.findElement(By.id("icp-nav-flyout"));
        element.click();
        return true;

    }

    public boolean languageSelectionCLickOnCancel() {
            return false;
    }
}
