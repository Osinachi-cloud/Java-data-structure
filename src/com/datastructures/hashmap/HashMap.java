package com.datastructures.hashmap;

public class HashMap {

    private static class LinkedList {
        String key, value;
        LinkedList next;

        LinkedList(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private LinkedList[] hashMap;
    private int loadFactor; // TODO : implement load factor

    public HashMap() {
        this.capacity = 100;
        this.hashMap = new LinkedList[capacity];
    }

    public void put(String key, String value) {
        int index = calculateIndex(key);
        if (hashMap[index] == null) {
            hashMap[index] = new LinkedList(key, value);
        } else {
            if (hashMap[index].key.equals(key)) {
                hashMap[index].value = value;
            } else {
                LinkedList prevNode = findNode(hashMap[index], key);
                if (prevNode.next != null && prevNode.next.key.equals(key)) {
                    // update existing node with the new value
                    prevNode.next.value = value;
                } else {
                    // append a new node with a new key
                    prevNode.next = new LinkedList(key, value);
                }
            }
        }
    }

    private LinkedList findNode(LinkedList node, String key) {
        LinkedList current = node;
        LinkedList prevNode = null;
        while (current != null && !current.key.equals(key)) {
            prevNode = current;
            current = current.next;
        }
        return prevNode;
    }


    public String get(String key) {
        int index = calculateIndex(key);
        if (hashMap[index] == null) {
            return null;
        } else {
            if (hashMap[index].key.equals(key))
                return hashMap[index].value;
            else {
                LinkedList prevNode = findNode(hashMap[index], key);
                if (prevNode.next != null && prevNode.next.key.equals(key))
                    return prevNode.next.value;
                else
                    return null;
            }
        }
    }

    public void remove(String key) {
        int index = calculateIndex(key);
        if (hashMap[index] != null) {
            if (hashMap[index].key.equals(key))
                hashMap[index] = null;
            else {
                LinkedList prevNode = findNode(hashMap[index], key);
                if (prevNode!=null 
                &&  prevNode.next != null 
                &&  prevNode.next.key.equals(key)){
                    prevNode.next = prevNode.next.next;
                }
            }
        }
    }

    public boolean hasKey(String key) {
        return this.get(key) != null;
    }

    private int calculateIndex(String key) {
        return key.hashCode() % this.capacity;
    }

}
