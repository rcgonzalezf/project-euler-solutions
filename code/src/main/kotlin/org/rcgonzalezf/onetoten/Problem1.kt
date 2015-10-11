package org.rcgonzalezf.onetoten

/**
 * https://projecteuler.net/problem=1
 *
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem1 {

    var baseNumber = 10

    fun solution(): Int {
        var solution = 0

        (0..baseNumber - 1).filter { it % 3 == 0 || it % 5 == 0 }.forEach {
            solution += it
        }

        return solution
    }
}
