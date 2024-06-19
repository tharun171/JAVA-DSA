package com.learn.DSA.Recursion;

public class RecursionFactorial {
	
	static int fact = 1;
	public static Integer GetFactorial(Integer num)
	{
		if(num == 0)
		{
			return 1;
		}
		if(num == 1)
		{
			return fact;
		}
		else
		{
			fact = fact * num;
			GetFactorial(num-1);
		}
		return fact;
	}

	public static void main(String[] args) {
		
		System.out.println(GetFactorial(6));

	}

}
