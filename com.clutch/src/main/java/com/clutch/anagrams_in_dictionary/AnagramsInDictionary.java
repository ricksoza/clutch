/*
 == Anagrams in Dictionary
    3) Find a common dictionary -- an example would be the one at /usr/share/dict/words which has words with one per line -- then find and print the first 20 (by any sorting method you wish) words that are anagrams of each other, e.g. “dog” is an anagram of “god”

 */
package com.clutch.anagrams_in_dictionary;

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
public class AnagramsInDictionary {
    
    private static final String dictionaryPath = ".//words.txt";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO: Much better to use MapReduce in Hadoop (or such), but I did it manuualy
        // below, else there would be very little code for you to review.
        
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
            
            // Read dictionary into memory and sort by word length
            // TODO: Probably want to preprocess the dictionary into another file to make it faster on startup
            
            // Create an in memory map reducer using a multi-hash map
            // This is a bit ineffecient since it finds all anagrams, but can
            // be used later for generate a pre-processed database
            Multimap<String, String> wordMap = ArrayListMultimap.create();
            String line = null;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                char[] chars = line.toCharArray();
                
                // Sort words via characters
                Arrays.sort(chars);
                String sortedLettersInWord = new String(chars);
                
                // Add words for Map keyed off of the sorted characters
                // This method will find all anagrams
                wordMap.put(sortedLettersInWord, line);
            }

            // Loop through collection and find maps with more than one entry,
            // which are anagrams
            int iAnagramCounter = 0;
            for (String key: wordMap.keySet())
            {
                Collection<String> values = wordMap.get(key);
                if (values.size() > 1)
                {
                    Logger.log(values.toString());
                    if ((iAnagramCounter++) == 19)
                    {
                        // Only log the first 20 anagrams
                        // TODO: Get rid of magic numbers
                        break;
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
        }
    }    

}
