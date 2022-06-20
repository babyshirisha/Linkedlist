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
    public void addTypeTwo(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    public void append(int num) {
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
    public void insert(int pos,int data) {
        Node newNode = new Node(data);
        if(pos == head.data){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node requiredNode = head.next;
        Node previousNode = head;
        while(pos != requiredNode.data){
            previousNode = requiredNode;
            requiredNode = requiredNode.next;
        }
        newNode.next = requiredNode;
        previousNode.next = newNode;
    }
    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
