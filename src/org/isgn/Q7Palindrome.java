package org.isgn;


//121 ------ 121 (reverse) --> Yes palindrome
//15151 -------15151(reverse) ---> Yes Palidrome

public class Q7Palindrome {
public static void main(String[] args) {
		
		
		int num = 15151, rem=0, res=0;
		int n =num;
		
		while(num>0) {
			rem = num%10;
			res = (res*10)+rem;
			num = num/10;
		}
		if(n==res) {
			System.out.println("The given number is Palindrome "+res);
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
}
