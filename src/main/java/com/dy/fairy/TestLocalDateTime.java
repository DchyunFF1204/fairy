package com.dy.fairy;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Package name : com.dy.fairy
 * @Description : java8 datetime
 * @Date : 2018/2/1
 */
public class TestLocalDateTime {

    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate now1 = LocalDate.now(clock);
        System.out.println(now1);

        LocalTime now2 = LocalTime.now();
        System.out.println(now2.format(DateTimeFormatter.ofPattern("HH:mm:ss")));


        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

}
