/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.clutch.power_of_two_digit_sum.PowerOfTwoDigitSum;
import junit.framework.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author rsoza
 */
public class PowerOfTwoDigitSumTests {
    
    public PowerOfTwoDigitSumTests() {
    }

    @Test
    public void testExponential() 
    {
        int input = 17;
        int power = PowerOfTwoDigitSum.integerPow(2, input);
        Assert.assertEquals(power, 131072);
    }

    @Test
    public void testIntegerSum() 
    {
        int input = 131072;
        int power = PowerOfTwoDigitSum.sumIntegersOfValue(input);
        Assert.assertEquals(power, 14);
    }
    
    @Test
    public void testPowerOfTwoDigitSum() 
    {
        int input = 17;
        int power = PowerOfTwoDigitSum.powerOfTwoDigitSum(input);
        Assert.assertEquals(power, 14);
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
}
