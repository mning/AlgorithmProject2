package com.mning;


import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTest {
    private PrimeNumber primeNumber;

    @Before
    public void init() {
        primeNumber = new PrimeNumber();
    }

    @Test
    public void calculatePrimeNumberTest() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int actual = primeNumber.calculatePrimeNumber(input);
        assertEquals(17, actual);
    }

}