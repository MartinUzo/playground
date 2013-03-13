package org.muz;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumberParser {

    public static Map<Character, Integer> ROMAN_NUMBER_VALUE = new LinkedHashMap<>();

    static {
        ROMAN_NUMBER_VALUE.put('I', 1);
        ROMAN_NUMBER_VALUE.put('V', 5);
        ROMAN_NUMBER_VALUE.put('X', 10);
        ROMAN_NUMBER_VALUE.put('L', 50);
        ROMAN_NUMBER_VALUE.put('C', 100);
        ROMAN_NUMBER_VALUE.put('D', 500);
        ROMAN_NUMBER_VALUE.put('M', 1000);
    }

    public int parse(String romanNumber) {
        int result = 0;
        int previousDigit = 0;
        for (char digit : romanNumber.toCharArray()) {
            int value = ROMAN_NUMBER_VALUE.get(digit);
            result += value;
            if (previousDigit < value) {
                result -= previousDigit;
                result -= previousDigit;
            }
            previousDigit = value;
        }
        return result;
    }
}
