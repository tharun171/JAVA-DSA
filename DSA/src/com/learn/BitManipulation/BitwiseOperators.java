package com.learn.BitManipulation;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 6;
		
		//AND
		int c = a & b;
		// Convert the result to a 4-bit binary string
        String binaryString = Integer.toBinaryString(c);
        String formattedBinaryString = String.format("%4s", binaryString).replace(' ', '0');
        System.out.println(a+"&"+b+" -> AND :"+formattedBinaryString); //0001

        //OR
		int d = a | b;
		String formattedBinaryString2 = String.format("%4s",Integer.toBinaryString(d)).replace(' ', '0');
        System.out.println(a+"|"+b+" -> OR :"+formattedBinaryString2); //0111
        
        
        //XOR 
        int e = a^b;
        String formattedBinaryString3 = String.format("%4s",Integer.toBinaryString(e)).replace(' ', '0');
        System.out.println(a+"|"+b+" -> OR :"+formattedBinaryString3); //0111
        
        
        //Binary One's Compliment
        //int a = 5; // Binary: 00000000000000000000000000000101
        int f = ~a;
        System.out.println(f);
        // Print the binary result with formatting for full 32 bits
        String formattedBinaryString4 = String.format("%32s", Integer.toBinaryString(f)).replace(' ', '0');
        System.out.println("Binary Compliment of a (32 bits): " + formattedBinaryString4);
        // Print the binary result with formatting for 4 bits (not meaningful for one's complement)
        String shortBinaryString = formattedBinaryString4.substring(28);
        System.out.println("Binary Compliment of a (4 bits): " + shortBinaryString);
		
	}

}
