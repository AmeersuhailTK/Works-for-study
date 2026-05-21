package qa.method;


public class callMethode {
	
	//nothing return
	void printmethod() {
		System.out.println("print method");
	}
	//data type new methodename
	int sumofnum() {
		return 10+10;
		
	}
	String smethode() {
		String name = "Ameer";
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.sqrt(625));
		
		//calss  objectname = new class;
		callMethode d = new callMethode();
	
		
		//objectname.methodename();
		d.printmethod();
		
		//store data to same type(int) classobjectname = oldobjectname.methode
		int a = d.sumofnum();
		System.out.println(a);
		
		// data type for store new name variable = classobject.stringmethode();
		String w = d.smethode();
		System.out.println(w);
		

	}

}
