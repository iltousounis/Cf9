package gr.aueb.cf.cf9.ch7;

/**
 * Anagrams are strings that have the same characters, but in a different order.
 * For instance, "listen" and "silent" are anagrams.
 */
public class Anagrams {

    public static void main(String[] args) {



    String[][] testCases = {
            {"listen", "silent"},       // true
            {"evil", "vile"},           // true
            {"a gentleman", "elegant man"},  // true (with spaces)
            {"hello", "world"},         // false
            {"abc", "def"},             // false
            {"", ""},                   // true
            {"aab", "abb"}              // false
    };

        System.out.println("=== Anagram Tests ===");
        for(
    String[] test :testCases)

    {
        boolean result = isAnagram(test[0], test[1]);
        System.out.printf("'%s' & '%s' → %b%n",
                test[0], test[1], result);
    }
}



    /**
     * Checks if two strings are anagrams.
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] frequency = new int[256];     // full ascii - default value is 0

        for (char c : s1.toCharArray()) {
            frequency[c]++;
        }

        for (char c : s2.toCharArray()) {
            frequency[c]--;
            if (frequency[c] < 0) return false;       // early exit
        }

        // All counts should be 0
        for (int item : frequency) {
            if (item != 0) return false;
        }
        return true;
    }
}