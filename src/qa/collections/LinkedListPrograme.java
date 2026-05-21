package qa.collections;

import java.util.LinkedList;

public class LinkedListPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> citieList = new LinkedList<>();
		
		citieList.add("Kochi");
		citieList.add("Koillam");
		citieList.add("kozhikkode");
		citieList.add("kollam");
		
		System.out.println(citieList);
		
		for (String n : citieList) {
		    if (n.equals("kollam")) {
		        System.out.println(n);
		    
			}
		}


	}

}
