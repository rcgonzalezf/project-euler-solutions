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

    //region given methods
    private fun givenTwoDigits() {
        digits = 2
    }

    private fun givenThreeDigits() {
        digits = 3
    }
    //endregion given methods

    //region when methods
    private fun whenCalculationSolution() {
        largestPalindrome = uut!!.solve(digits)
    }
    //endregion when methods

    //region then methods
    private fun thenLargestPalindromeShouldBe(expectedLargest: Int) {
        assertEquals(expectedLargest, largestPalindrome)
    }
    //endregion then methods
}
