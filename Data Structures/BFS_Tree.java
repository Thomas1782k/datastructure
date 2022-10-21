package com.ds.BinarySearchTree;

import java.util.*;

import com.ds.BinarySearchTree.BinaryST.Node;

public class BFS_Tree {

	 public static Node root;
		
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
		
		
		static ArrayList<Integer> bfsTraverse() {
			Node currNode=root;
			Queue<Node> q=new LinkedList<>();
			ArrayList<Integer> res=new ArrayList<>();
			if(currNode==null) return null;
			q.add(currNode);
			while(q.size()>0) {
				currNode=q.remove();
				res.add(currNode.value);
				if(currNode.left!=null) {
				q.add(currNode.left);
				}
				if(currNode.right!=null) {
					q.add(currNode.right);
					}
			}
			return res;
		}
		
		
	public static void main(String[] args) {
		BFS_Tree bfs=new BFS_Tree();
		
		bfs.insert(14);
		bfs.insert(12);
		bfs.insert(27);
		bfs.insert(9);
		bfs.insert(13);
		bfs.insert(26);
		bfs.insert(46);
		
		System.out.println(bfsTraverse());

	}

}
