import java.util.Scanner;

public class PositiveNegative {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number to check: ");
		int Number = sc.nextInt();
		
		if(Number<0) {
			System.out.println(+Number+" is a Negative Number");
		}else if(Number>0) {
			System.out.println(+Number+" is a Positive Number");
		}else {
			System.out.println("The Number is Zero");
		}
	}

}
