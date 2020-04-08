package com.datastructures.hashmap;

public class MyHashMap {

    private static class LinkedList {
        String key, value;
        LinkedList next;

        LinkedList(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private int sizeOfHashMap;
    private LinkedList[] hashMap;

    public MyHashMap() {
        this.sizeOfHashMap = 100;
        this.hashMap = new LinkedList[sizeOfHashMap];
    }

    public void put(String key, String value) {
        int index = calculateIndex(key);
        if (hashMap[index] == null) {
            hashMap[index] = new LinkedList(key, value);
        } else {
            LinkedList node = findNode(hashMap[index], key);
            if (node.next != null || node.key.equals(key)) {
                // update existing node with the new value
                node.value = value;
            } else {
                // append a new node with a new key
                node.next = new LinkedList(key, value);
            }
        }
    }

    private LinkedList findNode(LinkedList node, String key) {
        LinkedList current = node;
        LinkedList correctNode = null;
        while (current != null) {
            correctNode = current;
            if (correctNode.key.equals(key)) {
                return correctNode;
            }
            current = current.next;
        }
        return correctNode;
    }


    public String get(String key) {
        int index = calculateIndex(key);
        if (hashMap[index] == null) {
            return null;
        } else {
            LinkedList node = findNode(hashMap[index], key);
            if (node != null)
                return node.value;
            return null;
        }

    }

    public void remove(String key) {

    }


    private int calculateIndex(String key) {
        return key.hashCode() % this.sizeOfHashMap;
    }

}
