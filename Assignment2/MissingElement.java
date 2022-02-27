package Assignment2;

public class MissingElement {
	public static void main(String[] args) {
	
	
	int[] a = {1,2,3,4,5,6,7,9,10};
	
	int allElements = a.length+1;
	
	int total = (allElements)*(allElements + 1) / 2;
	
	int sum = 0;
	
	for(int i=0; i<a.length; i++) {
		sum = sum + a[i];
	  }
	System.out.println("The Misiing Element is: "+(total-sum));
   }
}
