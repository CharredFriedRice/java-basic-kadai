package kadai_011;

public class PrimeChapter11 {

	public static void main(String[] args) 
	{
		boolean primeNumber[] = new boolean[101];
		int falseCnt = 0;
		int num = 7;
		for(int divide = 2; divide < primeNumber.length ; divide++)
		{
			if(num % divide == 0)
			{
				primeNumber[divide] = false;
				falseCnt++;
			}
			else 
			{
				primeNumber[divide] = true;
			}
			
			System.out.println(divide + ":" + primeNumber[divide]);
			
			if(divide == primeNumber.length - 1) 
			{
				if(primeNumber[num] == false && falseCnt == 1) 
				{
					System.out.println(num + "は素数です。");
				}
			}
		}
	}

}
