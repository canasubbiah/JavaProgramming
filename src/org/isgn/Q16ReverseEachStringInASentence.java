package org.isgn;

public class Q16ReverseEachStringInASentence {
	public static void main(String[] args) {
		
		String str = "Welcome to java class";
		String[] sp = str.split(" ");
		String res="";
		
		for (String s : sp) {
			
			String rev="";
			for(int i =s.length()-1; i>=0; i--) {
				rev=rev+s.charAt(i);
			}
			
			res = res+rev+" ";
			
		}
		
		System.out.println(res);
	}

}
