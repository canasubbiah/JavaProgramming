package org.isgn;

public class RemoveDuplicatesfromString {
	public static void main(String[] args) {
//
//		String s = "java class";
//		
//		for(int i=0; i <s.length(); i++) {
//			char c = s.charAt(i);
//			System.out.println(c);
//		}
		
		
		
		String s = "raji i love you";
		
		String res ="";		
		
		String[] split = s.split(" ");
		
		for (String str : split) {
			
			Character charAt = str.charAt(0);
			String substring = str.substring(1);
			
			res = res+Character.toUpperCase(charAt)+substring+" ";
			
		}
		
		System.out.println(res);
	
	}
}
