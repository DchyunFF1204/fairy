package com.dy.fairy;

import com.alibaba.fastjson.JSONObject;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @Package name : com.dy.fairy
 * @Description : java8 consumer
 * @Date : 2018/2/1
 */
public class TestConsumer {

    public static void main(String[] args) {

        Consumer<JSONObject> jsonObjectConsumer = (JSONObject o1) -> {
            o1.put("consumer", "test consumer");
        };
        JSONObject jsonObject2 = new JSONObject();
        jsonObjectConsumer.accept(jsonObject2);
        System.out.println(jsonObject2);

        Consumer<JSONObject> jsonObjectConsumer1 = (JSONObject o1) -> {
            o1.put("consumer3", "test consume3");
        };

        // consumer 组装
        Consumer<JSONObject> jsonObjectConsumer2 = jsonObjectConsumer.andThen(jsonObjectConsumer1);
        JSONObject jsonObject3 = new JSONObject();
        jsonObjectConsumer2.accept(jsonObject3);
        System.out.println(jsonObject3);

        BiConsumer<JSONObject, JSONObject> jsonObjectJSONObjectBiConsumer = (JSONObject o1, JSONObject o2) -> {
            o1.put("consumer1", "test consumer1");
            o2.put("consumer2", "test consumer2");
        };
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject1 = new JSONObject();
        jsonObjectJSONObjectBiConsumer.accept(jsonObject, jsonObject1);
        System.out.println(jsonObject);
        System.out.println(jsonObject1);


    }
}
