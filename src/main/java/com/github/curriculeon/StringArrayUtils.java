package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        String result = "";
        result = array[0];
        return result;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String result = "";
        result = array[1];
        return result;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String result = "";
        //get array length
        int length = array.length;
        //return array of the length number - 1 (because array starts at 0, not 1)
        result = array[length - 1];
        return result;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String result = "";
        //get array length
        int length = array.length;
        //return array of the length number - 2 (going back 1 from the last element.)
        result = array[length - 2];
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
//        List<String> arrayList = Arrays.asList(String.valueOf(array));
//        boolean result;
//        if (arrayList.contains(value)){
//       boolean result = true;
//        }
//return result;
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //find the length and the numbers of the elements in the array.
        int arrayLength = array.length;
        int arrayElementNumber = arrayLength - 1;

        //I need a new array that is the same length as this array.
        String reverseResult[] = new String[arrayLength];

        //write for loop to count for each element.
        for (int i = 0; i <= arrayElementNumber; i++) {
            //make a new array, starting with the highest element number.
            //Have to minus the arrayElementNumber by i, so we don't continue to pull the same element.
            reverseResult[i] = array[arrayElementNumber - i];


            //minus the element number by 1, so we remove the last choice each time.
            // arrayElementNumber = arrayElementNumber - 1;
            // ((This does not work because it ends the loop early when arrayElementNumber becomes > i.
        }

        return reverseResult;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        //Boolean result = (array == reverse(array)); (intelliJ fixed my formatting)
        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String wordsAsAString = "";
        //combine the array into one String(element) so we don't have to loop for every single array element.
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            wordsAsAString = wordsAsAString + word;
        }

        //create a variable for alphabet, split it so you don't have to write each letter out.
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] letters = alphabet.split("");


        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            if (!wordsAsAString.toLowerCase().contains(letter)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        int lengthOfArray = array.length;


        for (int i = 0; i < lengthOfArray; i++) {
            if (array[i] == value) {
                result = result + 1;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] result = new [array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                 result[] = result + array[i];
            }
        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
