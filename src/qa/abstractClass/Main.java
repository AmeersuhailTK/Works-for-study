package qa.abstractClass;

public class Main {

	public static void main(String[] args) {
		//abstract method  
		
		// distinct override
		Dog d = new Dog();// dog inherited abstract method
		d.sound();
		//distinct override
		Cat c = new Cat();// cat inherited abstract method
		c.sound();
		
		// parent method inherited equally
		c.sleep();
		d.sleep();
		
		
		
		
	}

}
