package org.rcgonzalezf.onetoten

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
        val sequenceOfPrimes = mutableListOf<Long>()

        return generateSeqOfFactors(n)
                .filterTo(sequenceOfPrimes)
                { isPrime(it) }
                .max() ?: -1L
    }

    private fun generateSeqOfFactors(n: Long): MutableList<Long> {
        val sequence = mutableListOf<Long>()
        val limit = calculateLimit(n)
        (2L until limit)
                .filterTo(sequence)
                { n.rem(it) == 0L }
        return sequence
    }

    private fun isPrime(number: Long): Boolean {
        if ((number % 2L) == 0L) {
            return number == 2L
        }

        val limit = calculateLimit(number)

        return if ((3 until limit step 2)
                .any { number % it == 0L }) false
                else number != 1L
    }

    private fun calculateLimit(number: Long): Long {
        val sqrt = Math.sqrt(number.toDouble())
        return Math.ceil(sqrt).toLong()
    }
}
