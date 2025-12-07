package gr.aueb.cf.cf9.ch7;

public class StrUpperLower {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        // Τρόποι σύγκρισης
        boolean isEqual = s1.toUpperCase().equals(s2.toUpperCase());
        boolean isEqual2 = s1.toLowerCase().equals(s2.toLowerCase());
        boolean isEqual3 = s1.equalsIgnoreCase(s2);  // Προτιμότερο!

        System.out.println("toUpperCase: " + isEqual);   // true
        System.out.println("toLowerCase: " + isEqual2);  // true
        System.out.println("equalsIgnoreCase: " + isEqual3);  // true

        // Παραδείγματα χρήσης
        System.out.println(s1.toUpperCase());  // ATHENS
        System.out.println(s2.toLowerCase());  // athens
    }
}