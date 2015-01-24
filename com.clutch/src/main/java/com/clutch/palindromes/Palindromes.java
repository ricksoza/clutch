/*
    == Palindromes

4)  Use the same dictionary and find the first 20 Palindromes of more than 3 characters (if any.)  A palindrome is a word spelled the same way forwards and backwards, e.g. ere or bob

*/
package com.clutch.palindromes;

import com.clutch.fizzbuzz.Logger;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author rsoza
 */
public class Palindromes {
    
    private static final String dictionaryPath = ".//words.txt";
    
    // Test whether word is a palindrome
    public static final boolean isPalindromer(String input)
    {
        boolean palindrome = false;
        
        int iChar = 0;
        int length  = input.length();
        int begin = 0;
        int end = length -1;
        int middle = (begin + end)/2;

        // Compare characters from beginning to end
        for (iChar = begin; iChar <= middle; iChar++) {
          if (input.charAt(begin) == input.charAt(end)) {
            begin++;
            end--;
          }
          else {
            break;
          }
        }
        
        // If we reached the middle, then is a palindrome
        if (iChar == middle + 1) 
        {
            palindrome = true;
        }
        
        return palindrome;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader br = null;
        
        try
        {
            // Get dictionary text file
            File fin = new File(dictionaryPath);

            // Check if file exists
            if (!fin.exists())
            {
                Logger.log("File not found.");
                System.exit(-1);
            }        
            
            FileInputStream fis = new FileInputStream(fin);
            br = new BufferedReader(new InputStreamReader(fis));
            
            String word = "";
            int palindromeCounter = 0;
            
            while ((word = br.readLine()) != null) {
                word = word.trim();
                
                // TODO: GEt rid of magic numbers
                if (word.length() > 3)
                {
                    if (Palindromes.isPalindromer(word))
                    {
                        Logger.log(word);
                        
                        if (palindromeCounter++ == 19)
                        {
                            // Only print the first 20
                            break;
                        }
                    }
                }
            }

        }
        catch (Exception e)
        {
            Logger.log(e.getMessage());
        }
        finally
        {
            // Try and close reader file
            if (br != null)
            {
                try { br.close(); } catch (Exception e) {};
            }
        }    }
}
