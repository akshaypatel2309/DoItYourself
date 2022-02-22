import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[]args) {
		
	

	Scanner sc =  new Scanner(System.in);
	System.out.println("Please Enter the Number: ");
	int n = sc.nextInt();
	//Method 1
	
	  while(n>0) { 
	  int remainder = n%10;
	 
	  System.out.print(remainder);
	  
	  n = n/10; 
	  }
	}
}
