package com.ds.BinarySearchTree;

import java.util.*;

public class DFS_Pre_Pos_Ino_Traverse {

	public static Node root;

	public class Node {
		public int value;
		public Node left;
		public Node right;

		Node(int value) {
			this.value = value;
		}
	}

	public boolean insert(int x) {
		Node newNode = new Node(x);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		if (newNode.value == temp.value)
			return false;

		while (true) {
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}

	public static ArrayList<Integer> dfsPre(Node root) {
		ArrayList<Integer> res = new ArrayList<>();

		class Traverse {
			Traverse(Node t) {
				res.add(t.value);
				if (t.left != null) {
					new Traverse(t.left);
				}
				if (t.right != null) {
					new Traverse(t.right);
				}
			}
		}

		new Traverse(root);
		return res;
	}

	public static ArrayList<Integer> dfsPos(Node root) {
		ArrayList<Integer> res = new ArrayList<>();

		class Traverse {
			Traverse(Node t) {
				if (t.left != null) {
					new Traverse(t.left);
				}
				if (t.right != null) {
					new Traverse(t.right);
				}
				res.add(t.value);
			}
		}

		new Traverse(root);
		return res;
	}

	public static ArrayList<Integer> dfsIno(Node root) {
		ArrayList<Integer> res = new ArrayList<>();

		class Traverse {
			Traverse(Node t) {
				if (t.left != null) {
					new Traverse(t.left);
				}
				res.add(t.value);
				if (t.right != null) {
					new Traverse(t.right);
				}
			}
		}

		new Traverse(root);
		return res;
	}

	public static void main(String[] args) {
		DFS_Pre_Pos_Ino_Traverse bfs = new DFS_Pre_Pos_Ino_Traverse();

		bfs.insert(14);
		bfs.insert(12);
		bfs.insert(27);
		bfs.insert(9);
		bfs.insert(13);
		bfs.insert(26);
		bfs.insert(46);

		System.out.println(dfsPre(root));
		System.out.println(dfsPos(root));
		System.out.println(dfsIno(root));

	}

}
