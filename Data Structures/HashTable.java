package com.ds.HashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {
	
	private int size=7;
	private Node[] dataMap;
	
	class Node{
		
		public String key;
		public int value;
		public Node next;
		
		public Node(String key, int value) {
			super();
			this.key = key;
			this.value = value;
		}
	}
	
	public HashTable() {
		dataMap=new Node[size];
	}
	
	public void printTable() {
		for(int i=0;i<size;i++) {
			System.out.println(i+":");
			Node temp=dataMap[i];
			while(temp!=null) {
				System.out.println("  {"+temp.key+"= "+temp.value+" }");
				temp=temp.next;
			}
		}
	}
	
	private int hash(String key) {
		int hash=0;
		char[] keyChar=key.toCharArray();
		for(int i=0;i<keyChar.length;i++) {
			int ascii=keyChar[i];
			hash=(hash+ascii*23)%dataMap.length;
		}
		return hash;
	}

	public void set(String key,int x) {
		int index=hash(key);
		Node newNode=new Node(key,x);
		if(dataMap[index]==null) {
			dataMap[index]=newNode;
		}else {
			Node temp=dataMap[index];
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	
	public int get(String key) {
		int ind=hash(key);
		Node temp=dataMap[ind];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp=temp.next;
		}
		return 0;
	}
	
	
	public HashMap<String, Integer> all(){
		HashMap<String,Integer> allKeys=new HashMap();
		for(int i=0;i<dataMap.length;i++) {
			Node temp=dataMap[i];
			while(temp!=null) {
				allKeys.put(temp.key, temp.value);
				temp=temp.next;
			}
		}
		return allKeys;
	}
}
