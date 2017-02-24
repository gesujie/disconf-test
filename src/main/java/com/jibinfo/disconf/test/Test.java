package com.jibinfo.disconf.test;

import java.math.BigInteger;
import java.util.Objects;

/**
 * Created by admin on 2017/2/16.
 */
public class Test {


    public static void main(String[] args) {
        String string = " DELETE from interface_log_response where id BETWEEN %s AND %s;";
        int startIndex = 7100000;
        int step = 50000;
        for (int i = 1; i < 60; i++) {
            int endIndex = startIndex + step;
            System.out.println(String.format(string, startIndex,endIndex));

            startIndex = endIndex;
        }


        System.out.println(Objects.equals("a","b"));


    }
}
