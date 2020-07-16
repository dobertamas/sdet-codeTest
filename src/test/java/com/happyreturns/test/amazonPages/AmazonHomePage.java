package com.happyreturns.test.amazonPages;

import com.happyreturns.test.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends DriverBase {

    protected WebDriver driver;

    private final By languageSelectionRadioButton = By.id("icp-nav-flyout");
    private final By languageSelectionCancelButton = By.id("icp-btn-close-announce");

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean findLanguageSelectionSelectSpanish() {
        final WebElement element = driver.findElement(languageSelectionRadioButton);
        element.click();
        return true;
    }

    public boolean languageSelectionCLickOnCancel() {
        final WebElement element = driver.findElement(languageSelectionCancelButton);
        element.click();
        return true;
    }

}
