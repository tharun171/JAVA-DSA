package com.learn.DSA.Sortings;

import java.util.Arrays;

public class MergeSortDemo {
	
	
	public static void mergeSort(int[] arr,int l,int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			
			//merging all at end
			merge(arr,l,mid,r);
		}
		System.out.println("final "+Arrays.toString(arr));
	}
	
	private static void merge(int[] arr,int l,int mid,int r)
	{
		//size of first left array
		int n1 = mid-l+1;
		//size of right array
		int n2 = r-mid;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int x=0;x<n1;x++)
		{
			leftArr[x] = arr[l+x];
		}
		for(int x=0;x<n2;x++)
		{
			rightArr[x] = arr[mid+1+x];
		}
		int i=0,j = 0;
		int k = l;
		while(i<n1 && j<n2)
		{
			if(leftArr[i]<= rightArr[j])
			{
				arr[k] = leftArr[i];
				i++;
			}
			else
			{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {8,5,9,1,6,7,2};
		
		System.out.println("Before sorting "+Arrays.toString(arr));
		
		mergeSort(arr,0,arr.length-1);
		
	}

}
