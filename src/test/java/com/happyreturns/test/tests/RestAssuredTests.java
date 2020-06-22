package com.happyreturns.test.tests;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.happyreturns.test.BaseRestAssuredClass;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;

public class RestAssuredTests {


    private static final String getProductVariantsPath = "https://happyreturnsqatest.free.beeceptor.com/getProductVariants";
    private static final String baseuri = "https://happyreturnsqatest.free.beeceptor.com/order";

    @Test
    public void postTest() {
        BaseRestAssuredClass restAssuredClass = new BaseRestAssuredClass();
        Assert.assertEquals(restAssuredClass.postVariants(), "{\n" +
                "    \"status\": \"Awesome!\"\n" +
                "}");
    }

    @Test
    public void postVariantsFromGetRequest() {

        Response response = getVariants();
        Map<Object, Object> objectMap = response.jsonPath().getMap("");
        // For debugging only
        // System.out.println(objectMap);
        String jsonToPost = convertMapToJson(objectMap);
        final String postResponse = postVariants(jsonToPost);

        String expectedResponse = "{\n" +
                "    \"status\": \"Awesome!\"\n" +
                "}";
        Assert.assertEquals(expectedResponse, postResponse);

    }

    public String convertMapToJson(Map<Object, Object> objectMap) {

        String json = "";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            json = objectMapper.writeValueAsString(objectMap);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return json;
    }

    public static Response getVariants() {
        return given().log().all().
                when().get(getProductVariantsPath).
                              then().statusCode(200).
                              extract().response();
    }

    public static String postVariants(String json) {
        return with()
                .baseUri(baseuri)
                .header("Content-Type", "application/json")
                .when()
                .body(json)
                .post(baseuri)
                .then()
                .extract()
                .body().jsonPath().prettyPrint();
    }

}
