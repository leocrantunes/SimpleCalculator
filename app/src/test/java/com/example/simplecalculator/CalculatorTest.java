package com.example.simplecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator fixture;

    @Before
    public void setUp() throws Exception {

        fixture = new Calculator();
    }

    /**
     * Test identifier: 1.1
     * Test description: tests addition of 5 and 5
     * Method of execution: Automated
     * Input: (5.0,5.0)
     * Expected output: 10.0
     *
     */
    @Test
    public void testAddition_input5and5_output10() {

        // 1. Arrange
        double i = 5.0;
        double j = 5.0;

        // 2. Act
        double result = fixture.add(i, j);

        // 3. Assert
        assertEquals(10.0, result, 0);
    }

    /**
     * Test identifier: 1.2
     * Test description: tests subtraction of 5 and 5
     * Method of execution: Automated
     * Input: (5.0,5.0)
     * Expected output: 0.0
     *
     */
    @Test
    public void testSubtract_input5and5_output0() {

        // 1. Arrange
        double i = 5.0;
        double j = 5.0;

        // 2. Act
        double result = fixture.subtract(i, j);

        // 3. Assert
        assertEquals(0.0, result, 0);
    }

    /**
     * Test identifier: 1.3
     * Test description: tests multiplication of 5 and 5
     * Method of execution: Automated
     * Input: (5.0,5.0)
     * Expected output: 25.0
     *
     */
    @Test
    public void testMultiply_input5and5_output25() {

        // 1. Arrange
        double i = 5.0;
        double j = 5.0;

        // 2. Act
        double result = fixture.multiply(i, j);

        // 3. Assert
        assertEquals(25.0, result, 0);
    }

    /**
     * Test identifier: 1.4
     * Test description: tests division of 5 and 5
     * Method of execution: Automated
     * Input: (5.0,5.0)
     * Expected output: 1.0
     *
     */
    @Test
    public void testDivide_input5and5_output1() {

        // 1. Arrange
        double i = 5.0;
        double j = 5.0;

        // 2. Act
        double result = fixture.divide(i, j);

        // 3. Assert
        assertEquals(1.0, result, 0);
    }
}