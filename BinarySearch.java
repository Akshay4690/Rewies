package Review;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file path containing the word list: ");
        String filePath = scanner.nextLine();
        
        System.out.print("Enter the word to search: ");
        String searchWord = scanner.nextLine();

        try {
            String[] words = readWordsFromFile(filePath);
            Arrays.sort(words);

            if (binarySearch(words, searchWord)) {
                System.out.println("The word \"" + searchWord + "\" was found in the list.");
            } else {
                System.out.println("The word \"" + searchWord + "\" was not found in the list.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }

    private static String[] readWordsFromFile(String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath)).useDelimiter(",");
        String wordsString = scanner.next();
        return wordsString.split("\\s*,\\s*");
    }

    private static boolean binarySearch(String[] words, String searchWord) {
        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int comparison = searchWord.compareTo(words[middle]);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return false;
    }

}


