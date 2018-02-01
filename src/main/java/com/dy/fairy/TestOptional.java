package com.dy.fairy;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @Package name : com.dy.fairy
 * @Description : java8 中可为null的容器对象
 * @Date : 2018/2/1
 */
public class TestOptional {

    public static void main(String[] args) {
        Optional<String> test_optional = Optional.of("test optional");
        System.out.println(test_optional.isPresent()); // true
        System.out.println(test_optional.get());

        test_optional.ifPresent(a-> System.out.println(a.length()));

        Optional<String> s = test_optional.map(a -> a.toUpperCase());
        System.out.println(s.get());

        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o.isPresent()); //false
        //System.out.println(o.get()); //noSuchElementException

        System.out.println(test_optional.orElseGet(()->"default val"));
        System.out.println(o.orElseGet(()->"default val"));

        System.out.println(test_optional.filter(a->a.length()>10).orElse("optional is null"));


    }
}
