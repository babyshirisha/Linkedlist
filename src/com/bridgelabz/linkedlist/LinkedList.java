package com.bridgelabz.linkedlist;
//import org.w3c.dom.Node;

import java.util.Scanner;

public class LinkedList implements linked_list {
    Node head;
    @Override
    public void add(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
