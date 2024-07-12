package com.learn.DSA.StackDsa;


public class StackImpl {
	
	//stack using array
	private int[] arr = new int[5];
	int top;
	int size;
	
	public StackImpl()
	{
		size = arr.length;
		top = -1;
	}
	
	public void push(int data)
	{
		//top++;
		if(top<size)
			//pre-incrementing
			arr[++top] = data;
		else
			System.out.println("Stack overflow error");
	}
	
	public int pop()
	{
		if(top>-1)
			return arr[top--];
		else
			System.out.println("Stack underflow error");
		return 0;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public void printStack()
	{
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
