package gr.aueb.cf.cf9.ch7;

/**
 * Παλινδρομική είναι μία πρόταση (string) που διαβάζεται
 * το ίδιο από την αρχή και το τέλος.
 */
public class Palindrome {

    public static void main(String[] args) {

        String[] testCases = {
                "civic",           // true
                "radar",           // true
                "level",           // true
                "Athens",          // false
                "A",               // true
                "",                // true
                "racecar",         // true
                "hello"            // false
        };


        System.out.println("=== Method 1: Two-Pointer ===");
        for (String test : testCases) {
            System.out.printf("'%s' is palindrome: %b%n",
                    test, isPalindrome(test));
        }

        System.out.println("\n=== Method 2: Reverse & Compare ===");
        for (String test : testCases) {
            System.out.printf("'%s' is palindrome: %b%n",
                    test, isPalindrome2(test));
        }

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}