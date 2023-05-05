package Review;

public class Prime
{
	public static void main(String[] args) 
	{
		int start = 0;
		int end = 1000;

		System.out.println("Prime numbers between " + start + " and " + end + " are: ");

		for (int i = start; i <= end; i++)
		{
			if (isPrime(i))
			{
				System.out.println(i + " ");
			}
		}
	}

	public static boolean isPrime(int num)
	{
		if (num <= 1)
		{
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			if (num % i == 0) 
			{
				return false;
			}
		}
		return true;
	}
}


