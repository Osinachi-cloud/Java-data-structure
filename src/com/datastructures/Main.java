package com.datastructures;

import com.datastructures.arraylist.ArrayList;
import com.datastructures.hashmap.HashMap;
import com.datastructures.linkedlist.LinkedList;
import com.datastructures.queue.Queue;
import com.datastructures.stack.Stack;


public class Main {

    public static void main(String[] args) {

        System.out.println("ArrayList TEST : ");

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Me");
        myList.add("Ze");
        myList.add("Ah");
        myList.add("Mu");    
        myList.add("Ay");
        myList.add("Or");
        myList.add("Ay");
        myList.add("Mü");
        myList.add("Kı");
        myList.add("Ar");
        myList.add("Al");
        myList.add("Me");
        myList.add("Ze");
        myList.add("Ah");
        myList.add("Mu");    
        myList.add("Ay");
        myList.add("Or");
        myList.add("Ay");
        myList.add("Mü");
        myList.add("Kı");
        myList.add("Ar");
        myList.add("Al");
        myList.add("Me");
        myList.add("Ze");
        myList.add("Ah");
        myList.add("Mu");    
        myList.add("Ay");
        myList.add("Or");
        myList.add("Ay");
        myList.add("Mü");
        myList.add("Kı");
        myList.add("Ar");
        myList.add("Al");

        System.out.println("myList second index before remove: " + myList.get(2));

        myList.remove(2);

        System.out.println("myList second index after remove : " + myList.get(2));



      /*  System.out.println("LinkedList TEST : ");
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

        System.out.println("Stack TEST : ");
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

        System.out.println("Queue TEST : ");
        Queue queue = new Queue();
        queue.add(70);
        queue.add(4);
        queue.add(8);
        queue.add(9);
        queue.add(20);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println("HashMap TEST : ");
        HashMap hashMap = new HashMap();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        System.out.println(hashMap.get("1"));            // returns 1
        System.out.println(hashMap.get("2"));            // returns 2
        System.out.println(hashMap.get("3"));            // returns null (not found)
        hashMap.put("2", "1");          // update the existing value
        System.out.println(hashMap.get("2"));            // returns 1
        hashMap.remove("2");
        System.out.println(hashMap.get("2"));            // returns null
        hashMap.put("2", "3");          // update the existing value
        System.out.println(hashMap.get("2"));            // returns 3
        System.out.println(hashMap.hasKey("1"));
        */

    }
}
