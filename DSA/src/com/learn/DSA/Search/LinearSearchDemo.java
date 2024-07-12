package com.learn.DSA.Search;

public class LinearSearchDemo {

	static int step = 0;
	
	public static int linearSearch(int[] nums,int target)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			step++;
			if(nums[i]==target)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
	
		int nums[] = {1,18,23,32,43,56,62,78};
		int target = 7;
		
		int result = linearSearch(nums,target);
		
		if(result != -1)
			System.out.println("Element found at index: "+result);
		else
			System.out.println("Element not found");
		
		System.out.println(LinearSearchDemo.step);
	}

}
