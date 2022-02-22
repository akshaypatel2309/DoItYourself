import java.util.Scanner;

public class FactUsingRecursion {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter The number: ");
        int num = sc.nextInt();
        long factorial = multiple(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiple(int num)
    {
        if (num >= 1)
            return num * multiple(num - 1);
        else
            return 1;
    }
}
