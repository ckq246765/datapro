package com.dcits.datapro;

import com.dcits.datapro.entity.businessTest;
import com.dcits.datapro.entity.systemTest;
import com.dcits.datapro.utils.JsonUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class DataproApplicationTests {

    @Test
    void contextLoads() {
        Map<String,Object> map = new HashMap<>();
        map.put("businessTest",
                Arrays.asList(
                        new businessTest("1","a",23),
                        new businessTest("2","b",24)
                ));
        map.put("systemTest",
                Arrays.asList(
                        new systemTest("1","a",21),
                        new systemTest("2","b",22)
                ));
        //{
        // "systemTest":[{"id":"1","name":"a","age":21},{"id":"2","name":"b","age":22}],
        // "businessTest":[{"id":"1","name":"a","age":23},{"id":"2","name":"b","age":24}]
        // }
        String jsonToString = JsonUtil.toString(map);
        System.out.println("jsonToString:" + jsonToString);

        JsonObject jsonObject = JsonUtil.stringToJosnObject(jsonToString);
        System.out.println("jsonObject:" + jsonObject);

        JsonArray jsonArray = jsonObject.getAsJsonArray("systemTest");
        System.out.println("jsonArray:" + jsonArray);

        String str = JsonUtil.toString(jsonArray);
        systemTest[] systemTestList = JsonUtil.stringToObject(str,systemTest[].class);
        System.out.println("systemTestList:" + Arrays.asList(systemTestList));

    }

}
