package String;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String x="Keep";
		String y="Peek";
		Boolean status=false;
		if (x.length()==y.length()) {
			 x = x.toLowerCase();
			 y= y.toLowerCase();
			 char[] x1 = x.toCharArray();
			 char[] y1 = y.toCharArray();
			 Arrays.sort(x1);
			 Arrays.sort(y1);
			 if (Arrays.equals(x1, y1)) {
				 status=true;	
			}else {
				status=false;
			}
			 if (status==true) {
				 System.out.println("ANAGRAM");
				
			}else {
				 System.out.println("NOT A ANAGRAM");
		}
		}
		
	}

}
