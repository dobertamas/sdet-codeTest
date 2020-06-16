package com.happyreturns.test;

import org.json.JSONObject;



public class BaseJsonClass {

    /**
     Construct a request body in JSON body that contains the following.

     {
        "order": {
        "line_items": [
          {
            "variant_id": 447654529,
            "quantity": 1
          }
        ]
       }
     }

     In order to run the tests, type the following in the Terminal:
     mvn clean verify -Dtest=JsonTestsIT
     **/

    public String requestBodyTest() {
        JSONObject body = new JSONObject();
        body.put("Test123", 123);
        System.out.println(body.toString());
        return body.toString();
    }


}
