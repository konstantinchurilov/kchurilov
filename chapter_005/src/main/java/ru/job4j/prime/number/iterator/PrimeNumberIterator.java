package ru.job4j.prime.number.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrimeNumberIterator implements Iterator {

    private int[] numbers;
    private int index = 0;
    private int size;

    public PrimeNumberIterator(final int[] numbers) {
        this.numbers = numbers;
        this.size = numbers.length;
    }

    @Override
    public boolean hasNext() {
        int pointer = index;
        while (pointer < size) {
            if (isPrimeNumber(numbers[pointer])) {
                return true;
            } else {
                pointer++;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int tmp = numbers[index];
        while (index < size) {
            if (isPrimeNumber(tmp)) {
                index++;
                break;
            } else {
                tmp = numbers[++index];
            }
        }
        return tmp;
    }

    private boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}