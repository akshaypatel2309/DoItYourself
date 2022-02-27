package Assignment2;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		
		int arr1[] = {21,47,48,36,7,9,11};
		int arr2[] = {22,49,47,1,11,39,98,109};
		
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println("Intersection of two arrays : " + arr2[j]);
				}
			}
		}
	}
}
