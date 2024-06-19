package com.learn.DSA.Recursion;

public class SumOfN_numbers {

	public static Integer Func(int start,int stop, int sum)
	{
		if(start>stop)
		{
			return sum;
		}
		sum = sum + start;
		System.out.println(sum);
		return Func(start+1,stop,sum);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Func(1,10,0));
	}

}
