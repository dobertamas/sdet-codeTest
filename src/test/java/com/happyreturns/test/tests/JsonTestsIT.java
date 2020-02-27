package com.happyreturns.test.tests;

import com.happyreturns.test.BaseJsonClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonTestsIT {


    @Test
    public void assertRequestBody() {
        BaseJsonClass baseJsonClass = new BaseJsonClass();
        Assert.assertEquals(baseJsonClass.requestBodyTest(), "{\\r\\n\\\"order\\\":{\\r\\n\\\"line_items\\\":[\\r\\n{\\r\\n\\\"variant_id\\\":447654529,\\r\\n\\\"quantity\\\":1\\r\\n}\\r\\n]\\r\\n}\\r\\n}");

    }
}
