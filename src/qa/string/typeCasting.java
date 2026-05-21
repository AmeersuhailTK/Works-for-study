package qa.string;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//implicit
		int num = 100;
		float floatnum = num;
		
		System.out.println(floatnum);
		
		double dnum = num;
		System.out.println(dnum);
		
		
		//explicit
		double a = 10.23;
		int convert =(int)a;
		System.out.println(convert);
		
		float fl = (float) a;
		System.out.println(fl);
		

	}

}
