package com.bridgelabz.stackandqueue;

import java.util.LinkedList;

public class Stack {
	
	static LinkedList<Object> stack = new LinkedList<Object>();
	
	public void push(Object data) {
		stack.addFirst(data);
	}
	
	public Object pop() {
		return stack.removeFirst();
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println(stack.pop()); 
		System.out.println(stack.pop()); 
		System.out.println(stack.pop());
	}
}