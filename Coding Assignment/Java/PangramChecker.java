import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();
        
        // Create a set to store the unique letters
        Set<Character> uniqueLetters = new HashSet<>();
        
        // Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Check if the character is an alphabet letter ('a' to 'z')
            if (c >= 'a' && c <= 'z') {
                uniqueLetters.add(c);
            }
        }
        
        // Check if the set size is 26 (all letters from 'a' to 'z' are present)
        return uniqueLetters.size() == 26;
    }
}

