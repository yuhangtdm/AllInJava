package com.allInJava.baseJava.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: yuhang
 * @date: 2019/4/27
 */
public class TestList {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(3,10);
        System.out.println(list);
    }
}
