package Assignment2;

public class ZeroesAtStart {
	public static void main(String args[]) {
        
        int[] a = {1, 2, 0, 4, 0, 3, 0, 9, 0, 1, 0, 3, 0};

       
        int count = a.length - 1;

       
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[count] = a[i];
                count--;
            }
        }

        
        while (count >= 0) {
            a[count] = 0;
            count--;
        }

        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}



