package qa.interfaceClass;

import qa.inHeritence.childClass;

public interface Main {
	
	public static void main(String[] args) {
		
		
		//call classes rather interface
		Child cd = new Child();
		cd.sleep();
		cd.sound();
		cd.colour();
	}

}
