package com.happyreturns.test;

import java.util.ArrayList;


import static io.restassured.RestAssured.*;

public class BaseRestAssuredClass {

    private static final String baseuri = "https://happyreturnsqatest.free.beeceptor.com/";

    /**
     * Do your work in this class.
     *
     * Per the test, please do the following:
     * 1. Write a method that performs a GET to the endpoint:  https://happyreturnsqatest.free.beeceptor.com/getProductVariants
     * 2. Map a variant object from the variants array from the GET in Step #1 to an object.
     * 3. Perform a POST using the object from Step #2 as the request body to the following endpoint: https://happyreturnsqatest.free.beeceptor.com/order
     *
     * Helpful hints:
     * The methods have been declared for you. When extracting the response, it's recommended to extract and return it as a "body().jsonpath().prettyPrint()" string.
     * The postVariants() method is a good example of how you should format your calls.
     *
     *
     */


    public String getVariants() {
        return null;
    }

    public String postVariants() {
        return with()
                .baseUri(baseuri)
                .header("Content-Type", "application/json")
                .when()
                .body("< !! PUT YOUR REQUEST BODY HERE !! >")
                .request("POST", "order")
                .then()
                .extract()
                .body().jsonPath().prettyPrint();
    }
}
