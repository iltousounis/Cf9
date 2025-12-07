package gr.aueb.cf.cf9.ch2;

import java.math.BigInteger;

/**
 * BigInteger Class Demo
 */

public class BigIntApp {

    public static void main(String[] args){
        BigInteger bignum1 = new BigInteger("456456787946416123132");
        BigInteger bignum2 = new BigInteger("9876543214124124314141344143");
        BigInteger bigResult;

        bigResult = bignum1.add(bignum2);

        System.out.printf("The Result is : %,d%n" , bigResult);

    }
}
