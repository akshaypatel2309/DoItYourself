import java.util.Scanner;

public class Factorial {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number: ");
		long Number = sc.nextInt();		
		long f=1;
		for(long i=1;i<=Number;i++)
		{
			f = f*i;
		}
		System.out.println("Factorial of "+Number+" is "+f);
	}
}
