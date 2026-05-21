package qa.collections;

import java.util.LinkedList;
import java.util.Queue;

import qa.loop.forEach;

public class QueueListPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q1 = new LinkedList<>();
		
		q1.add("persone1");
		q1.add("persone2");
		q1.add("persone3");
		q1.add("persone4");
		
		System.out.println(q1);
		
		// skip first value
		q1.poll();
		
		// see first value
		q1.peek();
		System.out.println(q1);
		
		for (String sq : q1) {
			System.out.println(sq);
		}
	}
}
