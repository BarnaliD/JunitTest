package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setup() {

        calculator = new Calculator();
        System.out.println("Before each test - initializing calculator");

    }
    @AfterEach
    public  void tearDown(){
        System.out.println("Clean up -After each test");
        calculator = null;
    }

    //Test for addition
    @Test

    public void  testAddition() {
        assertEquals(10, calculator.add(6, 4), "6 + 4 should equal 10");
        assertEquals(-3, calculator.add(-1, -2), "-1 + -2 should equal -3");
    }

    @Test

    public void testSubtraction() {
        assertEquals(5,calculator.subtract(10,5), "10-5 should equal 5");
        assertEquals(0,calculator.subtract(4,4),"4-4 should equal 0");

    }

    @Test

    public void testMultiplication(){
        assertEquals(30,calculator.multiply(6,5),"6*5 should equal 30  ");
        assertEquals(0, calculator.multiply(7, 0), "7 * 0 should equal 0");

    }

    @Test

    public void testDivision(){
            assertEquals(2.5, calculator.divide(5, 2), "5 / 2 should equal 2.5");
            assertEquals(3.0, calculator.divide(9, 3), "9 / 3 should equal 3.0");
            assertEquals(-2.5, calculator.divide(-5, 2), "-5 / 2 should equal -2.5");
            assertEquals(-3.0, calculator.divide(9, -3), "9 / -3 should equal -3.0");
        }


    @Test
    //Test for a number divided by Zero
    public void testDivisionByZero() {
        assertEquals(Double.POSITIVE_INFINITY, calculator.divide(5, 0), "5 / 0 should return Infinity");
        assertEquals(Double.NEGATIVE_INFINITY, calculator.divide(-5, 0), "-5 / 0 should return -Infinity");
        assertTrue(Double.isNaN(calculator.divide(0, 0)), "0 / 0 should return NaN");
    }



    @Test
    public void testSquareRootOfPositiveNumber() {
        assertEquals(4.0, calculator.squareRootOf(16), "Square root of 16 should be 4.0");
        assertEquals(5.0, calculator.squareRootOf(25), "Square root of 25 should be 5.0");
    }
    @Test
    public void testSquareRootOfZero() {
        assertEquals(0.0, calculator.squareRootOf(0), "Square root of 0 should be 0.0");
    }
    @Test
    public void testSquareRootOfNegativeNumber() {
        assertTrue(Double.isNaN(calculator.squareRootOf(-4)), "Square root of a negative number should be NaN");
    }
    @Test
    public void testGetAreaPositiveRadius() {
        assertEquals(314.16, calculator.getArea(10), "Area of circle with radius 10 should be 314.16");
    }

    @Test
    public void testGetCircumferencePositiveRadius() {
        assertEquals(62.83, calculator.getCircumference(10), "Circumference of circle with radius 10 should be 62.83");
    }

    @Test
    public void testGetCircumferenceNegativeRadius() {
        assertTrue(Double.isNaN(calculator.getCircumference(-7)), "Circumference of circle with negative radius should be NaN");
    }

}