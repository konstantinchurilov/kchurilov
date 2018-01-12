package ru.job4j.even.numbers.iterator;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class EvenNumbersIteratorTest {
    private EvenNumbersIterator createEvenNumbersIterator(int[] numbers) {
        return new EvenNumbersIterator(numbers);
    }

    @Test
    public void checkAllEvenArray() {
        EvenNumbersIterator evenIter = createEvenNumbersIterator(new int[]{2, 4, 6, 8});
        assertTrue(evenIter.hasNext());
        assertEquals("2", 2, evenIter.next());
        assertTrue(evenIter.hasNext());
        assertEquals("4", 4, evenIter.next());
        assertTrue(evenIter.hasNext());
        assertEquals("6", 6, evenIter.next());
        assertTrue(evenIter.hasNext());
        assertEquals("8", 8, evenIter.next());
        assertFalse(evenIter.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void checkArrayWithOneElement() {
        EvenNumbersIterator evenIter = createEvenNumbersIterator(new int[]{2});
        assertTrue(evenIter.hasNext());
        evenIter.next();
        evenIter.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void checkEmptyArray() {
        EvenNumbersIterator evenIter = createEvenNumbersIterator(new int[]{});
        assertFalse(evenIter.hasNext());
        evenIter.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void checkArrayWithAllNotEvenNumbers() {
        EvenNumbersIterator evenIter = createEvenNumbersIterator(new int[]{1, 3, 5, 7, 9, 11});
        assertFalse(evenIter.hasNext());
        evenIter.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void checkArrayWithOneNotEvenNumber() {
        int[] nums = new int[1];
        nums[0] = 3;
        EvenNumbersIterator evenIter = createEvenNumbersIterator(nums);
        assertFalse(evenIter.hasNext());
        evenIter.next();
    }
}
