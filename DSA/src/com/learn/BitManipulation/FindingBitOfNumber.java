package com.learn.BitManipulation;

public class FindingBitOfNumber {
	
	public static int calculate_bits(int number)
	{
		if (number == 0) 
		{
			return 1;  // Special case for 0
		} else 
		{
			return (int) Math.floor(Math.log(number) / Math.log(2)) + 1; 
		}
	}

	public static String getBinaryStringWithLeadingZeros(int number, int bitLength) {
		// Convert the number to binary string
		String binaryString = Integer.toBinaryString(number);
		//System.out.println("binary string "+binaryString);
		// Format the binary string to the specified length with leading zeros
		return String.format("%" + bitLength + "s", binaryString).replace(' ', '0');
	}

	public static void main(String[] args) {
		
		//int n1 = 2;
		//int n2 = 11;

		// Example usage
		//int bits1 = calculate_bits(n1);
		//System.out.println("bits1 "+bits1);
		//int bits2 = calculate_bits(n2);
		//System.out.println("bits2 "+bits2); //3 bits means 101

		for(int n=1;n<=13;n++)
		{
			int bits1 = calculate_bits(n);
			// This should print 0010 for the number 2
			System.out.println("Number: " + n + ", Bits: " + bits1 + ", Binary: " + getBinaryStringWithLeadingZeros(n, 4));  
		}

		
	}
}
