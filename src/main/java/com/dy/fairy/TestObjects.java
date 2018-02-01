package com.dy.fairy;

import com.alibaba.fastjson.JSONObject;

import java.util.Comparator;
import java.util.Objects;
/**
 * @Package name : com.dy.fairy
 * @Description : java7 中Objects工具类
 * @Date : 2018/2/1
 */
public class TestObjects {

    public static void main(String[] args) {
        System.out.println(Objects.requireNonNull("sss"));
        System.out.println(Objects.isNull(null));
        System.out.println(Objects.nonNull(null));
        System.out.println(Objects.equals(1,1));
        System.out.println(Objects.deepEquals(Integer.valueOf("1"),1L));
        JSONObject jo = new JSONObject();
        jo.put("key",2);
        JSONObject jo1 = new JSONObject();
        jo1.put("key",1);
        int s = Objects.compare(jo, jo1, new Comparator<JSONObject>() {
            @Override
            public int compare(JSONObject o1, JSONObject o2) {
                return o1.getInteger("key").compareTo(o2.getInteger("key"));
            }
        });
        System.out.println(s);
    }
}
