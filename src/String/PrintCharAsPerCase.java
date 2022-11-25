package String;

public class PrintCharAsPerCase {
	public static void main(String[] args) {
		String s="ABCxyz@$%123";
		String upper="",lower="",number="",special="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				upper=upper+c;
			}else if (Character.isLowerCase(c)) {
				lower=lower+c;
				
			}else if (Character.isDigit(c)) {
				number=number+c;
				
			} else{
               special=special+c;
			}
			
		}
		System.out.println(s);
		System.out.println("Upper case in string is "+upper);
		System.out.println("lower case in string is "+lower);
		System.out.println("number in string  is "+number);
		System.out.println("special chaacter in string  is "+special);
	}

}
