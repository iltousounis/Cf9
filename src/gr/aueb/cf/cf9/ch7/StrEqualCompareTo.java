package gr.aueb.cf.cf9.ch7;

public class StrEqualCompareTo {

    public static void main(String[] args) {
        String str1 = "Athens";
        String str2 = "athens";
        String str3 = "ATHENS";
        String str4 = new String("Athens");
        String str5 = "Athens";

        // Equals

        String[] comparisons = {
                "str1 == str2",
                "str1 == str4",
                "str1 == str5",
                "str1.equals(str2)",
                "str1.equals(str4)",
                "str1.equals(str5)",
                "str1.equalsIgnoreCase(str2)"
        };

        boolean[] results = {
                str1 == str2,     // false
                str1 == str4,     // false
                str1 == str5,     // true (SCP)
                str1.equals(str2),    // false
                str1.equals(str4),    // true
                str1.equals(str5),    // true
                str1.equalsIgnoreCase(str2)  // true
        };

        for (int i = 0; i < comparisons.length; i++) {
            System.out.printf("equals%d (%s): %b\n", i + 1, comparisons[i], results[i]);
        }

        // Compare
        if (str1.compareTo(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 < str2");
        } else {    // str1.compareTo(str2) == 0
            System.out.println("str1 == str2");
        }

        if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println("str1 < str2");
        } else {    // str1.compareToIgnoreCase(str2) == 0
            System.out.println("str1 == str2");
        }
    }
}