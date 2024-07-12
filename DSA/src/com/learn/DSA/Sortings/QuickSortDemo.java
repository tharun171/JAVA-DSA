package com.learn.DSA.Sortings;

import java.util.Arrays;

public class QuickSortDemo {
	
	public static void quickSort(int low,int high,int[] arr)
	{
		if(low<high)
		{
			int pi = partition(low, high, arr);
			
			quickSort(low,pi-1, arr);
			quickSort(pi+1, high, arr);
		}
		
	}
	
	private static int partition(int low,int high,int[] arr)
	{
		int pivot = arr[high];
		System.out.println("arr high "+arr[high]+ high);
		int temp = 0;
		int i = low-1;
		for(int j=low;j<=high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		System.out.println(Arrays.toString(arr));
		return i+1;
	}

	public static void main(String[] args)
	{
		
		int[] arr = {5,62,2,3,111,81,4};
		int low = 0;
		int high = arr.length-1;
		quickSort(low,high,arr);
		
		System.out.println("final "+Arrays.toString(arr));
		
	}
}
