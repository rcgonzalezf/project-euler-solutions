package org.rcgonzalezf.onetoten

import com.sun.org.apache.xpath.internal.operations.Number

/**
https://projecteuler.net/problem=3
Largest prime factor Problem 3
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
 **/
class Problem3 {

    // Naive (brute-force) solution:
    // 1. Calculate all the prime factors of given number -> Sequence/List
    //    1.a) Get the factor of the given number
    //    1.b) Is that factor a prime number
    //    1.c) Store that given number in the sequence to be returned
    // 2. Sequence of prime factors, get the maximum
    // 3. The solution will be returned
    fun solve(n: Long): Long {
        var sequenceOfPrimes = mutableListOf<Long>()
        val sequenceOfFactors = generateSeqOfFactors(n)

        sequenceOfFactors
                .filter { isPrime(it) }
                .forEach { sequenceOfPrimes.add(it) }

        var max: Long = Long.MIN_VALUE

        sequenceOfPrimes.forEach {
            if (it > max)
                max = it
        }
        return max
    }


    private fun generateSeqOfFactors(n: Long): MutableList<Long> {
        var sequence = mutableListOf<Long>()
        val sqrt = Math.sqrt(n.toDouble()).toLong()
        for (i in 2L until sqrt) { // TODO until sqrt of n
            if (n.rem(i) == 0L) {
                sequence.add(i)
            }
        }
        return sequence
    }

    private fun isPrime(number: Long): Boolean {
        if ((number % 2L) == 0L) {
            return number == 2L
        }
        val sqrt = Math.sqrt(number.toDouble())

        /*
         return if ((3 until sqrt.toInt()).any { // TODO probably test with this auto-generated code
            number % it == 0L
        }) false else number != 1L
         */

        for (i in 3 until Math.ceil(sqrt).toLong()) { // TODO increment 2 by 2
            if (number % i == 0L) {
                return false
            }
        }
        return number != 1L
    }

}