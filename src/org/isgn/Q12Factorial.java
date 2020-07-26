package org.isgn;

public class Q12Factorial {
	public static void main(String[] args) {

		int n = 8, fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial of a number is "+fact);
	}
}
