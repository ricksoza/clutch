/*
    == Power of Two Digit Sum 

    2) The value of 2^17 = 131072, and the sum of the digits 1, 3, 1, 0, 7 & 2 is 14. Write a function that will take a number as input, raise 2 to the power of the inputted number, and print out the sum of the digits of the result.

    // TODO: Perhaps think of using BigInteger for large numbers
 */
package com.clutch.power_of_two_digit_sum;

import com.clutch.fizzbuzz.Logger;
import java.math.BigInteger;

/**
 *
 * @author rsoza
 */
public class PowerOfTwoDigitSum {
    
    private static final int two = 2;
    private static final int ten = 10;
    
    /**
     * Take a number as input, raise 2 to the power of the inputted number, and print out the sum of the digits of the result.
     * @param input
     * @return 
     */
    public static final int powerOfTwoDigitSum(int input)
    {
        int powerOfTwo = integerPow(two, input);        
        int sum = sumIntegersOfValue(powerOfTwo);
        return sum;
    }
    
    /**
     * Performs integer exponential
     * @param base
     * @param exp
     * @return 
     */
    public static final int integerPow(int base, int exp)
    {
        int result = 1;
        while (exp > 0)
        {
            if ((exp & 1) == 1)
                result *= base;
            exp >>= 1;
            base *= base;
        }
        return result;
    }
    
    
    /**
     * sum of the digits of the input
     * @param input
     * @return 
     */
    public static final int sumIntegersOfValue(int input)
    {
        int sum = 0;
        while (input > 0)
        {
            sum += input % ten;
            input /= ten;            
        }  
        return sum;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input = 17;
        int result = PowerOfTwoDigitSum.powerOfTwoDigitSum(input);
        Logger.log(input + " = " + result);
    }    
}
