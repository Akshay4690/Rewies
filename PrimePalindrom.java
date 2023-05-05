package Review;

import java.util.*;

public class PrimePalindrom
{
	 public static boolean isPrime(int n)
	 {
	    if (n <= 1)
	    {
	      return false;
	    }
	    
	    for (int i = 2; i <= Math.sqrt(n); i++)
	    {
	      if (n % i == 0)
	      {
	        return false;
	      }
	    }
	    return true;
	 }

	 public static boolean isAnagram(String s1, String s2)
	 {
	    if (s1.length() != s2.length()) 
	    {
	    	return false;
	    }
	    char[] arr1 = s1.toCharArray();
	    char[] arr2 = s2.toCharArray();
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    return Arrays.equals(arr1, arr2);
	 }
	  
	 public static boolean isPalindrome(String s) 
	 {
		 int left = 0;
		 int right = s.length() - 1;
		 while (left < right)
		 {
			 if (s.charAt(left) != s.charAt(right)) 
			 {
				 return false;
			 }
			 left++;
			 right--;
		 }
		 return true;
	 }
	  
	 // Main function to find anagram and palindrome prime numbers
	 public static void main(String[] args)
	 {
	    int limit = 1000;
	    List<Integer> primes = new ArrayList<>();
	    for (int i = 2; i < limit; i++)
	    {
	      if (isPrime(i))
	      {
	        primes.add(i);
	      }
	    }
	    System.out.println("Anagram and palindrome prime numbers:");
	    for (int i = 0; i < primes.size(); i++)
	    {
	      for (int j = i + 1; j < primes.size(); j++) 
	      {
	        String s1 = Integer.toString(primes.get(i));
	        String s2 = Integer.toString(primes.get(j));
	        if (isAnagram(s1, s2) && isPalindrome(s1)) 
	        {
	          System.out.println(primes.get(i));
	        }
	      }
	    }
	 }
}


