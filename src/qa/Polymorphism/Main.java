package qa.Polymorphism;


public class Main {
	
	//OVERLOADING
	
	//call the same main method with different parameters
	void calcu(int a, int b) {
		
		System.out.println("SUM: "+ (a+b));
	}
	void calcu(int a, int b, int c) {
		System.out.println("SUM: "+(a*b+c));
	}
	void calcu(int a, int b, String c) {
		System.out.println("SUM: "+ (a*b+c));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Main c = new Main();
		c.calcu(10, 23);
		c.calcu(20, 30);
		c.calcu(2, 5, 120);
		c.calcu(15, 32, 22);

	}
}
