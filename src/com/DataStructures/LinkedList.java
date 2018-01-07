package com.DataStructures;

public class LinkedList {
	
	private int length=0;
	
	ListNode head;
	
	
	public ListNode getHead()
	{
		return head;
	}
	
	
	public void insertAtBegin(ListNode node)
	{
		node.setNext(head);
		
		head=node;
		length++;
		
		
	}
	public LinkedList()
	{
		length=0;
	}
	
	
	 
	
	public int getLength()
	{
		
		
		
//		ListNode current =head;
//		while (current!=null)
//		{
//			length++;
//			current=current.getNext();
//			
//		}
		
		return length;
	}

}
