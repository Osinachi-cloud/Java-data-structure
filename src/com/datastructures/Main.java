package com.datastructures;

import com.datastructures.linkedlist.LinkedList;
import com.datastructures.linkedlist.Node;

public class Main {

    public static void main(String[] args) {

        /*** LinkedList test ***/
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(5);
        linkedList.append(7);

        System.out.println("After append : ");
        linkedList.printAll();
        linkedList.prepend(0);
        System.out.println("After prepend : ");
        linkedList.printAll();

        linkedList.deleteWithValue(5);
        System.out.println("After deletingWithValue : ");
        linkedList.printAll();
    }
}
