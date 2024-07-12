package com.learn.DSA.Sortings;

import java.util.Arrays;

public class InsertionSortDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Insertion sort->");
		int n[] = {7,8,3,1,2};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(n));
		
	
		for(int i=0;i<n.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				//change this to > to get descending
				if(n[j] < n[j-1])
				{
					int temp = n[j-1];
					n[j-1] = n[j];
					n[j] = temp;
				}
			}
			System.out.println("Iteration "+i+" "+Arrays.toString(n));
		}
		
		System.out.println("Afetr sorting");
		System.out.println(Arrays.toString(n));
	}

}
