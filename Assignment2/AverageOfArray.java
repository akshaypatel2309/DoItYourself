package Assignment2;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the Elements of Array: ");
		int n = s.nextInt();
		
		int sum = 0;
		int[] a = new int[n];
		
		System.out.println("Enter Element: ");
		
		for(int i = 0;i<n;i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		
		double avg = (double)sum/a.length;
		System.out.println("The Average of the given Array is: "+avg);
	}
}
