package qa.loop;

import java.util.Scanner;

public class BreakandContinuestate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for (int num = 0; num <=10; num++) {
			//specify the break point here
			//if (num==6) {
				//break;
				
				// skip the specific num
				//continue;
				
				
//			}
//		
//			System.out.println(num);
//		}
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		int number = 1;  //initialize with any value except 0
		
		while (number <= 10) {
			System.out.print("enter a number(above 10 to stop): ");
			number = scanner.nextInt();
		}
		
		System.out.println("loop stopped!");
		
	}
	

}