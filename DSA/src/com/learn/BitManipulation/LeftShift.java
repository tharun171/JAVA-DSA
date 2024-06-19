package com.learn.BitManipulation;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 5;  //5=0101
		//System.out.println(a<<1);
		System.out.println(0b0101);
		//Leftshift by 1 position
		int leftshifted = a<<1;
		String formatString1 = Integer.toBinaryString(leftshifted);
		System.out.println(
				"left shift by 1 "+
		String.format("%4s", formatString1).replace(' ', '0'));

		//0110
		//add 0b to the 0110 at front
		int b = 0b0110;
		System.out.println(b);
		//0110 = 6
		int leftshifted2 = b<<1;
		String formatString2 = Integer.toBinaryString(leftshifted2);
		System.out.println(
				"left shift by 1 "+
		String.format("%4s", formatString2).replace(' ', '0'));
		
	}

}
