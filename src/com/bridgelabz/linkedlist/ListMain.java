package com.bridgelabz.linkedlist;

//import java.util.List;

//import java.awt.*;

public class ListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
      //  list.insert(70,30);
        list.search(30);
        //list.pop();
        //list.popLast();
        System.out.println(list.toString());
    }
}
