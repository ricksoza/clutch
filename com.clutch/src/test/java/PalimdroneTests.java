/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.clutch.palindromes.Palindromes;
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
public class PalimdroneTests {
    
    public PalimdroneTests() {
    }

    @Test
    public void isPalimdrone() 
    {
        String testString = "amama";
        boolean isPal = Palindromes.isPalindromer(testString);
        Assert.assertTrue(isPal, testString);
    }

    @Test
    public void isNotPalimdrone() 
    {
        String testString = "abcdeg";
        boolean isPal = Palindromes.isPalindromer(testString);
        Assert.assertFalse(isPal, testString);
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
