/*
    == FizzBuzz 

    1) FizzBuzz: Write a function that will count from 1 to 100, and for each count, if the number is an even multiple of 5 output “Fizz” and if a multiple of 7 output “Buzz”, otherwise output "FizzBuzz"

*/
package com.clutch.fizzbuzz;

/**
 *
 * @author rsoza
 */
public class FizzBuzz {

    // Start and stop indezes
    public static final int START_COUNT = 1;
    public static final int END_COUNT = 100;
    public static final int FIZZ_TEST_VALUE = 5;
    
    public static final void count()
    {
        String output = "";
        // Loop through start and stop indexes
        for (int iCounter = START_COUNT; iCounter <= END_COUNT; iCounter++)
        {
            // Test against even multiple rules
            output = FizzBuzzRuleEngine.testRules(iCounter);
            // Log output
            Logger.log(iCounter + " = " + output);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FizzBuzz.count();
    }
    
}
