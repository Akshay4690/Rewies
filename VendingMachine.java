package LogicalProblem;

import java.util.Scanner;

public class VendingMachine {

	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int[] Counter = new int[8];
	    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the change amount: ");
		int amount = sc.nextInt();
		sc.close();
	        
		calculateNotes(amount);
		displayNotes();
	}
	    
	public static void calculateNotes(int amount) 
	{
		if (amount == 0) 
		{
	            return;
		}
	        
		for (int i = 0; i < notes.length; i++) 
		{
			if (amount >= notes[i])
			{
	                Counter[i]++;
	                amount -= notes[i];
	                break;
			}
		}
	        
	        calculateNotes(amount);
	}
	    
	public static void displayNotes() 
	{
		int totalNotes = 0;
		System.out.println("Notes to be returned:");
	        
	        for (int i = 0; i < notes.length; i++) 
	        {
	            if (Counter[i] != 0) 
	            {
	                System.out.println(notes[i] + " x " + Counter[i]);
	                totalNotes += Counter[i];
	            }
	        }
	        
	        System.out.println("Total number of notes required: " + totalNotes);
	    }
	}


