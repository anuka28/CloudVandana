public class RomanToIntegerConverter {
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with the Roman numeral you want to convert
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer equivalent: " + result);
    }

    public static int romanToInteger(String romanNumeral) {
        int result = 0;
        int previousValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanCharToInt(currentChar);

            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Invalid character
        }
    }
}
