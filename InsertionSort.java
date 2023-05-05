package Review;
	
import java.util.Scanner;

public class InsertionSort
{   
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	       
		System.out.print("Enter the list of words separated by spaces: ");
		String sc = scanner.nextLine();
		String[] words = sc.split("\\s+");
	        
	      
		for (int i = 1; i < words.length; i++) 
		{
			String key = words[i];
			int j = i - 1;
			
			while (j >= 0 && words[j].compareTo(key) > 0)
			{
				words[j+1] = words[j];
				j--;
			}
			words[j+1] = key;
		}
		// Print the sorted list of words
		System.out.println("Sorted list of words:");
		for (String word : words)
		{
	            System.out.print(word + " ");
		}
	}
	    
}



