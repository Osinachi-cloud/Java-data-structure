package com.datastructures;

import com.datastructures.linkedlist.LinkedList;
import com.datastructures.queue.Queue;
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

        Stack stack = new Stack(3);
        try {
            stack.push(1);
            System.out.println("Top of the Stack : " + stack.peek());
            stack.push(2);
            System.out.println("Top of the Stack : " + stack.peek());
            stack.push(3);
            System.out.println("Top of the Stack : " + stack.peek());
            stack.push(4);
            System.out.println("Top of the Stack : " + stack.peek());
        } catch (StackOverflowError ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Pop operation : " + stack.pop());


        /*** Queue test ***/
        Queue queue = new Queue();
        queue.add(70);
        queue.add(4);
        queue.add(8);
        queue.add(9);
        queue.add(20);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }
}
