package org.rcgonzalezf;

/**
 * https://projecteuler.net/problem=1
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

    public int baseNumber = 10;

    public int solution() {
        int solution = 0;

        for (int i = 0; i < baseNumber; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                solution += i;
            }
        }

        return solution;
    }
}
