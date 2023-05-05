package Review;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String s1 = scanner.nextLine();
		System.out.print("Enter second string: ");
		String s2 = scanner.nextLine();
		
		if (isAnagrams(s1, s2))
		{
			System.out.println("The two strings are anagrams.");
		} 
		else 
		{
			System.out.println("The two strings are not anagrams.");
		}
	}
	
	public static boolean isAnagrams(String s1, String s2) 
	{
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		// Sort the char arrays
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		// Check if the sorted char arrays are equal
		return Arrays.equals(a1, a2);
	}

}

