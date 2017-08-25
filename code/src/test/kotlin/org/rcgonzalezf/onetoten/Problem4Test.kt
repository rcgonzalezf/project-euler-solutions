package org.rcgonzalezf.onetoten

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class Problem4Test {

    private var uut: Problem4? = null
    private var digits: Int = 0
    private var largestPalindrome: Int = 0
    private var number: Int = 0
    private var isPalindrome: Boolean = false

    @Before
    fun setupInstance() {
        uut = Problem4()
    }

    @Test
    fun shouldReturn9009ForTwoDigitsLargestPalindrome() {
        givenTwoDigits()

        whenCalculationSolution()

        thenLargestPalindromeShouldBe(9009)
    }

    @Test
    fun shouldReturnXXXFor3DigitsLargestPalindrome() {
        givenThreeDigits()

        whenCalculationSolution()

        thenLargestPalindromeShouldBe(-1)
    }

    @Test
    fun shouldReturnTrueFor1001WhenIsPalindrome() {
        givenNumber(1001)

        whenCheckingPalindrome()

        thenShouldBePalindrome(true)
    }

    @Test
    fun shouldReturnFalseFor901WhenIsPalindrome() {
        givenNumber(901)

        whenCheckingPalindrome()

        thenShouldBePalindrome(false)
    }

    //region given methods
    private fun givenTwoDigits() {
        digits = 2
    }

    private fun givenThreeDigits() {
        digits = 3
    }

    private fun givenNumber(number: Int) {
       this.number = number
    }
    //endregion given methods

    //region when methods
    private fun whenCalculationSolution() {
        largestPalindrome = uut!!.solve(digits)
    }

    private fun whenCheckingPalindrome() {
        isPalindrome = uut!!.isPalindrome(number.toString())
    }

    //endregion when methods

    //region then methods
    private fun thenLargestPalindromeShouldBe(expectedLargest: Int) {
        assertEquals(expectedLargest, largestPalindrome)
    }

    private fun thenShouldBePalindrome(expected: Boolean) {
        assertEquals(expected, isPalindrome)
    }
    //endregion then methods
}
