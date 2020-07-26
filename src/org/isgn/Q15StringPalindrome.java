package org.isgn;

public class Q15StringPalindrome {
	
	public static void main(String[] args) {
		

		String s = "malayalam";
		String res = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			res = res+s.charAt(i);
		}
		
		if(s.equals(res)) {
			System.out.println("The given string is a palindrome: "+res);
		}
		else {
			System.out.println("The given string is not a palindrome: "+res);
		}
	}
	
	

}
