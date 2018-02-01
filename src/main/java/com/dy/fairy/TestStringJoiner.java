package com.dy.fairy;

import java.util.StringJoiner;

/**
 * @Package name : com.dy.fairy
 * @Description : stringjoiner 工具类
 * @Date : 2018/2/1
 */
public class TestStringJoiner {

    public static void main(String[] args) {
        //  分隔符 前缀   后缀
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        System.out.println(stringJoiner.toString());
        System.out.println(stringJoiner.setEmptyValue("default"));
        stringJoiner.add("testStringJoiner");
        System.out.println(stringJoiner.toString());
        stringJoiner.add("123");
        System.out.println(stringJoiner.toString());

        StringJoiner stringJoiner1 = new StringJoiner("123");
        // 合并  merge
        System.out.println(stringJoiner.merge(stringJoiner1));

        System.out.println(stringJoiner.length());
    }
}
