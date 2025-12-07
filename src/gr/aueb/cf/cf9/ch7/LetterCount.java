package gr.aueb.cf.cf9.ch7;

public class LetterCount {

    public static void main(String[] args) {

        String text = "Hello World";

        System.out.println("Text: " + text);
        System.out.println("Count of 'l': " + getLetterCount(text, 'l'));  // 3
        System.out.println("Count of 'o': " + getLetterCount(text, 'o'));  // 2
        System.out.println("Count of 'H': " + getLetterCount(text, 'H'));  // 1
        System.out.println("Count of 'x': " + getLetterCount(text, 'x'));  // 0


    }

    public static int getLetterCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}