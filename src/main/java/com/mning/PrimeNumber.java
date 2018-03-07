package com.mning;

public class PrimeNumber {

    public int calculatePrimeNumber(int[] numbers) {
        int count = 0;
        for (int i : numbers) {
            if (isPrime(i)) {
                count = count + i;
            }
        }
        return count;
    }

    private boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        if (number > 3) {
            for (int i = 3; i < number; i = i + 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}