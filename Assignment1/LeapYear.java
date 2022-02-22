import java.util.Scanner;

public class LeapYear {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Year: ");
		int year = sc.nextInt();
		
		if( year % 400 == 0 )
		{
			System.out.println(+year+" is a Leap year");
		}else
		{
		System.out.println(+year+" is not a Leap Year");
		}
	}
}
