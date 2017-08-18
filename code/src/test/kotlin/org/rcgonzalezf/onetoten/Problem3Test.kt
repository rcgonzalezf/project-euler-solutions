package org.rcgonzalezf.onetoten

import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

class Problem3Test {

    private var uut: Problem3? = null
    private var n: Long = 0
    private var result: Long = 0

    @Before
    fun setupInstance() {
        uut = Problem3()
    }

    @Test
    fun shouldReturn29For13195() {
        givenPrimeFactorOf(13195)

        whenCalculatingSolution()

        thenTheSolutionShouldBe(29)
    }

    @Test
    fun shouldReturnSolutionFor600851475143() {
        givenPrimeFactorOf(600851475143)

        whenCalculatingSolution()

        thenTheSolutionShouldBe(-1)
    }

    //region - given methods
    private fun givenPrimeFactorOf(i: Long) {
        this.n = i
    }
    //endregion

    //region - when methods
    private fun whenCalculatingSolution() {
        result = uut!!.solve(n)
    }
    //endregion

    //region - then methods
    private fun thenTheSolutionShouldBe(expected: Long) {
        assertEquals(expected, result)
    }
    //endregion

}