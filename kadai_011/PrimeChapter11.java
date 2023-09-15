package kadai_011;

public class PrimeChapter11 {
	
	public static boolean prime(int num) 
	{
		for(int i = 2; i < num; i++)
		{
			int divide = num % i;
			if(divide == 0 && i < num) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		boolean primeNumber[] = new boolean[101];
		
		for(int i = 2; i <= 100; i++) 
		{
			primeNumber[i] = prime(i);
		}
		for(int a = 0; a < primeNumber.length; a++)
		{
			if(primeNumber[a] == true) 
			{
				System.out.println(a);
			}
		}
	}
}
