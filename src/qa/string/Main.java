package qa.string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class object = new class 
		String a = new String("Dog");
		String b = new String("Dog");
		
		String c = "MOON";
		String d = "moon ";
		
		String name ="aMeErSuHaIl";
		System.out.println(name.length());
		System.out.println(name.charAt(1));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.substring(7));
		System.out.println(name.substring(1, 10));
		System.out.println(a.equals(b));
		System.out.println(c.equalsIgnoreCase(d));
		System.out.println(c.contains(d));
		System.out.println(name.indexOf("u"));
		System.out.println(d.replace("o","a"));
		System.out.println(d.trim());
		System.out.println(a.isEmpty());
		
		System.out.print(a==b); // refrence checking
		System.out.println(a.equals(b)); // value checking
		
	
		
	//Overcome java string mutablitty
	
		String st = "HELLO ";
		st = st.concat("WORLD");//object wise added value
		System.out.println(st);
		
		
		//How to Mutable JAVA string
		//class      object = new class
		StringBuilder sb = new StringBuilder("HELLO");
		sb.append(" WORLD");
		
		System.out.println(sb);
			
		//class     object = new class
		StringBuffer sf = new StringBuffer("HELLO");
		sf.append(" WORLD");
		
		System.out.println(sf);
			
		}

	}


