package com.happyreturns.test.amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonBasePage {

    protected WebDriver driver;

    private final By languageSelectionRadioButton = By.id("icp-nav-flyout");
    private final By languageSelectionCancelButton = By.id("icp-btn-close-announce");
    private final By visitShopBargainFindsLink = By.linkText("Shop Bargain Finds");

    public AmazonBasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean findLanguageSelectionSelectSpanish() {
        // Using click method which is using WebDriverWait inside
        click(languageSelectionRadioButton);
        return true;
    }

    public boolean languageSelectionCLickOnCancel() {
        // Using click method which is using WebDriverWait inside
        click(languageSelectionCancelButton);
        return true;
    }

    public ShopBargainFindsLinkPage visitShopBargainFinds() {
        click(visitShopBargainFindsLink);
        return new ShopBargainFindsLinkPage(driver);
    }

    /**
     * Open page with given URL
     */
    protected void openUrl(String url) {
        driver.get(url);
    }

    /**
     * Return the title of the given page
     */
    public String getPageTitle(){
        return driver.getTitle();
    }

    /**
     * Find element using given locator
     */
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    /**
     * Type given text into element with given locator
     */
    protected void type(String text, By locator) {
        waitForVisibilityOf(locator, 5);
        find(locator).sendKeys(text);
    }

    /**
     * Click on element with given locator when its visible
     */
    protected void click(By locator) {
        waitForVisibilityOf(locator, 5);
        find(locator).click();
    }

    /**
     * Wait for specific ExpectedCondition for the given amount of time in seconds
     */
    private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
        timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(condition);
    }

    /**
     * Wait for given number of seconds for element with given locator to be visible on the page
     */
    protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
                        (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println(e.toString());
            }
            attempts++;
        }
    }



}
