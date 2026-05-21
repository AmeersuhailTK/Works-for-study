package qa.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesSetprogramme {

	public static void main(String[] args) {

		        TreeSet<String> fruitSet = new TreeSet<>();

		        fruitSet.add("mango");
		        fruitSet.add("mango");     // duplicate, will be ignored
		        fruitSet.add("cucumber");
		        fruitSet.add("apple");
		        fruitSet.add("banana");
		        
		        System.out.println(fruitSet);

		        // print the TreeSet
		        
//		        System.out.println("TreeSet values:");
//		        for (String fruit : fruitSet) {
//		            System.out.println(fruit);
//		            
//		            System.out.println("TreeSet: " + fruitSet);
//
//		            // size()
//		            System.out.println("Size: " + fruitSet.size());
//
//		            // contains()
//		            System.out.println("Contains mango: " + fruitSet.contains("mango"));
//		            
//		            
//		         // iterator()
//		            System.out.println("\nUsing Iterator:");
//		        
//					Iterator<String> it = fruitSet.iterator();
//		            while (it.hasNext()) {
//		                System.out.println(it.next());
//		            }
//		            
//		         // remove()
//		            fruitSet.remove("banana");
//		            System.out.println("After remove(): " + fruitSet);
//		       
//		        }
		    }
}
