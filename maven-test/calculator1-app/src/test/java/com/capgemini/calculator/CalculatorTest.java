package com.capgemini.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculatorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculatorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppForAddTwoNumbers()
    {
    	Calculator calculator = new Calculator();
    	int actual = calculator.addNumbers(5, 5);
    	int expected = 10;
        assertEquals(expected, actual);
    }
    
    public void testAppForSubtractTwoNumbers()
    {
    	Calculator calculator = new Calculator();
    	int actual = calculator.subtractNumbers(5, 5);
    	int expected = 0;
        assertEquals(expected, actual);
    }
    
    public void testAppForMultiplyTwoNumbers()
    {
    	Calculator calculator = new Calculator();
    	int actual = calculator.multiplyNumbers(5, 5);
    	int expected = 25;
        assertEquals(expected, actual);
    }
    
    public void testAppForDivideTwoNumbers()
    {
    	Calculator calculator = new Calculator();
    	int actual = calculator.divideNumbers(5, 5);
    	int expected = 1;
        assertEquals(expected, actual);
    }
}
