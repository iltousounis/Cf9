package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class StrIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        String str2 = "";

        System.out.println("Please enter two strings: ");
        str = scanner.nextLine();
        str2 = scanner.next();

        System.out.printf("the fisrt string is : %s\n",str);
        System.out.printf("the second string is : %s\n",str2);
        System.out.printf("the length of the city's characters is : %d\n",str.length());
    }
}
