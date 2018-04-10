package ru.job4j.converter;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Converter {
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            Iterator<Integer> currentIterator = it.next();
            Iterator<Integer> nextIterator = it.next();

            @Override
            public boolean hasNext() {
                return currentIterator.hasNext() || nextIterator.hasNext();
            }

            @Override
            public Integer next() {
                while (hasNext()) {
                    if (currentIterator.hasNext()) {
                        return currentIterator.next();
                    } else {
                        currentIterator = nextIterator;
                        if (it.hasNext()) {
                            nextIterator = it.next();
                        }
                    }
                }
                throw new NoSuchElementException();
            }
        };
    }
}
