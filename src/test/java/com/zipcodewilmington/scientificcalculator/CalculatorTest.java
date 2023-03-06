package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest extends TestCase {

    @Test
    void twoPlusTwoShouldEqualFour() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.run("+", 2));
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        Calculator calculator = new Calculator();
        assertEquals("10", calculator.run("+", "3", "7"));
    }

    @Test
    void tenMinusFourShouldEqualSix() {
        Calculator calculator = new Calculator();
        assertEquals("6", calculator.run("-", "10", "4"));
    }

    @Test
    void twoTimesEightShouldEqualSixteen() {
        Calculator calculator = new Calculator();
        assertEquals("16", calculator.run("*", "2", "8"));
    }

    @Test
    void TwentyoneDividedBySevenShouldEqualThree() {
        Calculator calculator = new Calculator();
        assertEquals("3", calculator.run("/", "21", "7"));
    }

    @Test
    void sixToTheThirdPowerShouldEqualTwoHundredAndSixteen() {
        Calculator calculator = new Calculator();
        assertEquals("216", calculator.run("^", "6", "3"));
    }

    @Test
    void theSquareRootOfOneHundredFourtyFourShouldEqualTwelve() {
        Calculator calculator = new Calculator();
        assertEquals("12", calculator.run("~", "12"));
    }

    @Test
    void placeHolderTestNameInverse() {
        Calculator calculator = new Calculator();
        assertEquals("", calculator.run("1/x", ""));
    }

    void placeHolderTestNameSwitchName() {
        Calculator calculator = new Calculator();
        assertEquals("", calculator.run("1-n", ""));
    }

}


}