package qa.method;

public class Assignment_array {

	    // Method to print all elements of an array
	    static void displayArray(String arr[]) {
//	        System.out.println("Array elements are:");
	        for(int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
	    }

	
	

	    public static void main(String[] args) {

	        // Array created inside main
	        String[] name = {"Ameer", "Suhail", "Ramesh", "Sathesh", "Anees"};

	        // Calling the method and passing the array
	        displayArray(name);
	    }
	}



