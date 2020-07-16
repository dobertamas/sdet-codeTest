package com.happyreturns.test.tests.amazonTests;

import com.happyreturns.test.amazonPages.AmazonHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageOnHomePageTests extends AmazonBaseTest {

    @Test
    public void navigateToAmazonTest() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        Assert.assertTrue(amazonHomePage.findLanguageSelectionSelectSpanish());
        Assert.assertTrue(amazonHomePage.findLanguageSelectionSelectSpanish());
        Assert.assertTrue(amazonHomePage.languageSelectionCLickOnCancel());
    }
}
