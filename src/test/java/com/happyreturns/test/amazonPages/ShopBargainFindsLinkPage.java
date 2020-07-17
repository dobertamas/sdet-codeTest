package com.happyreturns.test.amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopBargainFindsLinkPage extends AmazonBasePage {

    By priceWholeValue = By.xpath("//*[@class='a-price-whole']");

    public ShopBargainFindsLinkPage(WebDriver driver) {
        super(driver);
    }

    public String findAnItemWithFifteenBucksPrice() {
        final List<WebElement> webElementList = findList(priceWholeValue);
        System.out.println(webElementList.size());
        for (WebElement element : webElementList) {
            System.out.println(element.getText());
        }
        return webElementList.get(0).getText();
    }
}
