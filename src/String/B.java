package String;
public class B {
	public static void main(String[] args) {
		String s="hai welcome to java class";
		String s1 = s.substring(0,3);
		String r="";
		for (int i = s1.length()-1; i >=0; i--) {
			char c = s1.charAt(i);
			r=r+c;	
		}
		char charAt = r.charAt(2);
		char upperCase = Character.toUpperCase(charAt);
		String substring = r.substring(0, 2);
		r=substring+upperCase;
		
		 String s2 = s.substring(4,11);
		 String r1="";
		for (int i = s2.length()-1; i >=0; i--) {
			char c = s2.charAt(i);
			r1=r1+c;	
		}
		String s3 = s.substring(12,14);
		String r2="";
		for (int i = s3.length()-1; i >=0; i--) {
			char c = s3.charAt(i);
			r2=r2+c;	
		}
		String s4 = s.substring(15,19);
		String r3="";
		for (int i = s4.length()-1; i >=0; i--) {
			char c = s4.charAt(i);
			r3=r3+c;	
		} 
        String s5 = s.substring(20,25); 
		String r4="";
		for (int i = s5.length()-1; i >=0; i--) {
			char c = s5.charAt(i);
			r4=r4+c;	
		}
		System.out.print(r+" "+r1+" "+r2+" "+r3+" "+r4);}
	}

