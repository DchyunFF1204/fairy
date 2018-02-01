package com.dy.fairy;

import com.alibaba.fastjson.JSONObject;

import java.util.function.Supplier;

/**
 * @Package name : com.dy.fairy
 * @Description : supplier java8接口返回任何范型
 * @Date : 2018/2/1
 */
public class TestSupplier {

    public static void main(String[] args) {
        Supplier<JSONObject> a = ()->{
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("supplier","test supplise");
            return jsonObject;
        };
        System.out.println(a.get());
    }
}
