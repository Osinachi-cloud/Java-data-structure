package com.datastructures.linkedlist;

public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }
        Node current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node(data));
    }

    public void prepend(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }
        Node newHead = new Node(data);
        newHead.setNext(this.head);
        this.head = newHead;
    }

    public void deleteWithValue(int data){
        if(this.head == null)
            return;
        if(this.head.getData() == data){
            this.head = this.head.getNext();
            return;
        }
        Node current = this.head;
        while(current.getNext() != null){
            if(current.getNext().getData() == data){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void printAll() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


}
