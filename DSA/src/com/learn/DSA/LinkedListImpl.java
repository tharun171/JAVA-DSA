package com.learn.DSA;

class Node
{
	//number - actual data
	int data;
	//linked list has address of next node
	Node next;
	
	public Node(int data)
	{
		this.data = data;
		next = null;
	}
	
}

public class LinkedListImpl{
	
	//every linked list will have a head node
	Node headNode = null;

	
	//Adding data to linked list
	public void add(int data)
	{
		System.out.println("inside add - adding "+data);
		//Constructor reference
		Node newNode = new Node(data);
		//current node
		Node currentNode = headNode;
		//assign head node when headNode is null
		//only first value should be head value
		if(headNode == null)
			headNode = newNode;
		else
		{
			//Iterating through all nodes
			//at last node we will have null for address
			//as no value for address will be there 
			while(currentNode.next != null)
				//we iterate to the last node
				{currentNode = currentNode.next;}
			//we assign last node address
			//as newNode
			currentNode.next = newNode;
		}
	}
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		//change our head
		//added first data will be our new head
		//assigning existing head to our node address
		newNode.next = headNode;
		//assigning newNode what we got as head node
		headNode = newNode;
	}
	
	public void delete(int data)
	{
		Node current = headNode;
		//current.next.data gives us next node data
		while(current.next!=null && current.next.data!=data)
		{
			current = current.next;
		}
		if(current.next != null)
		{
			//current.next.next
			//first next is data that's being deleted
			//The next is the data further to it
			current.next = current.next.next;
		}
	}
	
	public void printValues()
	{
		System.out.println("in print values");
		Node current = headNode;
		//list is not empty
		//if list is empty headNode will be null
		while(current != null)
		{
			System.out.println(current.data+" "+current.next);
			//Moving to next node
			current = current.next;
		}
		System.out.println("----------------");
	}
	
	
	
}
