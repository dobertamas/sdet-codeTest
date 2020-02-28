package com.happyreturns.test.tests;

import com.happyreturns.test.DriverBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class SeleniumTestsIT extends DriverBase {

    @Test
    public void navigateToGoogle() throws Exception {
        WebDriver driver = getDriver();
        driver.get("https://www.google.com");

    }
}
