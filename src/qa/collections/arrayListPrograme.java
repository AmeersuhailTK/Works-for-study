package qa.collections;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.stream.events.Namespace;

public class arrayListPrograme {
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("Ameer");
		nameList.add("Suhail");
		nameList.add("Ameer");
		nameList.add("mobile");
		
		// fetch single values in arrayList
		for (int i = 0; i < nameList.size(); i++) {
		    if (nameList.get(i).equals("mobile")) {
		        System.out.println(nameList.get(i));
		    }
		    
		}

		
//		name.remove(1);
//		name.set(1, "Jafar"); //value updation
		
		
		System.out.println(nameList);
	
		
		                               // method inside the array()
		ArrayList<String> testList = new ArrayList<>(
		Arrays.asList("test1","test2","test3"));
		
		System.out.println(testList);
	}
}
