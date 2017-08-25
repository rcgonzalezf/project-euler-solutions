package org.rcgonzalezf.onetoten

// Largest palindrome product
/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem4 {

    fun solve(digit: Int): Int {
        val limit = getLimits(digit)

        return digit
    }

    fun getLimits(digits: Int): Pair<Int, Int> {
        val p = Pair(
                Math.pow(10.0, digits - 1.0).toInt(),
                (Math.pow(10.0, digits.toDouble()) - 1).toInt()
        )
        return p
    }

    fun isPalindrome(number:String) : Boolean {
        val lowerCaseNumber = number.toLowerCase()
        return lowerCaseNumber.contentEquals(lowerCaseNumber.reversed())
    }
}
