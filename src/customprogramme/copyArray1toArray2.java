package customprogramme;

public class copyArray1toArray2 {

	public static void main(String[] args) {
		
		 int [] arr1 = new int[]{2, 10, 3, 15, 5}; 
		 int[] arr2 = new int[arr1.length];
	       
		 for(int i=0;i<arr1.length;i++) {
			 arr2[i]=arr1[i];
		 }
		 
		 for(int i=0;i<arr2.length;i++) {
		 
		 System.out.print(arr2[i]+" ");
		 }   
	         
		 }        
	        
	}

