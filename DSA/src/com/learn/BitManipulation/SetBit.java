package com.learn.BitManipulation;

public class SetBit {

	public static void main(String[] args) {
		
		//Set the 2nd bit (position = 1) of number n
		// n = 0101
		
		int a = 0b0101;
		System.out.println(a);
		
		//Right to left, position start with 0
		//setting 0101 to- 0111
		
		
		int position = 1;
		//BitMask
		int BitMask = 1<<position;
		String formatBinStr = Integer.toBinaryString(BitMask);
		System.out.println(String.format("%4s", formatBinStr).replace(' ','0'));
		
		//OR
		int newNum = (BitMask | a);
		String formatBinStr2 = Integer.toBinaryString(newNum);
		System.out.println(String.format("%4s", formatBinStr2).replace(' ','0'));
		
				
		

	}

}
