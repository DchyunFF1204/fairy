package com.dy.fairy;

import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Package name : com.dy.fairy
 * @Description : java8 stream
 * @Author ： daizhaoyun
 * @Date : 2018/2/11
 */
public class TestStream {

    public static void main(String[] args) {
        List<JSONObject> objects = new ArrayList<>();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",1);
        jsonObject.put("name","xiaoming");
        objects.add(jsonObject);

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("id",2);
        jsonObject1.put("name","xiaoming");
        objects.add(jsonObject1);


        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id",2);
        jsonObject2.put("name","xiaozhang");
        objects.add(jsonObject2);

        List<Integer> ids = objects.stream().map(a -> a.getInteger("id")).distinct().collect(Collectors.toList());
        System.out.println("获取list中的某个字段并去重="+ids);

        List<JSONObject> listine = objects.stream().filter(a -> a.getInteger("id") > 1).collect(Collectors.toList());
        System.out.println("过滤list集合中id>1的集合=="+listine);

        Map<Integer, List<JSONObject>> maps = objects.stream().collect(Collectors.groupingBy(a -> a.getInteger("id")));
        System.out.println("list分组=="+maps);

        // list -- > map 过滤重复的key 已后者为准
        Map<Integer, JSONObject> map = objects.stream().collect(Collectors.toMap(a -> a.getInteger("id"), o -> o,(v1,v2)->v2));
        System.out.println("list转map=="+map);


        List<JSONObject> collect = objects.stream().collect(Collectors.collectingAndThen(
                Collectors.toCollection(() -> new TreeSet<>((o1, o2) -> o1.getInteger("id").compareTo(o2.getInteger("id")))), ArrayList::new));
        System.out.println("list去重id="+collect);

        List<JSONObject> sex = objects.stream().map(a -> {
            a.put("sex", 1);
            return a;
        }).collect(Collectors.toList());
        System.out.println("对象转换="+sex);

    }

}
