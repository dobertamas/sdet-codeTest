package com.happyreturns.test.tests.amazonTests;

import com.happyreturns.test.DriverBase;
import org.openqa.selenium.WebDriver;

public class AmazonBaseTest extends DriverBase {

    protected WebDriver driver;

    public WebDriver navigateToAmazon() throws Exception {
        driver = getDriver();
        driver.get("https://www.amazon.com/");
        return driver;
    }
}
