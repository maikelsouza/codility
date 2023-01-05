package company.instinet;

import java.math.BigInteger;

public class Solution {

    /**
     * It receives a binary number, transforms it into decimal and checks if it is even, if so, divide it by two, if it is odd, subtract it by one.
     * Count when steps were needed
     *
     * For example: 011100 = 28
     *
     * Even number, divide by 2 = 14
     * Even number, divide by 2 = 7
     * Odd number, subtract 1 = 6
     * Even number, divide by 2 = 3
     * Odd number, subtract 1 = 2
     * Even number, divide by 2 = 1
     * Odd number, subtract 1 = 0
     *
     * Answer: 7 Steps
     */
    public int solution(String S){

        BigInteger number = new BigInteger(S, 2);

        int count = 0;

        while (number.compareTo(BigInteger.ZERO) == 1) {
            if (number.mod(BigInteger.TWO) == BigInteger.ZERO){
                number = number.divide(BigInteger.TWO);
            }else{
                number =number.subtract(BigInteger.ONE);
            }
            count++;
        }
        return count;
    }
}
