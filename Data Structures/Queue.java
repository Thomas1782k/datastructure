package com.ds.Queue;

import com.ds.Stack.Stack.Node;

public class Queue {

	private Node first;
	private Node last;
	private int l;
	
	public class Node{
		public int value;
		Node next;
		Node prev;
		
		Node(int value){
			super();
			this.value=value;
		}
	}
	
	public Queue(int value) {
		 Node newNode=new Node(value);
		 first=last=newNode;
		 l=1;
	}
	
	public void printQueue() {
		
		Node temp=first;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}
	
	public void enque(int x) {
		 Node newNode=new Node(x);
		if(l==0) {
			first=last=newNode;
		} else {
			newNode.prev=last;
			last.next=newNode;
			last=newNode;
		}
		l++;
	}
	
	
	public Node deque() {
		 
		Node temp=first;
		if(l==0) return null;
		
		if(l==1) {
			first=last=null;
			l--;
			return temp;
		}
		
		first=first.next;
		first.prev=null;
		temp.next=null;
		l--;
		
		return temp;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
