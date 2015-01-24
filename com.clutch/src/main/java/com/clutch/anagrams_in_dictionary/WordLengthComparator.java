/*
 * Comparator for sorting words by length
 */
package com.clutch.anagrams_in_dictionary;

import java.util.Comparator;

/**
 *
 * @author rsoza
 */
public class WordLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {             
        if (o1.length()!=o2.length()) {
            // overflows not possible since lengths are non-negative
            return o1.length()-o2.length(); 
        }
        return o1.compareTo(o2);
    }
}
