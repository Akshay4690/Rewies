package Review2;

import java.util.*;

public class CommonElements 
{
	public static void main(String[] args)
	{
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {4, 5, 6, 7, 8};
		ArrayList<Integer> commonElements = new ArrayList<Integer>();

		for(int i = 0; i < array1.length; i++) 
		{
			for(int j = 0; j < array2.length; j++)
			{
				if(array1[i] == array2[j])
				{
					commonElements.add(array1[i]);
				}
			}
		}

		System.out.println("Common Elements: " + commonElements);
	}
}


