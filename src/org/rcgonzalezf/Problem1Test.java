package org.rcgonzalezf;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Problem1Test {

    private int solution;
    private Problem1 problem1;

    @Before
    public void initProblem() throws Exception {
        problem1 = new Problem1();
    }

    @Test
    public void solutionShouldReturn23ForInput10() throws Exception {
        givenBelow(10);
        whenCalculationSolution();
        thenSolutionShouldBe(23);
    }

    @Test
    public void solutionShouldReturnXXForInput10000() throws Exception {
        givenBelow(10_000);
        whenCalculationSolution();
        thenSolutionShouldBe(23331668);
    }

    private void thenSolutionShouldBe(int expectedSolution) {
        assertEquals(expectedSolution, solution);
    }

    private void whenCalculationSolution() {
        solution = problem1.solution();
    }

    private void givenBelow(int belowWhat) {
        problem1.baseNumber = belowWhat;
    }
}