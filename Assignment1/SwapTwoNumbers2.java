import java.util.Scanner;

public class SwapTwoNumbers2 {
	
	public static void main(String[]args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter First Number(A): ");
	    int a = sc.nextInt();
	    System.out.println("Enter Second Number(B): ");
	    int b = sc.nextInt();
	    
	    a = a * b;
	    b = a / b;
	    a = a / b;
	    
	    System.out.println("After Swapping: "+"A= "+a+" and B= "+b);


	}

}
