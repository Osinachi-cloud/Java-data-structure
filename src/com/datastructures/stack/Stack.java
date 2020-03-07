package com.datastructures.stack;

import com.datastructures.Node;

public class Stack {

    private int size;
    private int itemCount;
    private Node top;

    public Stack(int size) {
        this.size = size;
        this.itemCount = 0;
    }

    public void push(int data) {
        if (this.itemCount == this.size) {
            throw new StackOverflowError("Stack size limit exceeded when pushing item : " + data + ". Stack size is " + this.size);
        } else {
            Node newNode = new Node(data);
            newNode.setNext(top);
            top = newNode;
            itemCount++;
        }

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
