package org.isgn;

public class Q17CapitalLetterOfEachWord {
	public static void main(String[] args) {

		String s = "i love you raji";
		
		String res ="";
	
		String[] sp = s.split(" ");
		
		for (String str : sp) {
			
			char c = str.charAt(0);
			String sub = str.substring(1);
			
			res = res+ Character.toUpperCase(c)+sub+" ";
			
		}
		
		System.out.println(res);
		
		 
		}
}
