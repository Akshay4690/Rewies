package Review;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class Permutation 
	{
	    public static void main(String[] args) {
	        String str = "abc";
	        
	        // get permutations using iterative method
	        List<String> iterativePermutations = getIterativePermutations(str);
	        
	        // get permutations using recursive method
	        List<String> recursivePermutations = getRecursivePermutations(str);
	        
	        // check if the arrays returned by the two functions are equal
	        boolean isEqual = Arrays.equals(iterativePermutations.toArray(), recursivePermutations.toArray());
	        System.out.println("Are the arrays equal? : " + isEqual);	
	    }
	    
	    // function to get permutations of a string using iterative method
	    public static List<String> getIterativePermutations(String str) 
	    {
	        List<String> permutations = new ArrayList<>();
	        permutations.add(str.charAt(0) + ""); // add the first character to the list
	        
	        // iterate over each character in the string
	        for (int i = 1; i < str.length(); i++) {
	            char c = str.charAt(i);
	            
	            List<String> newPermutations = new ArrayList<>();
	            
	            // iterate over each existing permutation in the list
	            for (String permutation : permutations) 
	            {
	                // insert the current character at each position in the permutation
	                for (int j = 0; j <= permutation.length(); j++) 
	                {
	                    String newPermutation = permutation.substring(0, j) + c + permutation.substring(j);
	                    newPermutations.add(newPermutation);
	                }
	            }
	            
	            permutations = newPermutations; // update the list with the new permutations
	        }
	        
	        return permutations;
	    }
	    
	    // function to get permutations of a string using recursive method
	    public static List<String> getRecursivePermutations(String str) {
	        List<String> permutations = new ArrayList<>();
	        
	        // base case: if the string is empty, add an empty string to the list and return it
	        if (str.isEmpty()) {
	            permutations.add("");
	            return permutations;
	        }
	        
	        // iterate over each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            String substring = str.substring(0, i) + str.substring(i + 1); // remove the current character from the string
	            
	            // recursively get permutations of the remaining string
	            List<String> subPermutations = getRecursivePermutations(substring);
	            
	            // add the current character to each permutation in the list and add it to the list of permutations
	            for (String subPermutation : subPermutations) {
	                permutations.add(c + subPermutation);
	            }
	        }
	        
	        return permutations;
	    }
	}

