package com.datastructures.linkedlist;

public class LinkedList {

    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void setHead(Node head){
        this.head = head;
    }

    public Node getHead(){
        return this.head;
    }

    public void printAll() {
        Node n = this.getHead();
        while(n != null){
            System.out.println(n.getData());
            n = n.getNext();
        }
    }
}
