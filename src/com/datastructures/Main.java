package com.datastructures;

import com.datastructures.hashmap.MyHashMap;
import com.datastructures.linkedlist.LinkedList;
import com.datastructures.queue.Queue;
import com.datastructures.stack.Stack;

import java.util.HashMap;

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

        HashMap<String, Integer> map = new HashMap<>();
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
        System.out.println("***MyHashMap***");
        MyHashMap hashMap = new MyHashMap();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        System.out.println(hashMap.get("1"));            // returns 1
        System.out.println(hashMap.get("2"));            // returns 2
        System.out.println(hashMap.get("3"));            // returns null (not found)
        hashMap.put("2", "1");          // update the existing value
        System.out.println(hashMap.get("2"));            // returns 1

    }
}
