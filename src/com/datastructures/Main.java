package com.datastructures;

import com.datastructures.linkedlist.LinkedList;
import com.datastructures.stack.Stack;

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

        /*** Stack test ***/

        Stack stack = new Stack();
        stack.push(1);
        System.out.println("Top of the Stack : " + stack.peek());
        stack.push(2);
        System.out.println("Top of the Stack : " + stack.peek());
        stack.push(3);
        System.out.println("Top of the Stack : " + stack.peek());
        stack.push(4);
        System.out.println("Top of the Stack : " + stack.peek());

        System.out.println("Pop operation : " + stack.pop());

    }
}
