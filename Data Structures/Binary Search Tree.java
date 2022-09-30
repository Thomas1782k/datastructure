package com.ds.BinarySearchTree;


public class BinaryST {

	 public Node root;
	
	public class Node{
		public int value;
		public Node left;
		public Node right;
		
		Node(int value){
			this.value=value;
		}
	}
	
	public boolean insert(int x) {
		Node newNode=new Node(x);
		if(root==null) {
			root=newNode;
			return true;
		}
		Node temp=root;
		if(newNode.value==temp.value) return false;
		
		while(true) {
			if(newNode.value<temp.value) {
				if(temp.left==null) {
					temp.left=newNode;
					return true;
				}
				temp=temp.left;
			} else {
					if(temp.right==null) {
						temp.right=newNode;
						return true;
					}
					temp=temp.right;
		}
	}
}
	
	public boolean contains(int x) {
		if(root==null) return false;
		Node temp=root;
		while(temp!=null) {
			if(x<temp.value) {
				temp=temp.left;
			} else if(x>temp.value) {
				temp=temp.right;
			} else {
				return true;
			}
		}
		return false;
	}
}
