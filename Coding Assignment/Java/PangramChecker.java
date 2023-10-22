public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input sentence
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to mark the presence of each alphabet
        boolean[] alphabetPresent = new boolean[26];
        
        // Convert the input to lowercase for case-insensitive comparison
        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Check if the current character is an alphabet letter ('a' to 'z')
            if (currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a'; // Map the character to an index (0 to 25)
                alphabetPresent[index] = true;
            }
        }
        
        // Check if all alphabets from 'a' to 'z' are present
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }
        
        return true;
    }
}
