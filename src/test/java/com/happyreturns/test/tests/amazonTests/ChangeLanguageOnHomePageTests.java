package com.happyreturns.test.tests.amazonTests;

import com.happyreturns.test.DriverBase;
import com.happyreturns.test.amazonPages.AmazonHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageOnHomePageTests extends DriverBase {

    @Test
    public void navigateToAmazonTest() throws Exception {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        Assert.assertTrue(amazonHomePage.navigateToAmazon());
        Assert.assertTrue(amazonHomePage.findLanguageSelectionSelectSpanish());
        Assert.assertTrue(amazonHomePage.languageSelectionCLickOnCancel());
    }
}
