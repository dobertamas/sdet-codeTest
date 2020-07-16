package com.happyreturns.test.tests.amazonTests;

import com.happyreturns.test.amazonPages.AmazonHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChangeLanguageOnHomePageTests extends AmazonBaseTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        driver = super.navigateToAmazon();
    }

    @Test
    public void navigateToAmazonTest() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        Assert.assertTrue(amazonHomePage.findLanguageSelectionSelectSpanish());
        Assert.assertTrue(amazonHomePage.languageSelectionCLickOnCancel());
    }
}
