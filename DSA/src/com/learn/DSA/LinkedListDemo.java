package com.learn.DSA;

//import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Assume we dont have java util
		//LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedListImpl list = new LinkedListImpl();
		
		/*
		list.add(5);
		list.add(9);
		
		System.out.println(list);
		list.addFirst(10);
		System.out.println(list);
		list.addLast(60);
		System.out.println(list);

		//index = 2
		System.out.println(list.get(2));
		
		//print head
		System.out.println(list.peek());
		*/
		
		//OWN LINKEDLIST IMPLEMENTATION
		list.add(5);
		list.add(9);
		list.add(6);
		list.printValues();
		
		list.addFirst(12);
		
		list.printValues();
		
		list.delete(5);
		list.printValues();
	}

}
