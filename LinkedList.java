package com.ds.LinkedList;

public class LinkedList {

	private Node head;
	private Node tail;
	private int len=0;
	
	 public class Node {

		 public int value;
		Node next;
		
		public Node(int value) {
			super();
			this.value = value;
		}
	}
	
	public LinkedList(int value)
	{
		Node newNode=new Node(value);
		head=newNode;
		tail=newNode;
		len=1;
	}
	
	public void getHead() {
		System.out.println("Head: "+head.value);
	}
	
	public void getTail() {
		System.out.println("Tail: "+tail.value);
	}
	
	public void getLength() {
		System.out.println("Length: "+len);
	}
	
	//print list
	public void printList()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			
			temp=temp.next;
		}
		
	}
	
	//append
	 public void append(int value) {
	        Node newNode = new Node(value);
	        if (len == 0) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	        len++;
	    }
	
	//prepend
	public void prepend(int value)
	{
		Node newNode=new Node(value);
		if(len==0)
		{
			head=newNode;
			tail=newNode;
		} else {
			newNode.next=head;
			head=newNode;
		}
		len++;
	}
	
	//remove last

	   public Node removeLast() {
	        if (len == 0) return null;
	        Node temp = head;
	        Node pre = head;
	        while(temp.next != null) {
	            pre = temp;
	            temp = temp.next;
	        }
	        tail = pre;
	        tail.next = null;
	        len--;
	        if (len == 0) {
	            head = null;
	            tail = null;
	        }
	        return temp;
	    }
	
	//remove front
	   public Node removeFront() {
	        if (len == 0) return null;
	        Node temp = head;   
	       head=head.next;
	       temp.next=null;
	       len--;
	       if (len == 0) {
	            //head=null;
	            tail = null;
	        }

	        return temp;
	    }
	   
	//get by index
	   public Node get(int index)
	   {
		   if(index<0||index>len)
			   return null;
		   Node temp=head;
		   for(int i=0;i<index;i++)
		   {
			   temp=temp.next;
		   }
		   return temp;
		   
	   }
	   
	   //insert in particular index
	   public boolean insert(int ind,int val)
	   {
		   if(ind==0) {
			   prepend(val);
			   return true;
		   }
		    if(ind==len)
		   {
			   append(val);
			   return true;
		   }
		    if(ind<0||ind>len)
		    {
		    	return false;
		    }
		   Node newNode=new Node(val);
		   Node temp=get(ind-1);
		   newNode.next=temp.next;
		   temp.next=newNode;
//		   Node pre=head;		   
//		   for(int i=0;i<ind;i++)
//		   {
//			   pre=temp;
//			   temp=temp.next;
//		   }
//			   pre.next=newNode;
//			   newNode.next=temp;
		   
			   len++;
			   
			   return true;
	   }
	   
	   //set value
	   public boolean set(int ind,int val)
	   {
		   
		   Node temp=get(ind);
		   if(temp!=null)
		   {
		   temp.value=val;
		   return true;
		   }
			   return false;	   
	   }
	   
	   //remove
	   public boolean remove(int ind)
	   {
		   if(ind==0)
		   {
			   removeFront();
			   return true;
		   }
		   if(ind==len)
		   {
			   removeLast();
			   return true;
		   }
		   
		   Node pre=get(ind-1);
		   Node temp=pre.next;
		   
		   if(temp!=null) {
		   pre.next=temp.next;
		   temp.next=null;
		   len--;
		   return true;
		   }
		   		return false;   
	   }
	   
	   //reverse
	   
	   public void reverse()
	   {
		   Node temp=head;
		   head=tail;
		   tail=temp;
		   
		   Node after=temp.next;
		   Node before=null;
		   
		   for(int i=0;i<len;i++)
		   {
			   after=temp.next;
			   temp.next=before;
			   before=temp;
			   temp=after;
		   }
	   }   
}























