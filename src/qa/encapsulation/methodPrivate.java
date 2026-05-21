package qa.encapsulation;

public class methodPrivate {
	
	private int salary; //initialise private class; inside public class 
	
	   public void setSalary(int sal) {
		   if (sal > 0) {
			salary = sal;
 		}
		   else {
			System.out.println("invalid");
		}
	   
	}
	   //2 method for return value
	   public int getSalary() {
		   return salary;
	   }
}
