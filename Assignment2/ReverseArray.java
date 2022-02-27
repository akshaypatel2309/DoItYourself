package Assignment2;

public class ReverseArray
{
	public static void main(String[] args)
	{  
         
        int [] a = new int [] {10,20,30,40,50};  
         
        System.out.println("Reversed Array: ");  

        for (int i = a.length-1; i >= 0; i--) 
        {  
            System.out.print(a[i] + " ");  
        }  
    }  

}
