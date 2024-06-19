package com.learn.BitManipulation;

public class UpdateBit {

	public static void main(String[] args) {
		
		//update the 2nd bit(position =1) of number n to 1
		//if Bit is 0, change to 1
		//if Bit is 1, change to 0
		
		//For changing 1 to 0, use CLEAR BIT (Operation 0)
		//For changing 0 to 1, use SET BIT	(Operation 1)
		
		int n = 0b0101;
		System.out.println(n);
		
		int position = 1;
		//output should be 0111 to 0101
		//output should be 0101 to 0111
		//changed 0 to 1
		
		int operation = 1;
		//changing 1 to 0
		if(operation == 0)
		{
			int BitMask = 1<<position;
			String formatBinStr = Integer.toBinaryString(BitMask);
			System.out.println("BitMask "+
			String.format("%4s",formatBinStr).replace(' ','0'));
			
			
			//AND with NOT
			
			//first perform NOT
			int notOper = ~BitMask;
			// Print the binary result with formatting for full 32 bits
	        String formatBinString1 = String.format("%32s", Integer.toBinaryString(notOper)).replace(' ', '0');
	        System.out.println("Binary Compliment of a (32 bits): " + formatBinString1);
	        // Print the binary result with formatting for 4 bits (not meaningful for one's complement)
	        String shortBinaryString = formatBinString1.substring(28);
	        System.out.println("Binary Compliment of a (4 bits): " + shortBinaryString);
	        
	        //performing AND
	        int newNum = (notOper & n);
	        String formatBinStr2 = Integer.toBinaryString(newNum);
			System.out.println("cleared 2nd position(3rd bit) "+String.format("%4s",formatBinStr2).replace(' ','0'));
		}
		else
		{
			//BitMask
			int BitMask = 1<<position;
			String formatBinStr = Integer.toBinaryString(BitMask);
			System.out.println(String.format("%4s", formatBinStr).replace(' ','0'));
			
			//OR
			int newNum = (BitMask | n);
			String formatBinStr2 = Integer.toBinaryString(newNum);
			System.out.println(String.format("%4s", formatBinStr2).replace(' ','0'));
			
		}

	}

}
