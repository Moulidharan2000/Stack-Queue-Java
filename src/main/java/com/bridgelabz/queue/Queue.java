package com.bridgelabz.queue;

import java.util.LinkedList;

public class Queue {
	
	private LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int value) {
        queue.addLast(value);
    }
    
    public int dequeue() {
        return queue.removeFirst();
    }
    
    public int peek() {
        return queue.getFirst();
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public static void main(String[] args) {
       
    	Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println(queue.dequeue());
    }
}
