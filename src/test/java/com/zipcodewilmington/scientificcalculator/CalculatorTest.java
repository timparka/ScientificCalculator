package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void threePlusSevenShouldEqualTen() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(3, 7));
    }

    @Test
    public void tenMinusFourShouldEqualSix() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    public void twoTimesEightShouldEqualSixteen() {
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.multiply(2, 8));
    }

    @Test
    public void TwentyoneDividedBySevenShouldEqualThree() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(21, 7));
    }

}