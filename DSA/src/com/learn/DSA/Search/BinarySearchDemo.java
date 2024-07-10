package com.learn.DSA.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchDemo {
	
	public static int binaryFunc(int start,int stop,int target,List<Integer> list)
	{
		if(start<=stop)
		{
			int mid = (start+stop)/2;
			System.out.println("mid "+mid);
			if(list.get(mid) == target)
			{
				System.out.println("target found at index "+mid);
				return mid;
			}
			else if(target > list.get(mid))
			{
				start = mid+1;
				stop = list.size()-1;
				return binaryFunc(start, stop, target, list);
			}
			else
			{
				start = 0;
				stop = mid;
				return binaryFunc(start, stop, target, list);
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,18,23,32,43,56,62,78));
		System.out.println("Before Sorting: "+list);
		
		int target = 56;
		System.out.println("target: "+target);
		System.out.println("target found at index "+binaryFunc(0,list.size(),target,list));
		//binaryFunc(0,list.size(),target,list);
	}
}
