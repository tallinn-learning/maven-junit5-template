package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    private Calculator calc;

    @BeforeAll
    static void setBefor() {
        System.out.println("set befor all");

    }

    @BeforeEach void setUp() {
        calc = new Calculator();
        System.out.println("setting up test env.");
    }

    @AfterEach
    void after() {
        System.out.println("clear test env.");
    }

    @AfterAll
    static void afterT() {
        System.out.println("clear after all");

    }

    @Test
    public void AddTwoPositiveNumbers(){
      //  Calculator calc=new Calculator();
        assertEquals(10, calc.addition(5, 5));
    }
    @Test
    public void AddTwoNegativeNumbers(){
        //Calculator calc=new Calculator();
        assertEquals(-9, calc.addition(-5, -4));
    }
    @Test
    public void AddNumberAndZero(){
        //Calculator calc=new Calculator();
        assertEquals(6, calc.addition(6, 0));
    }
    @Test
    public void AddZeroAndNumber(){
        //Calculator calc=new Calculator();
        assertEquals(3, calc.addition(0, 3));
    }
    @Test
    public void SubtractTwoPositiveNumbers(){
       // Calculator calc=new Calculator();
        assertEquals(1, calc.subtraction(6, 5));
    }
    @Test
    public void SubtractTwoNegativeNumbers(){
       // Calculator calc=new Calculator();
        assertEquals(1, calc.subtraction(-1, -2));
    }
    @Test
    public void SubtractZero(){
       // Calculator calc=new Calculator();
        assertEquals(1, calc.subtraction(1, 0));
    }
    @Test
    public void SubtractFromZero(){
       // Calculator calc=new Calculator();
        assertEquals(-8, calc.subtraction(0, 8));
    }
    @Test
    public void ComparisonWhenNum1Bigger(){
       // Calculator calc=new Calculator();
        assertTrue(calc.isNum1Bigger(5, 4));
    }
    @Test
    public void ComparisonWhenNum1Smaller(){
       // Calculator calc=new Calculator();
        assertFalse(calc.isNum1Bigger(4, 5));
    }
    @Test
    public void ComparisonWhenNumbersAreEqual(){
        //Calculator calc=new Calculator();
        assertFalse(calc.isNum1Bigger(5, 5));
    }
}
