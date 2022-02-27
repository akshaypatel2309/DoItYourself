package Assignment2;
import java.util.Arrays;
import java.util.HashSet;

public class UnionUsingHashSet {
	public static void main(String[] args) {
	
	Integer [] a = {10,20,30,40,50};
	Integer [] b = {1,2,3,4,5,6};
	
	HashSet<Integer> s = new HashSet<>();
	
	s.addAll(Arrays.asList(a));
    
    s.addAll(Arrays.asList(b));
     
 System.out.println(s);
   

}
}
