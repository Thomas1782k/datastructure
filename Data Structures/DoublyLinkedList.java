package com.ds.DoublyLinkedList;

import com.ds.LinkedList.LinkedList3.Node;

public class Dll {

	private Node head;
	private Node tail;
	private int l=0;
	
	public class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			super();
			this.value=value;
		}
	}
	
	public Dll(int value){
		Node newNode=new Node(value);
		head=tail=newNode;
		l=1;
	}
	
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}
	
	public Node getValue(int ind) {
		if(l==0) return null;
		Node temp=head;
		for(int i=0;i<ind;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public void append(int x) {
		Node newNode=new Node(x);
		if(l==0) {
			head=tail=newNode;
		} else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		l++;
	}
	
	public void prepend(int x) {
		Node newNode=new Node(x);
		if(l==0) {
			head=tail=newNode;
		} else {
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
		}
		l++;
	}
	
	public boolean removeLast() {
		if(l==0) return false;
		if(head==tail) {
			head=tail=null;
			l--;
			return true;
		}
		tail=tail.prev;
		tail.next=null;
		return true;
	}
	
	public boolean removeFirst() {
		if(l==0) return false;
		if(head==tail) {
			head=tail=null;
			l--;
			return true;
		}
		head=head.next;
		head.prev=null;
		return true;
	}
	
	public boolean setValue(int ind,int x) {
		
		if(ind<0||ind>l) return false;
		
		if(ind==0) {
			head.value=x;
			return true;
		}
		if(ind==l) {
			tail.value=x;
			return true;
		}
		
		getValue(ind).value=x;
		return true;
	}
	
	public boolean insert(int ind, int x) {
		
		if(ind<0||ind>l) return false;
		if(ind==0) {
			prepend(x);
			l++;
			return true;
		}
		if(ind==l) {
			append(x);
			l++;
			return true;
		}
		
		Node newNode=new Node(x);
		Node temp=getValue(ind);
		newNode.prev=temp.prev;
		temp.prev.next=newNode;
		newNode.next=temp;
		temp.prev=newNode;
		l++;
		
		return true;
	}
	
	public boolean delete(int ind) {
		if(ind<0||ind>l) return false;
		
		if(ind==0) {
			removeFirst();
			l--;
			return true;
		}
		
		if(ind==l) {
			removeLast();
			l--;
			return true;
		}
		
		Node temp=getValue(ind);
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		temp.next=temp.prev=null;
		l--;
		return true;
	}
	
	
}
