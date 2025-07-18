package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setup(){ calculator = new Calculator(); }

    @Test
    void shouldBeTurnedOff(){
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldTurnOn(){
        calculator.turnOn();
        assertTrue(calculator.isOn());
    }

    @Test
    void shouldTurnOff(){
        calculator.turnOn();
        assertTrue(calculator.isOn());
        calculator.turnOff();
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldBeTurnedOffAfterOpening(){
        calculator.turnOn();
        assertFalse(calculator.isOff());

        calculator.turnOff();
        assertTrue(calculator.isOff());
    }

    @Test
    void shouldAddTwoIntegers(){
        int actual = this.calculator.add(3,2);
        assertEquals(5, actual);
    }

    @Test
    void shouldAddTwoLongs(){
        long actual = this.calculator.add(500000L,500000L);
        assertEquals(1000000, actual);
    }

    @Test
    void shouldAddTwoDoubles(){
        double actual = this.calculator.add(10.25,15.50);
        assertEquals(25.75, actual);
    }
    @Test
    void shouldAddTwoShorts(){
        short a = 15;
        short b = 10;
        short actual = this.calculator.add(a,b);
        assertEquals(25, actual);
    }

    @Test
    void shouldAddTwoFloats(){
        float actual = this.calculator.add(10.25123f,15.50123f);
        assertEquals(25.75246, actual, 0.01);
    }

}

