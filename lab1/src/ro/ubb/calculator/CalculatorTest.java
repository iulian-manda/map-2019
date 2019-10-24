package ro.ubb.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add_1and2() {
        int result = calculator.add(1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void add_1and10() {
        int result = calculator.add(1, 10);
        Assert.assertEquals(11, result);
    }

    @Test
    public void add_overflow() {
        int result = calculator.add(Integer.MAX_VALUE, 1);
        Assert.assertEquals(Integer.MIN_VALUE, result);
    }

}
