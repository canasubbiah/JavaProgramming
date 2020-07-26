package org.isgn;

public class Q6ReverseOfNumber {
	public static void main(String[] args) {
		
		
		int num = 12345, rem=0, res=0;
		
		while(num>0) {
			rem = num%10;
			res = (res*10)+rem;
			num = num/10;
		}
		System.out.println(res);
	}

}
