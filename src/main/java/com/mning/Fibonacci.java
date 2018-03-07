package com.mning;

public class Fibonacci {
    public int getFibonacci(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i > 2) {
            return getFibonacci(i - 1) + getFibonacci(i - 2);
        }
        return -1;
    }
}
