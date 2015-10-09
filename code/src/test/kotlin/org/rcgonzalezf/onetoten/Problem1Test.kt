package org.rcgonzalezf.onetoten

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import org.junit.Assert.*
import org.rcgonzalezf.onetoten.Problem1

@RunWith(JUnit4::class)
class Problem1Test {

    private var solution: Int = 0
    private var problem1: Problem1? = null

    @Before
    @Throws(Exception::class)
    fun initProblem() {
        problem1 = Problem1()
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn23ForInput10() {
        givenBelow(10)
        whenCalculationSolution()
        thenSolutionShouldBe(23)
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturnXXForInput10000() {
        givenBelow(10000)
        whenCalculationSolution()
        thenSolutionShouldBe(23331668)
    }

    private fun thenSolutionShouldBe(expectedSolution: Int) {
        assertEquals(expectedSolution.toInt(), solution.toInt())
    }

    private fun whenCalculationSolution() {
        solution = problem1!!.solution()
    }

    private fun givenBelow(belowWhat: Int) {
        problem1!!.baseNumber = belowWhat
    }
}