import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number: ");
		int i = sc.nextInt();
		
		if(i%2==0) {
			System.out.println("This is an Even Number");
		}else {
			System.out.println("This is an Odd Number");

		}
	}

}
