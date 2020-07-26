package org.isgn;

public class Q11DigitOfaNumber {
	public static void main(String[] args) {
		int num = 56990097, count=0;
		
		while(num>0) {
			count++;
			num = num/10;
			
		}
		
		System.out.println("Count of digits in a number: "+count);
	}

}
