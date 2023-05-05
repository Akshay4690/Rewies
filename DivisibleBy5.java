package Review2;
//Dipti2

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleBy5
{
	
	public static void main(String[] args)
	{
	        
		int[] inputArray = { 10, 7, 25, 30, 15, 42, 8, 20 };

		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(10, 7, 25, 30, 15, 42, 8, 20));

		// Initialize ArrayLists to store elements divisible by 5 and not divisible by 5
		ArrayList<Integer> divisibleByFiveList = new ArrayList<Integer>();
		ArrayList<Integer> notDivisibleByFiveList = new ArrayList<Integer>();

		// Iterate through input list and add elements to the appropriate ArrayList
		for (int i = 0; i < inputList.size(); i++) 
		{
			int num = inputList.get(i);
			if (num % 5 == 0)
			{
				divisibleByFiveList.add(num);
			} 
			else
			{
				notDivisibleByFiveList.add(num);
			}
		}

		System.out.println("Elements divisible by 5: " + divisibleByFiveList);
		System.out.println("Elements not divisible by 5: " + notDivisibleByFiveList);
	}
}


