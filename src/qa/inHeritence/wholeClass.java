package qa.inHeritence;

public class wholeClass {
	
	
	void sound1() {
		
			System.out.println("dog barks");
	}
	void sound2() {
		System.out.println("cat meow");
	}
	void sound() {
		
		System.out.println("animal makes sound");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creation object
		Animals a;
		wholeClass b;
		
		a = new Dog();
		a.sound();
		
		a = new Cat();
		a.sound();
		
		a = new Animals();
		a.sound();
		
		
		b = new wholeClass();
		b.sound2();
		b.sound1();
		b.sound();
		
		

	}

}
