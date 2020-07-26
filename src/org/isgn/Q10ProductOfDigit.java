package org.isgn;

public class Q10ProductOfDigit{
	public static void main(String[] args) {
		int num=54899842, rem=0,res =1;
		
		while(num>0) {
			rem = num%10;
			res= res*rem;
			num=num/10;
		}
		
		System.out.println("Product Of a digit is "+res);
	}

}
