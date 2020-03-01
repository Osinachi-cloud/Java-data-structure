package com.datastructures.stack;

import com.datastructures.Node;

public class Stack {

    private int size;
    private Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {
        int data = top.getData();
        top = top.getNext();
        return data;
    }

    public int peek() {
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

}
