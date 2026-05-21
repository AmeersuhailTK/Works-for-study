package qa.loop;


public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prime =13;
		boolean isprime=true;
		
		for (int i = 2; i < prime; i++) 
		{
			if (prime % i==0)
			{
			isprime=false;
			System.out.println(isprime);
			break;
			}
			
		}System.out.println(isprime);

	}

}
