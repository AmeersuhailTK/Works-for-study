package qa.interfaceClass;

class Child implements Parent{
	
	
	//all method should be implemented
	public void sound() {
		System.out.println("Dog called animal");
	}
	public int sleep() {
		System.out.println("Dog called ");
		return 0;
	}
	public double colour() {
		System.out.println("Dog called animal");
		return 0.0;
	}
}
