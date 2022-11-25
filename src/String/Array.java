package String;

public class Array {
	public static void main(String[] args) {
		int a[]= {5,1,4,3,2};
		System.out.println("before sorting");
		for (int i : a) {
			System.out.println(i);	
		}
		                                  for (int i = 0; i < a.length; i++) {
			                                   for (int j =i+1; j < a.length; j++) {
				                                    if (a[i]>a[j]) {
					                                    int temp=a[i];
					                                    a[i]=a[j];
					                                    a[j]=temp;	
				                                      }
				
			                                    }
			
		                                   }
		System.out.println("after sorting");
		for (int i : a) {
			System.out.println(i);	
		}
		System.out.println("lowest number is "+a[0]);
		System.out.println("highest number is "+a[4]);
	
}

}
