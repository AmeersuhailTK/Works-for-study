package qa.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListPrograme {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> name = new ArrayList<>();
		name.add("ameer");
		name.add("suhail");
		name.add("james");
		
		
		
		//name.remove(1);
		name.set(2, "anees");
		
		System.out.println(name);
		
		
		ArrayList<String> testList=new ArrayList<>(
				Arrays.asList("Test1","Test2","Test3"));
		
		System.out.println(testList);
	}

}
