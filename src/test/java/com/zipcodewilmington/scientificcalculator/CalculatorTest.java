package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest{
    @Test
    public void twoPlusTwoEqualsFour() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2.00, 2.00));
    }
    @Test
    public void threePlusSevenEqualsTen() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(3, 7));
    }
    @Test
    public void squareRootOfOneHundredFourtyFourEqualsTwelve() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.sqrt(144));
    }
    @Test
    public void sixMinusTwoEqualsFour() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.sub(6.00, 2.00));
    }
    @Test
    public void sixTimesFiveEqualsThirty() {
        Calculator calc = new Calculator();
        assertEquals(30, calc.mul(6, 5));
    }
    @Test
    public void fiveDividedByFiveEqualsFive() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.div(25, 5));
    }
    @Test
    public void testTestRun() {

    }

    @Test
    public void fourSquaredEqualsSixteen() {
        Calculator calc = new Calculator();
        assertEquals(16, calc.sq(4));
    }

    @Test
    public void fiveToTheSecondPowerEqualsTwentyFive() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.exp(5));
    }

    @Test
    public void fourInverseEqualsPointTwentyFive() {
        Calculator calc = new Calculator();
        assertEquals(.25, calc.inv(4));
    }

    @Test
    public void fiveNegativeEqualsNegativeFive() {
        Calculator calc = new Calculator();
        assertEquals(-5, calc.neg(5));
    }
}