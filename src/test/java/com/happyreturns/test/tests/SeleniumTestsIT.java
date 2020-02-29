package com.happyreturns.test.tests;

import com.happyreturns.test.BaseSeleniumClass;
import com.happyreturns.test.DriverBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *  CHALLENGE :
 *  For our challenge, we need to create a Selenium test that navigates to Google.com
 *  and performs a search for "Happy Returns".
 *
 *  After the results are displayed, assert that www.happyreturns.com is the first result
 *  returned from Google.
 *
 *  Notes : Feel free to create classes, rename this class, approach this challenge however you'd like.
 *  Keep it simple or get fancy with it if you have time.
 *
 *  I've created an example test that navigates to Google for you!
 *
 *  Time: 30 minutes
 *
 **/


public class SeleniumTestsIT extends DriverBase {

    @Test
    public void navigateToGoogleTest() throws Exception {
        BaseSeleniumClass baseSeleniumClass = new BaseSeleniumClass();
        Assert.assertTrue(baseSeleniumClass.navigateToGoogle());
    }
}
