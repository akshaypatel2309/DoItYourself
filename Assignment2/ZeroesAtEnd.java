package Assignment2;

public class ZeroesAtEnd {
	public class MoveAllZeroes {
		 
	     public static void zeroes(int[] a) {
	 
	         int l = a.length;
	         int count = 0;
	 
	         
	         for(int i = 0; i < l; i++) {
	             if(a[i] != 0) {
	                a[count++] = a[i];
	              }
	          }
	 
	          while(count < l) {
	             a[count++] = 0;
	          }
	         
	          for(int j = 0; j < l; j++) {
	             System.out.print(a[j] + " ");
	          }
	     }
	 
	 
	   public static void main(String[] args) {
	 
	        int a[] = {5,0,0,6,7,84,100,0,32};
	        zeroes(a);
	    }
	}

}
