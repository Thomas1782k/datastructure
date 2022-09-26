package com.ds.Stack;

public class Stack {

	private Node top;
	private int height;
	
	public class Node{
		public int value;
		Node next;
		
		Node(int value){
			super();
			this.value=value;
		}
	}
	
	public Stack(int value) {
		 Node newNode=new Node(value);
		 top=newNode;
		 height=1;
	}
	
	public void printStack() {
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}
	
	public void push(int x) {
		Node newNode=new Node(x);
		if(height==0) {
			top=newNode;
		} else {
			newNode.next=top;
			top=newNode;
		}
		height++;
	}
	
	public Node pop() {
		if(height==0) return null;
		Node temp=top;
		top=temp.next;
		height--;
		return temp;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
