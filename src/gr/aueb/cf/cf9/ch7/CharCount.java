package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        System.out.println("Please enter your name :");
        name = scanner.nextLine();

        System.out.printf("Your's name length is: %d\n",countChars(name));



    }

    public static int countChars(String str) {
        if (str == null) return 0;
        return str.length();
    }
}