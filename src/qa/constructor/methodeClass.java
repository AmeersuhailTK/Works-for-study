package qa.constructor;

public class methodeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nameClass n = new nameClass(); //object creation
		
		n.display();
		
		
		//parametrised constructor called
		students s1 = new students(101,"jhon");
		s1.display();
		students s2 = new students(102, "jafar");
		s2.display();
		
		 
		//constructor called
		students st = new students();
		
		System.out.println("-------constructor-----");
		System.out.println(st.id);
		System.out.println(st.name);
		

	}

}
