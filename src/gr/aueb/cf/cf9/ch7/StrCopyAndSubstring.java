package gr.aueb.cf.cf9.ch7;
import java.util.Arrays;
/**
 * Αντιγραφή Strings γίνεται με
 * αντιγραφή δεικτών γιατί τα Strings
 * είναι immutable.
 */
public class StrCopyAndSubstring {

    public static void main(String[] args) {

        // Copy
        String s1 = "Coding";
        String s2 = s1;         // Copy
        s2 = "Factory";


        int[] Ar = {3, 4, 6};
        int[] Ar1 = {1, 2, 5};

        // Δημιουργούμε νέο πίνακα με μέγεθος = άθροισμα των δύο πινάκων
        int[] Ar2 = new int[Ar.length + Ar1.length];

        // Αντιγράφουμε τον Ar στον Ar2 (από θέση 0)
        System.arraycopy(Ar, 0, Ar2, 0, Ar.length);

        // Αντιγράφουμε τον Ar1 στον Ar2 (από θέση Ar.length)
        System.arraycopy(Ar1, 0, Ar2, Ar.length, Ar1.length);

        System.out.println("Ar: " + Arrays.toString(Ar));
        System.out.println("Ar1: " + Arrays.toString(Ar1));
        System.out.println("Ar2 (ένωση): " + Arrays.toString(Ar2));

        s2 = "Factory";

        System.out.println(s1);
        System.out.println(s2);

        // Substring
        String s3 = s1.substring(1);        // oding
        String s4 = s1.substring(1, 3);     // od
    }

    // Traverse char-by-char με substring
    public static void traverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1) + " ");
        }
    }

}