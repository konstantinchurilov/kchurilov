package ru.job4j.even.numbers.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator {
    private int[] numbers;
    private int index = 0;
    private int size;

    public EvenNumbersIterator(final int[] numbers) {
        this.numbers = numbers;
        this.size = numbers.length;
    }

    @Override
    public boolean hasNext() {
        int pointer = index;
        while (pointer < size) {
            if (isEvenNumber(numbers[pointer])) {
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
            if (isEvenNumber(tmp)) {
                index++;
                break;
            } else {
                tmp = numbers[++index];
            }
        }
        return tmp;
    }

    private boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
