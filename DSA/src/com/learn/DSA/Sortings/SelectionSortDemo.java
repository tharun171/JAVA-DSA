package com.learn.DSA;

import java.util.Arrays;

public class SelectionSortDemo{

	public static void main(String[] args)
	{
		System.out.println("Selection Sort->");
		int n[] = {7,8,3,1,2};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(n));
		
		for(int i=0;i<n.length;i++)
		{
			int smallest = i;
			for(int j=i+1;j<n.length;j++)
			{
				//change it to < to get descending order
				if(n[smallest] > n[j])
				{
					smallest = j;
				}
			}
			int temp = n[i];
			n[i] = n[smallest];
			n[smallest] = temp;
			System.out.println("iterating at "+i+" "+Arrays.toString(n));
		}
		
		System.out.println("after Sorting");
		System.out.println(Arrays.toString(n));
		
	}
}
