package com.mning;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void getFibonacciTest() {
        int actual = fibonacci.getFibonacci(15);
        assertEquals(377, actual);
    }

    @Test
    public void getFibonacciZeroTest() {
        int actual = fibonacci.getFibonacci(0);
        assertEquals(-1, actual);
    }

}