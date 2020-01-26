package com.datastructures;

import com.datastructures.linkedlist.LinkedList;
import com.datastructures.linkedlist.Node;

public class Main {

    public static void main(String[] args) {

        /*** LinkedList test ***/
        LinkedList linkedList = new LinkedList();
        linkedList.setHead(new Node(1));

        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(7);

        linkedList.getHead().setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        linkedList.printAll();
    }
}
