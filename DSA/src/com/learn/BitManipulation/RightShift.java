package com.learn.BitManipulation;

public class RightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0b0101;	//5
		System.out.println(a);
		int rightshift = a>>1;
		String formatBinString = Integer.toBinaryString(rightshift);
		System.out.println("right shift by 1 -> "+
		String.format("%4s", formatBinString).replace(' ','0'));
		
		int b = 0b0110;
		System.out.println(b);
		int rightshift2 = b>>1;
		String formatBinString2 = Integer.toBinaryString(rightshift2);
		System.out.println("right shift by 1 -> "+
		String.format("%4s", formatBinString2).replace(' ','0'));
		
	}

}
