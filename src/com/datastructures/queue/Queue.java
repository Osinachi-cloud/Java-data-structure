package com.datastructures.queue;

import com.datastructures.Node;

public class Queue {

    private Node head; // remove from the head
    private Node tail; // add things here

    public boolean isEmpty() {
        return this.head == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (this.tail != null) {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;

        if (this.head == null) {
            this.head = newNode;
        }
    }

    public int peek() {

        return this.head.getData();
    }

    public int remove() {

        int data = this.head.getData();
        this.head = this.head.getNext();
        if (this.head == null) {
            this.tail = null;
        }
        return data;
    }


}
