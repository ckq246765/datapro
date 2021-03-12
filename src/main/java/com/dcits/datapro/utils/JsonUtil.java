package com.dcits.datapro.utils;

import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Json工具类：
 */
public class JsonUtil {
    @Autowired
    private static TabConfig tabConfig;
    /**
     * 对象转Json串：
     * @param object
     * @return
     */
    public static String toString(Object object){
        String jsonString = new Gson().toJson(object);
        return jsonString;
    }

    /**
     * Json串转自定义对象：
     * @param jsonString
     * @param object
     * @param <T>
     * @return
     */
    public static  <T> T stringToObject(String jsonString,Class<T> object){
        T toObject = new Gson().fromJson(jsonString,object);
        return toObject;
    }

    /**
     * Json串转Object对象：
     * @param jsonString
     * @return
     */
    public static JsonObject stringToJosnObject(String jsonString){
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(jsonString);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        return jsonObject;
    }

    /**
     * JsonObject转Json串：
     * @param jsonObject
     * @return
     */
    public static String jsonObjectToJsonString(JsonObject jsonObject){
        return jsonObject.toString();
    }

    /**
     *
     * @param jsonString
     * @return
     */
    public static Map<String,Object>  stringToTabObject(String jsonString){
        Map<String,Object> map = new HashMap<>();
        JsonObject jsonObject = JsonUtil.stringToJosnObject(jsonString);
        for (String tab : tabConfig.getTables()){
            JsonArray jsonArray = jsonObject.getAsJsonArray(tab);
            map.put(tab,jsonArray);
        }
        return map;
    }
}
