package com.DataStructures;

public class ListNode {
	
	
	private int data;
	private ListNode next;
	
	ListNode(int data)
	{
		this.data=data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	
	public void setNext(ListNode next)
	{
		this.next=next;
	}
	
	public int getData()
	{
		return this.data;
	}
	public ListNode getNext()
	{
		return this.next;
	}
}


