package com.learn.BitManipulation;

public class ClearBit {

	public static void main(String[] args) {
		
		//clear the 3rd bit (position =2) of number n (0101)
		
		//clearing bit = replaces the bit with 0
		int a = 0b0101;
		System.out.println(a);
		int b = 5;
		System.out.println(
				String.format("%4s",Integer.toBinaryString(b)).replace(' ','0'));
		
		
		
		int position = 2;
		//BitMask
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
        int newNum = (notOper & a);
        String formatBinStr2 = Integer.toBinaryString(newNum);
		System.out.println("cleared 2nd position(3rd bit) "+String.format("%4s",formatBinStr2).replace(' ','0'));

		
	}

}
