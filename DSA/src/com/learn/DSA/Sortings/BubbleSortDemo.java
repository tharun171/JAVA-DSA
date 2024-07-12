package com.learn.DSA.Sortings;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args)
	{
		
		int n[] = {12,2,10,5,8};
		//heavy element pushed to last at each iteration
		//side by side comparison of elements at each iteration
		System.out.println("Bubble sort->");
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(n));
		
		
		for(int i=0;i<n.length-1;i++)
		{
			//coz last values will be sorted at each iteration
			for(int j=0;j<n.length-i-1;j++)
			{
				//Change to < to get descending order
				if(n[j] > n[j+1])
				{
					int temp = n[j+1];
					n[j+1] = n[j];
					n[j] = temp;
				}
			}
			System.out.println("Sorted at iteration "+i+" "+Arrays.toString(n));
		}
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(n));
	}
}
