import java.util.Scanner;

public class DigitsOfNumber {
	
	public static void main(String[]args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please Enter the Number: ");
		int n = sc.nextInt();
		//Method 1
		
		  while(n>0) { 
		  int remainder = n%10;
		 
		  System.out.println(remainder);
		  
		  n = n/10; 
		  }
		 
		//Method 2
//		String str = Integer.toString(n);
//		for(int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
	}
}
