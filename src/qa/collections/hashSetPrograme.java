package qa.collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetPrograme {

	public static void main(String[] args) {
		
	HashSet<String> fruitSet = new HashSet<>();
	fruitSet.add("mango");
	fruitSet.add("mango");
	fruitSet.add("cucumber");
	
	//iterate inside the array
	Iterator<String> it = fruitSet.iterator();
	
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	//took specific value
	for ( String fruit : fruitSet) {
		System.out.println(fruit);
	}
	
	System.out.println(fruitSet);
	}
}


