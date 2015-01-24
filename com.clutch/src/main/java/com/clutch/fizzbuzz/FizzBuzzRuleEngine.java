/*
 * Rules to test against.
 * All rules in this set test against even multiples 
 */
package com.clutch.fizzbuzz;

/**
 *
 * @author rsoza
 */
public class FizzBuzzRuleEngine {
    
    private static final String FIZZBUZZ = "fizzbuzz";
    private static final int two = 2;
    
    private enum Rules
    {
        FIZZ(5, "Fizz"),
        BUZZ(7, "Buzz");
        
        private final int testValue;
        private final String outputValue;
        private Rules(final int testValue, final String outputValue ) 
        { 
            this.testValue = testValue; 
            this.outputValue = outputValue; 
        };
        public int getTestValue() 
        { 
            return this.testValue;
        }
        public String getOutputValue() 
        { 
            return this.outputValue;
        } 
    }
    
    /**
     * Tests rules against input value and returns log output
     * @param value
     * @return 
     */
    public static final String testRules(int value)
    {
        String logOutput = "";
        
        // Test against all rules and accumulates 
        for (Rules rule : Rules.values()) 
        {
            if (isEvenMultiple(value, rule.getTestValue()))
            {
                logOutput = logOutput + "" + rule.getOutputValue();
            }
        }
        
        // Test if no rule matched
        // TODO: Probably better to set a flag than check string length
        if (logOutput.length() == 0)
        {
            logOutput = FIZZBUZZ;
        }
        return logOutput;
    }
    
    /**
     * Tests if value is an even multiple of multipleValue
     * @param value Test value
     * @param multiplevalue Is Even Multiple of this Value
     * @return 
     */
    public static final boolean isEvenMultiple(int value, int multipleValue)
    {
        if (((value % two) == 0) && ((value % multipleValue) == 0))
        {
            return true;
        }
        return false;
    }
    
}
