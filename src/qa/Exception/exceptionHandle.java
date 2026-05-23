package qa.Exception;

public class exceptionHandle {

	public static void main(String[] args) {
		
		System.out.println("begins here");
		
		try {
			int a = 10;
			int b = 0;
		
			int result = a / b;
		
			System.out.println(result);
			
		} catch (Exception e) {
				System.out.println("Arithametical Exception "+e);
			
		}
		System.out.println("print void here");	
	}

}
