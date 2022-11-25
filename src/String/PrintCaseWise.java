package String;

public class PrintCaseWise {
	public static void main(String[] args) {
		String s="SANdy@281093";
		String lower="", upper="", special="", number="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int x=c;
			if (x>=48 && x<=57) {
				number=number+c;	
			}
			else if (x>=65 && x<=90) {
				upper=upper+c;
			}
			else if (x>=97 && x<=122) {
				lower=lower+c;
			}
			else {
				special=special+c;
			}
				
	}	
		System.out.println(s);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(number);
		System.out.println(special);
	}		
		

}
