package com.happyreturns.test;
import org.json.JSONObject;

import org.testng.Assert;
import org.testng.*;
import org.testng.annotations.Test;

public class BaseJsonClass {

    /**
     Construct a request body in JSON body that contains the following. Use SysOut to prove your answer.

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
     **/

    public String requestBodyTest() {
        JSONObject body = new JSONObject();
        body.put("test", "123");

        System.out.println(body.toString());
        return body.toString();
    }


}
