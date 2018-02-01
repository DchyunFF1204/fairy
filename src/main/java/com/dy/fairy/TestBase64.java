package com.dy.fairy;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @Package name : com.dy.fairy
 * @Description : java8 base64工具
 * @Date : 2018/2/1
 */
public class TestBase64 {


    public static void main(String[] args) {
        String text = "hello java8 base64";
        String s = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(s);

        byte[] decode = Base64.getDecoder().decode(s);
        String s1 = new String(decode, StandardCharsets.UTF_8);
        System.out.println(s1);

        String url = "https://github.com/DchyunFF1204";
        String s2 = Base64.getUrlEncoder().encodeToString(url.getBytes(StandardCharsets.UTF_8));
        System.out.println(s2);

        byte[] decode1 = Base64.getUrlDecoder().decode(s2);
        String s3 = new String(decode1, StandardCharsets.UTF_8);
        System.out.println(s3);
    }

}
