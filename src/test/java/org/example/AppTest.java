package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private Calculator calculator;

    @BeforeAll
    static void setUpForAllTest(){
        System.out.println("Setting up ALL");
    }
    @AfterAll
    static void tearDownForAllTest(){
        System.out.println("Closing up ALL");
    }
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
        System.out.println("Set up calculator object for new test");
    }
    @AfterEach
    void tearDown (){
        System.out.println("This is execution of post condition after each test");
    }

    @Test
    public void checkTwoPositiveValuesEquals(){
        //Calculator calculator = new Calculator();
        //assertEquals( 3 , 3);
        assertEquals(4, calculator.calculateSumOfTwoIntegerValues(2, 2));
    }
    @Test
    public void checkTwoValuesNotEquals(){
        assertNotEquals( 3 , 4);
    }

    @Test
    public void shouldAnswerWithTrue() {
        boolean isTrue = true;
        assertTrue(isTrue);
        //assertTrue( 3 == 3 );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( 4 < 2 );
    }

    @Test
    public void checkSumOfTwoPositiveInts(){
        assertEquals(6, calculator.calculateSumOfTwoIntegerValues(4, 2));
    }

    @Test
    public void checkSumOfTwoNegativeInts(){
        assertEquals(-6, calculator.calculateSumOfTwoIntegerValues(-4, -2));
    }
    @Test
    public void checkSumOfPositiveAndNegativeInts(){
        assertEquals(2, calculator.calculateSumOfTwoIntegerValues(4, -2));
    }

    @Test
    public void checkSumOfPositiveIntAndZero(){
        assertEquals(4, calculator.calculateSumOfTwoIntegerValues(4, 0));
    }

    @Test
    public void checkSumOfNegativeIntAndZero(){
        assertEquals(-4, calculator.calculateSumOfTwoIntegerValues(-4, 0));
    }

    @Test
    public void checkSubtractionOfTwoPositiveInts(){
        assertEquals(2, calculator.calculateSubtractionOfTwoIntegers(4, 2));
    }

    @Test
    public void checkSubtractionOfTwoNegativeInts(){
        assertEquals(-6, calculator.calculateSumOfTwoIntegerValues(-4, -2));
    }

    @Test
    public void checkSubtractionOfPositiveAndNegativeInts(){
        assertEquals(-2, calculator.calculateSumOfTwoIntegerValues(-4, 2));
    }

    @Test
    public void checkSubtractionOfPositiveAndZeroInts(){
        assertEquals(4, calculator.calculateSumOfTwoIntegerValues(4, 0));
    }

    @Test
    public void checkSubtractionOfNegativeAndZeroInts(){
        assertEquals(-4, calculator.calculateSumOfTwoIntegerValues(-4, 0));
    }

    @Test
    public void isFirstValueGreaterThanSecond(){
        assertFalse(calculator.returnCompareResult(6,4));
    }

    @Test
    public void isSecondValueGreaterThanFirst(){
        assertTrue(calculator.returnCompareResult(2,4));
    }

    @Test
    public void checkIfBothValuesAreEqual(){
        assertFalse(calculator.returnCompareResult(4,2));
    }

    @Test
    public void division(){
        assertEquals (1.0, calculator.calculateDivisionOfTwoValues (2.01,2.01, 0.001));
    }

    @Test
    public void divisionWithOneNegativeValue(){
        assertEquals(-2.0, calculator.calculateDivisionOfTwoValues(-4.02,2.01, 0.001));
    }

    @Test
    public void divisionWithBothNegativeValues(){
        assertEquals(1.0,  calculator.calculateDivisionOfTwoValues(-2.02, -2.02, 0.001));
    }

    @Test
    public void testZeroDivision() {
       assertEquals (0, calculator.calculateDivisionOfZeroValue(2.02,0.00));
    }

    @Test
    public void multiplication(){
        assertEquals(4.0804, calculator.calculateMultiplicationOfTwoValues(2.02,2.02,0.001));
    }

    @Test
    public void multiplicationWithOneNegativeValue(){
        assertEquals(-5, calculator.calculateMultiplicationOfTwoValues(1,-5,0.1));
    }

    @Test
    public void multiplicationWithBothNegativeValues(){
        assertEquals(25, calculator.calculateMultiplicationOfTwoValues(-5, -5, 0.001));
    }

    @Test
    public void multiplicationOfZeroValue(){
        assertEquals(0, calculator.calculateMultiplicationOfTwoValues(0,5, 0.001));
    }

}
