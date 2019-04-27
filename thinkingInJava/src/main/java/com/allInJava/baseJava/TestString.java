package com.allInJava.baseJava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yuhang
 * @date: 2019/4/15
 */
public class TestString {

    public static void main(String[] args) {
//        String s = new String("java");
        String s = "java";
        aa(s);
        System.out.println(s);
        List list = new ArrayList();
    }
    public static void aa(String s){
        s.replace("j","l");
    }
}
