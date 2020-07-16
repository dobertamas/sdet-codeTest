package com.happyreturns.test.tests.amazonTests;

import com.happyreturns.test.amazonPages.AmazonBasePage;
import org.hamcrest.core.StringContains;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ChangeLanguageOnHomePageTests extends AmazonBaseTest {

    @Test
    public void navigateToAmazonTest() {
        AmazonBasePage amazonBasePage = new AmazonBasePage(driver);
        Assert.assertTrue(amazonBasePage.findLanguageSelectionSelectSpanish());
        Assert.assertTrue(amazonBasePage.findLanguageSelectionSelectSpanish());
        Assert.assertTrue(amazonBasePage.languageSelectionCLickOnCancel());

    }

    @Test
    public void TestVisitShopBargainFinds() {
        AmazonBasePage amazonBasePage = new AmazonBasePage(driver);
        final AmazonBasePage shopBargainFindsLinkPage = amazonBasePage.visitShopBargainFinds();
        final String pageTitle = shopBargainFindsLinkPage.getPageTitle();
        System.out.println(pageTitle);
        assertThat(pageTitle, StringContains.containsString("Amazon.com: Bargain Finds"));
    }
}
