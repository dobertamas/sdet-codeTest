package com.happyreturns.test.tests.amazonTests;

import com.happyreturns.test.DriverBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class AmazonBaseTest extends DriverBase {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        driver = getDriver();
        driver.get("https://www.amazon.com/");
    }

}
