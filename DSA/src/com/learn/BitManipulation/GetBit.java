package com.learn.BitManipulation;

public class GetBit {

	public static void main(String[] args) {
		
		//get 3rd bit (position 2) of number n (n=0101)
		
		int a = 0b0101;
		System.out.println(a);
		
		//get position 2
		int position = 2;
		
		//Step 1 = BitMask
		int BitMask = 1<<position;
		System.out.println("Bitmask -> "+BitMask);	//has 4 bits XXXX
		//convert into 4 bits number
		String formatBinStr = Integer.toBinaryString(BitMask);
		System.out.println(String.format("%4s",formatBinStr).replace(' ','0'));
		
		//Step 2 = AND
		int newNum = (a&BitMask);
		String formatBinStr2 = Integer.toBinaryString(newNum);
		System.out.println(String.format("%4s",formatBinStr2).replace(' ','0'));
		
		//bits are counted from Right to Left
		//3rd bit is 1
	}

}
