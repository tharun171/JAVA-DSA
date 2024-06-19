package com.learn.DSA.Recursion;

public class FibonacciSeriesUptoN {
	
	
	public static void Func(int a,int b,int n)
	{
		if(n==0)
		{
			return;
		}
		int c = a+b;
		System.out.print(c+" ");
		//a = b;
		//b = c;
		Func(b,c,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(0+" "+1+" ");
		//-2 coz we already have 0 and 1
		//first 10 fibonacci series
		int n = 10;
		Func(0,1,n-2);
		
	}

}
