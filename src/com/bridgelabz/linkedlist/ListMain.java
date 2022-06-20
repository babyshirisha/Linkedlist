package com.bridgelabz.linkedlist;

//import java.util.List;

//import java.awt.*;

public class ListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.append(70);
        list.insert(70,30);
        //list.append(70);
        //list.append(65);
        System.out.println(list.toString());
    }
}
