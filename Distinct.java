package Review2;
// Prakash2

import java.util.*;

public class Distinct
{
	public static void main(String[] args)
	{
	        
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {4, 5, 6, 7, 8};
		
		HashSet<Integer> distinctElements = new HashSet<Integer>();
	        
		// Loop through the first array and add each element to the HashSet
		for (int i = 0; i < arr1.length; i++)
		{
			distinctElements.add(arr1[i]);
		}
	        
		// Loop through the second array and check if each element is already in the HashSet

		for (int i = 0; i < arr2.length; i++)
		{
			if (distinctElements.contains(arr2[i])) 
			{
				System.out.println(arr2[i]);
				distinctElements.remove(arr2[i]);
			}
		}
	}
}


