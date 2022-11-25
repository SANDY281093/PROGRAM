package String;

public class ReverseEachWord{
	public static void main(String[] args) {
		String s="Hai welcome to java class";
		String[] split = s.split(" ");
		String op="";
		for (String word : split) {
			String rev="";
			for (int i = word.length()-1; i>=0; i--) {
				char c = word.charAt(i);
				rev=rev+c;
			}
			
		op=op+rev+" ";
			
		}
		System.out.println(op);	
	}

}
