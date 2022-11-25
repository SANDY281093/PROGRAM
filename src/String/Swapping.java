package String;

public class Swapping {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
/*		with using third variable c
		int c=b; b=a; a=c;*/
		

		
//		without using third variable c
	//	b=a; 
		b=b-a;
		a=a+a;
		System.out.println("After swapping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
	}

}
