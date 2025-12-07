package gr.aueb.cf.cf9.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int result = 0;

        result = pow(2, 3);

        System.out.printf("the result is = %d", result);

    }

    public static int pow(int base, int power) {
//        if (power == 0) {
//            return 1;
//        }
//        return base * pow(base, power - 1);
        return power == 0 ? 1 : base * pow(base, power - 1);
    }
}