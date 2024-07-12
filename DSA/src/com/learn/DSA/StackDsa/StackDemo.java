package com.learn.DSA.StackDsa;

public class StackDemo {

	public static void main(String[] args) {


		//Stack<Integer> st = new Stack<Integer>();
		
		//Stack Own Implementation
		StackImpl st = new StackImpl();
		st.push(10);
		st.push(12);
		//Pop - gets last added element and removes it 
		//removes 12 here
		System.out.println(st.pop());
		st.push(6);
		st.push(18);
		
		//we have size as 5
		//if given more than 5 throws {overflow error}
		st.push(10);
		st.push(12);
//		st.push(6);
//		st.push(18);
		
		//System.out.println(st);
		st.printStack();
		
		//gets last element
		System.out.println("peek "+st.peek());
		
		//System.out.println(st);
		st.printStack();
		
	}

}
