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
        assertEquals(25.75, actual, 0.0001);
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
        assertEquals(25.75246, actual, 0.0001);
    }

    @Test
    void shouldSubtractTwoIntegers(){
        int actual = this.calculator.subtract(5,3);
        assertEquals(2, actual);
    }

    @Test
    void shouldSubtractTwoLongs(){
        long actual = this.calculator.subtract(500000L,200000L);
        assertEquals(300000, actual);
    }

    @Test
    void shouldSubtractTwoDoubles(){
        double actual = this.calculator.subtract(15.50,10.30);
        assertEquals(5.20, actual, 0.0001);
    }

    @Test
    void shouldSubtractTwoShorts(){
        short a = 15;
        short b = 10;
        short actual = this.calculator.subtract(a,b);
        assertEquals(5, actual);
    }

    @Test
    void shouldSubtractTwoFloats(){
        float actual = this.calculator.subtract(5.1234f,2.1234f);
        assertEquals(3.0000f, actual, 0.0001);
    }

    @Test
    void shouldMultiplyTwoIntegers(){
        int actual = this.calculator.multiply(6,3);
        assertEquals(18, actual);
    }
    @Test
    void shouldMultiplyTwoLongs(){
        long actual = this.calculator.multiply(500000L,500000L);
        assertEquals(250000000000L, actual);
    }

    @Test
    void shouldMultiplyTwoDoubles(){
        double actual = this.calculator.multiply(5.50,1.30);
        assertEquals(7.15, actual, 0.0001);
    }

    @Test
    void shouldMultiplyTwoShorts(){
        short a = 15;
        short b = 10;
        short actual = this.calculator.multiply(a,b);
        assertEquals(150, actual);
    }

    @Test
    void shouldMultiplyTwoFloats(){
        float actual = this.calculator.multiply(5.1234f,2.1234f);
        assertEquals(10.87902756f, actual, 0.0001);
    }

}

