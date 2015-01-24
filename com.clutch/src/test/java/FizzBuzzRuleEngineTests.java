/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.clutch.fizzbuzz.FizzBuzzRuleEngine;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author rsoza
 */
public class FizzBuzzRuleEngineTests {
    
    public FizzBuzzRuleEngineTests() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testIsEvenMultipleTrue() throws Exception
    {
        boolean test = FizzBuzzRuleEngine.isEvenMultiple(20, 5);
        Assert.assertTrue(test, "20 is an even multiple of 5");
    }
    
    @Test
    public void testIsEvenMultipleFalse() throws Exception
    {
        boolean test = FizzBuzzRuleEngine.isEvenMultiple(21, 5);
        Assert.assertFalse(test, "21 is not an even multiple of 5");
    }
    
    @Test
    public void testIsEvenMultipleTrueSeven() throws Exception
    {
        boolean test = FizzBuzzRuleEngine.isEvenMultiple(14, 7);
        Assert.assertTrue(test, "14 is an even multiple of 7");
    }
}
