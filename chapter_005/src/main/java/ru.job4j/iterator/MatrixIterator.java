package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIterator implements Iterator {
    private int[][] value;
    private int index = 0;
    private int point = 0;
    private int size;
    private int arrayMarker = 0;

    public MatrixIterator(int[][] value) {
        this.value = value;
        size = countArraySize(value);
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public Object next() {
        int tmp;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (point < value[arrayMarker].length) {
            tmp = value[arrayMarker][point++];
            index++;
        } else {
            arrayMarker++;
            point = 0;
            tmp = value[arrayMarker][point++];
            index++;
        }
        return tmp;
    }

    private int countArraySize(int[][] value) {
        int size = 0;
        for (int i = 0; i < value.length; i++) {
            size += value[i].length;
        }
        return size;
    }
}
