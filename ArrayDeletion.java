//	WAP to Delete the elemenet into existing array in a specified position.
// Vishlesha 2
package Review2;
//	vishlesha2

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int[] array = {1, 2, 3, 4, 5};

		System.out.println("Original Array: " + Arrays.toString(array));

		System.out.print("Enter the position of the element to be deleted: ");
		int position = scanner.nextInt();

		// Check if the position is valid
		if (position < 1 || position > array.length) 
		{
			System.out.println("Invalid position!");
		} 
		else
		{
			// Delete the element at the specified position
			for (int i = position - 1; i < array.length - 1; i++) 
			{
				array[i] = array[i + 1];
	        }
			array = Arrays.copyOf(array, array.length - 1);

			System.out.println("Updated Array: " + Arrays.toString(array));
		}
	}
}
