package customprogramme;

public class SmallesttNoInArray {

	public static void main(String[] args) {
		
		 int [] arr = new int [] {5,6,3,9,25,234,7,2};  
	        
		 int min = arr[0];  
	        //Loop through the array  
	        for (int i = 0; i < arr.length; i++) {  
	            //Compare elements of array with min  
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
	        System.out.println("Smallest element present in given array: " + min);  
	    }  
	}


