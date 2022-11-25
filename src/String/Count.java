package String;

public class Count {
	public static void main(String[] args) {
		String s="SANdy@281093";
		int length = s.length();
		System.out.println("Total length of string is "+length);
		int lower=0, upper=0, special=0, number=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				upper++;
			} 
			else if (Character.isLowerCase(c)) {
				lower++;
				
			}
			else if (Character.isDigit(c)) {
				number++;
				
			}
			else{
				special++;
			}
		}
		System.out.println("Upper count is "+upper);
		System.out.println("lower count is "+lower);
		System.out.println("number count is "+number);
		System.out.println("special chaacter count is "+special);
		  
	
		
		
	}

}
