package qa.array;


public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr; //arr declaration
		arr = new int[5]; //size
		arr[0] =10;
		arr[1] =20;
		
		
		
		System.out.println("arry "+arr[0]+","+ arr[1]);
		
		
		
		int [] numbers = {12,34,45,56,67};
		
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			System.out.println(sum);
		}
		
		double[] num = {10,30,20};
		
		for (double n : num) //for each mainly for array
		{
		System.out.println(n);
		}
		
         String[] student = {"ameer", "suhail", "ramesh", "satheesh"};
         System.out.println(student[2]);
         
        for (String s: student) {
			System.out.println("students: "+s);
		}

		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
		
		
		// minimum and maximum value find in an array
		int[] value = {5,34,67,18};
		int max = value[0];
		
		for (int i = 0; i < value.length; i++) {
			//max
			if (value[i] > max) {
				max = value[i];
			}
		}System.out.println(max);
		
		//min
//		if (value[i] < max) {
//			max = value[i];
//		}
//	}System.out.println(max);
	}
}

		
		
	

