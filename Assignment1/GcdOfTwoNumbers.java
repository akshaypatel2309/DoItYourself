import java.util.Scanner;

public class GcdOfTwoNumbers {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 1st number: ");
		int a = sc.nextInt();
		System.out.println("Please enter the 2st number: ");
		int b = sc.nextInt();
		int Gcd=1;
		for( int i=1; i<=a && i<=b;i++ ) {
			if(a % i == 0 && b % i == 0)
				Gcd = i;
		}
		System.out.println("The GCD of "+a+" and "+b+ " is: "+Gcd);
	}
}
