package qa.operator;

public class Unary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		boolean isenabled = true;
		
		a=110;
		System.out.println("a: "+a);
		// rel value
		
		b=++a;
		c=a;
		// value chenge when chenges applied
		System.out.println("b: "+b); //currentvalue shows if chenges dependent is post or pre designation 
		System.out.println("b: "+c); // updated values shows
		System.out.println("isenales: "+isenabled); //true
		System.out.println("isenales: "+!isenabled); //false
	}

}
//    check post and pre urinary operator 