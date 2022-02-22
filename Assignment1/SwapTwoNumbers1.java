import java.util.Scanner;

public class SwapTwoNumbers1 {
	public static void main(String args[]) {
        int A, B;
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Integer(A)");
        A = sc.nextInt();
        System.out.println("Enter Second Integer(B)");
        B = sc.nextInt();
         
        A = A + B;
        B = A - B;
        A = A - B;
 
        System.out.println("After Swapping");
        System.out.println("A = " + A + "\nB = " + B);
    }

}
