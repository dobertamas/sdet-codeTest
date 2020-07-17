package com.happyreturns.test.tests.amazonTests;

import com.happyreturns.test.amazonPages.AmazonBasePage;
import com.happyreturns.test.amazonPages.ShopBargainFindsLinkPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.containsString;
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
        String expectedTitle = "Amazon.com: Bargain Finds";
        AmazonBasePage amazonBasePage = new AmazonBasePage(driver);
        final ShopBargainFindsLinkPage shopBargainFindsLinkPage = amazonBasePage.visitShopBargainFinds();
        final String pageTitle = shopBargainFindsLinkPage.getPageTitle(expectedTitle);
        System.out.println(pageTitle);
        assertThat(pageTitle, containsString(expectedTitle));
        final String anItemWithFifteenBucksPrice = shopBargainFindsLinkPage.findAnItemWithFifteenBucksPrice();
        System.out.println(anItemWithFifteenBucksPrice);
        shopBargainFindsLinkPage.refreshPage();
        System.out.println("refreshed");
        final String anItemWithFifteenBucksPriceAfterRefresh = shopBargainFindsLinkPage.findAnItemWithFifteenBucksPrice();
        System.out.println(anItemWithFifteenBucksPriceAfterRefresh);
    }
}
