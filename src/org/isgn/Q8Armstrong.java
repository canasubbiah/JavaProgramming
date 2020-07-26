package org.isgn;

public class Q8Armstrong {
	public static void main(String[] args) {
		
		int num = 165, rem=0, res=0;
		
		int n=num;
		
		while(num>0) {
			
			rem = num%10;
			res = res+(rem*rem*rem);
			num = num/10;
		}
		
		if(n==res) {
			System.out.println("Given number is Armstrong number "+res);
		}
		else {
			System.out.println("Given number is not Armstrong number "+res);
		}
		
	}

}
