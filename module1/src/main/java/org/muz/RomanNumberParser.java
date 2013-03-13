package org.muz;

import com.google.common.collect.ImmutableMap;

public class RomanNumberParser {

    public static ImmutableMap<Character, Integer> ROMAN_NUMBER_VALUE = ImmutableMap.<Character, Integer>builder()
            .put('V', 5)
            .put('X', 10)
            .put('L', 50)
            .put('C', 100)
            .put('D', 500)
            .put('M', 1000)
            .build();

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
