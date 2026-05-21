package qa.constructor;

public class students {
	int id;
	String name;

	
	students() {
		//  constructor creation
		
		id =100;
		name = "Ameer";
			
	}
	//parametarised constructor
	 students(int i, String n){
		 id =i;
		 name= n;
		 
		 
		 }
	 Void display() {
		 System.out.println();
		 System.out.println("parametrised: "+id + " "  +name);
		 return null;
		
	}

}
