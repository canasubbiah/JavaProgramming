package org.isgn;

public class Q14ReverseOfString {
	public static void main(String[] args) {
		
		String s = "Rajalakshmi";
		String res = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			res= res+s.charAt(i);
			
		}
		
		System.out.println(res);
		System.out.println(s);
		
	}

}
