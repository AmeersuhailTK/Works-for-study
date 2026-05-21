package qa.inHeritence;

public class parentClass extends childClass{
	
	public void testqa()
	{
		 System.out.println("Prent class accessed");
	}
	public String stringCall() 
	{
		String name = "Ameer";
		System.out.println("name: "+name);
		return name;
	}
}
