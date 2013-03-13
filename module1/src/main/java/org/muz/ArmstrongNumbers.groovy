package org.muz

import static java.lang.Math.*

// http://java.dzone.com/articles/thursday-code-puzzler-8
class ArmstrongNumbers {

    static void main(String[] args) {
        int count = 0
        int candidate = 1
        while (count < 10 && candidate < 1_000_000) {
            if (isArmstrongNumber(candidate)) {
                printf("==== %d\n", candidate)
            }
            candidate++
        }
    }

    static boolean isArmstrongNumber(int n) {
        int exponent = ceil(log10(n))
        int sum = 0
//        printf("\n%d %d\n", n, exponent)
        Integer.toString(n).toCharArray().each { char digit ->
//            printf("%s %s ", digit, Math.pow(Character.digit(digit, 10), exponent))
            sum += pow(Character.digit(digit, 10), exponent) }
        return sum == n;
    }
}
