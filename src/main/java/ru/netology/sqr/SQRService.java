package ru.netology.sqr;

public class SQRService {
    public int countNumberOfSquares(int lowBound, int upperBound) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (Math.pow(i, 2) >= lowBound && Math.pow(i, 2) <= upperBound) {
                counter++;
            }
        }
        return counter;
    }
}
