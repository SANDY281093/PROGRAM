package String;

public class PascalConversion {
	public static void main(String[] args) {
		String s="hai welcome to java class";
		String op="";
		String[] split = s.split(" ");
		for (String word : split) {
			char c = word.charAt(0);
			char upperCase = Character.toUpperCase(c);
			String substring = word.substring(1);
			op=op+upperCase+substring+" ";
		}
System.out.println(op);
	}
	
}
