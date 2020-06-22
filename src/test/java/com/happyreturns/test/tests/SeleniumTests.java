package com.happyreturns.test.tests;

import com.happyreturns.test.BaseSeleniumClass;
import com.happyreturns.test.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 *  CHALLENGE :
 *  For our challenge, we need to create a Selenium test that navigates to Google.com
 *  and performs a search for "Happy Returns".
 *
 *  After the results are displayed, assert that The Happy Returns site with address www.happyreturns.com is the first organic result
 *  returned. We are NOT looking for the ad that is returned, but the first organic result.
 *
 *  Notes : Feel free to create classes, rename this class, approach this challenge however you'd like.
 *  Keep it simple or get fancy with it if you have time.
 *
 *  Time: 30 minutes
 *
 **/


public class SeleniumTests extends DriverBase {

    /**
     * Here is an example test method that navigates
     * to Google.com.
     *
     * To run the tests, type the following in the Terminal:
     * mvn clean verify -Dtest=SeleniumTestsIT
     *
     * **/

    static final String inputString = "Happy Returns";
    static final String expectedAttribute = "https://www.happyreturns.com/";


    @Test
    public void navigateToGoogleTest() throws Exception {
        BaseSeleniumClass baseSeleniumClass = new BaseSeleniumClass();
        Assert.assertTrue(baseSeleniumClass.navigateToGoogle());
        final RemoteWebDriver remoteWebDriver = getDriver();
        // WebElement inputField = remoteWebDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        WebElement inputField = remoteWebDriver.findElement(By.xpath("//*/input[@name='q']"));
        inputField.sendKeys(inputString);
        // WebElement searchButton = remoteWebDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
        WebElement searchButton = remoteWebDriver.findElement(By.xpath("//*/input[@value='Google Search']"));
        WebDriverWait wait = new WebDriverWait(remoteWebDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
        List<WebElement> results = remoteWebDriver.findElements(By.xpath("//*/div[@class='rc']/div[@class='r']/a"));

        // For debugging
        for (WebElement item:results){
            System.out.println(item.getAttribute("href"));
        }
        
        final String href = results.get(0).getAttribute("href");
        Assert.assertEquals(href,expectedAttribute);

    }
}
