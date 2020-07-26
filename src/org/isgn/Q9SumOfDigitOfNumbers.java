package org.isgn;

public class Q9SumOfDigitOfNumbers {
	public static void main(String[] args) {
		
		int num=1453, rem=0, res=0;
		int n=num;
		
	while(num>0) {
		rem = num%10;
		res= res+rem;
		num= num/10;
	}
	System.out.println("Sum of Digit number of is "+res);
	}

}
