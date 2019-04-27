package com.allInJava.baseJava.collections.list.linkedList;

import com.allInJava.baseJava.collections.list.List;

/**
 * 双向链表的实现
 * @author: yuhang
 * @date: 2019/4/23
 */
public class LinkedList implements List {
    // 头结点
    private Node head;
    // 末尾结点
    private Node last;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(Object e) {
        Node l = last;
        Node newNode = new Node(e);
        last = newNode;
        if (l==null){
            head = newNode;
        }else{

        }
    }

    @Override
    public void add(int i, Object e) {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public void removeObj(Object e) {

    }
}
