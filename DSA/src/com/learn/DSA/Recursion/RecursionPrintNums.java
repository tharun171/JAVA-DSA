package com.learn.DSA.Recursion;

public class RecursionPrintNums {
	
	
	public static void printNum(Integer num)
	{
		if(num==0)
		{
			return ;
		}
		else
		{
			System.out.println(num);
			printNum(num-1);
		}
	}

	public static void main(String[] args) {
		
		printNum(5);

	}

}
