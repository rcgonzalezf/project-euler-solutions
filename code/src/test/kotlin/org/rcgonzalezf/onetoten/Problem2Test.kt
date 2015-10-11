package org.rcgonzalezf.onetoten

import org.junit.Before
import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class Problem2Test {

    private var solution: BigInteger = BigInteger.ZERO
    private var problem2: Problem2? = null

    @Before
    @Throws(Exception::class)
    fun initProblem() {
        problem2 = Problem2()
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn16ForMaxValue10AndFibonacci10() {
        givenFibonacciOf(10)
        givenMaxValue(10)
        whenCalculationSolution()
        thenSolutionShouldBe(10)
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn44WithDefaultMaxValueAndFibonacci10() {
        givenFibonacciOf(10)
        whenCalculationSolution()
        thenSolutionShouldBe(44)
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn188WithMaxValue1000AndFibonacci100() {
        givenFibonacciOf(12)
        givenMaxValue(1000)
        whenCalculationSolution()
        thenSolutionShouldBe(188)
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn4613732WithDefaultMaxValueAndFibonacci32() {
        givenFibonacciOf(32)
        whenCalculationSolution()
        thenSolutionShouldBe(4613732)
    }

    private fun givenMaxValue(mV: Int) {
        problem2!!.maxValue = mV
    }

    private fun thenSolutionShouldBe(expected: Long) {
        assertEquals(expected, solution.longValue())
    }

    private fun whenCalculationSolution() {
        solution = problem2!!.solution()
    }

    private fun givenFibonacciOf(n: Int) {
        problem2!!.fibonacci = n
    }
}