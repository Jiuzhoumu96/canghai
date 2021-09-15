package com.lanhuigu.canghai;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author: HeChengyao
 * @date: 2021/9/15 11:20
 */
public class JsonTest {

    public static void main(String[] args) {

        String json = String.format("{\n" +
                "    \"pets\": [\n" +
                "        { \"petName\":\"John\" , \"weight\":19 },\n" +
                "        { \"petName\":\"Anna\" , \"weight\":22 },\n" +
                "        { \"petName\":\"Peter\", \"weight\":23 }\n" +
                "    ]\n" +
                "}");

        JSONObject jsonObject = JSON.parseObject(json);
        JSONArray pets = jsonObject.getJSONArray("pets");

        System.out.println(jsonObject);
        System.out.println(pets);
        System.out.println(pets.size());

        JSONObject jsonObject0 = pets.getJSONObject(0);
        System.out.println(jsonObject0);
        String petName = jsonObject0.get("petName").toString();
        System.out.println(petName);
    }
}
