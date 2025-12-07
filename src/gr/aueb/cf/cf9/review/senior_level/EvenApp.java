package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class EvenApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        System.out.println("please enter a number: ");
while (!scanner.hasNextInt()){
    System.out.println("Invalid input. Please enter a number:");
    scanner.nextLine();
}
        num = scanner.nextInt();

        result = isEven(num);

        System.out.println("The number is even: " + result);
    }

    /** Checks if a number is even.
     *
     * @param num the numer to check
     * @return true if os even, false otherwise.
     */
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
