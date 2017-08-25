package org.rcgonzalezf.onetoten

// Largest palindrome product
/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem4 {

    // BruteForce n=2 11*11= 121 => true
    // we can add all the palindrome
    // we can get the max
    fun solve(digit: Int): Int {
        val limit = getLimits(digit)
        val palindromeNumbers = mutableListOf<Int>()

        for (i in limit.first..limit.second) {
            for (j in (limit.first + 1)..limit.second) {
                val product = i * j
                if (isPalindrome(product.toString())) {
                    palindromeNumbers.add(product)
                }
            }
        }
        return palindromeNumbers.max() ?: -1
    }

    fun getLimits(digits: Int): Pair<Int, Int> {
        val p = Pair(
                Math.pow(10.0, digits - 1.0).toInt(),
                (Math.pow(10.0, digits.toDouble()) - 1).toInt()
        )
        return p
    }

    fun isPalindrome(number: String): Boolean {
        val lowerCaseNumber = number.toLowerCase()
        return lowerCaseNumber.contentEquals(lowerCaseNumber.reversed())
    }
}
