import java.util.Scanner;

public class lcmOfTwoNumbers {
	    public static void main(String[]args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("ENTER 1st NUMBER");
	        int num1=sc.nextInt();
	        System.out.println("ENTER 2nd NUMBER");
	        int num2=sc.nextInt();
	        int i;
	        for(i=1;i<=num1*num2;i++)
	        {
	            if(i%num1==0 && i%num2==0)
	            {
	                System.out.print("LCM : "+i);
	                break;
	            }
	        }

	    }
}
