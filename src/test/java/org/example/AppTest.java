package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    private Calculator calculator;

    @BeforeAll
    static void setUpForAllTest() {
        System.out.println("Setting up ALL");
    }

    @AfterAll
    static void tearDownForAllTest() {
        System.out.println("Closing up ALL");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up calculator object for new test");
    }

    @AfterEach
    void tearDown(){
        System.out.println("This is execution of post condition after each test");
    }

    @Test
    public void checkTwoPositiveValuesEquals(){
        //Calculator calculator = new Calculator();
        assertEquals( 4 , calculator.calculateSumOfTwoIntegerValues(2, 2));
        //assertEquals( 3 , 3);
    }

    @Test
    public void checkTwoNegativeValuesEquals(){
//        Calculator calculator = new Calculator();
        assertEquals( -4 , calculator.calculateSumOfTwoIntegerValues(-2, -2));
    }

    @Test
    public void checkTwoValuesNotEquals(){
        assertNotEquals( 7 , 4);
    }

    @Test
    public void shouldAnswerWithTrue() {
        boolean isTrue = true;
        assertTrue( isTrue );
    }

    @Test
    public void shouldAnswerWithFalse() {
        assertFalse( 4 < 2 );
    }


}
