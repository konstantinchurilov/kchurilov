package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {
    private Calculator createCalculator() {
        return new Calculator();
    }

    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = createCalculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddFivePlusSevenThenTwelve() {
        Calculator calc = createCalculator();
        calc.add(5D, 7D);
        double result = calc.getResult();
        double expected = 12D;
        assertThat(result, is(expected));
    }


    @Test
    public void whenSubtractOneMinusOneThenZero() {
        Calculator calc = createCalculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractSevenMinusFiveThenTwo() {
        Calculator calc = createCalculator();
        calc.subtract(7D, 5D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivisionOneDivOneThenOne() {
        Calculator calc = createCalculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivisionTenDivTwoThenFive() {
        Calculator calc = createCalculator();
        calc.div(10D, 2D);
        double result = calc.getResult();
        double expected = 5D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleOneMultiplyOneThenOne() {
        Calculator calc = createCalculator();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleSevenMultiplyFiveThenThirtyFive() {
        Calculator calc = createCalculator();
        calc.multiple(7D, 5D);
        double result = calc.getResult();
        double expected = 35D;
        assertThat(result, is(expected));
    }
}
