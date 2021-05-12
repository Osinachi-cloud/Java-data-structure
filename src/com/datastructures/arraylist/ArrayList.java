package com.datastructures.arraylist;

import java.util.Arrays;


/**
 * A Custom resizable ArrayList implementation
 */
public class ArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final int RESIZING_FACTOR = 2;
    private Object[] elements;
    private int currentSize;
    private int currentIndex;

    public ArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
        currentIndex = 0;
        currentSize = DEFAULT_CAPACITY;
    }

    public void add(E element){
        if(currentIndex == currentSize){            
            System.out.println("Increasing the capacity.");
            System.out.println("Current Index : " + currentIndex);
            System.out.println("Current Size : " + currentSize);
            increaseCapacity();
        }
        elements[currentIndex++] = element;
        System.out.println(element.toString());
    }

    public Object get(int index) {
        if(index < 0 || index >= currentSize)
            throw new IndexOutOfBoundsException();
        else return elements[index];
    }

    public Object getLast(){
        if(currentIndex == 0) return null;
        return elements[currentIndex - 1];
    }

    public void remove(int index){
        if(index < 0 || index >= currentSize)
            throw new IndexOutOfBoundsException();
        else{
            for(int i = index; i<currentSize-1; i++){
                elements[i] = elements[i+1];
            }
            currentIndex--;
        }
    }

    public void increaseCapacity(){
        currentSize *= RESIZING_FACTOR;
        elements = Arrays.copyOf(elements, currentSize);
        System.out.println("Capacity Increased. Current Size : " + currentSize);
    }

    
}
