package ru.job4j.prime.number.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberIteratorTest {
    @Test
    public void findFivePrimeNumber() {
        PrimeNumberIterator pn = new PrimeNumberIterator(new int[]{1, 2, 3, 4, 5, 6, 7, 3571});
        assertTrue(pn.hasNext());
        assertEquals("The firs prime number is", 2, pn.next());
        assertTrue(pn.hasNext());
        assertEquals("The next prime number is", 3, pn.next());
        assertTrue(pn.hasNext());
        assertEquals("The firs prime number is", 5, pn.next());
        assertTrue(pn.hasNext());
        assertEquals("The firs prime number is", 7, pn.next());
        assertTrue(pn.hasNext());
        assertEquals("The firs prime number is", 3571, pn.next());
        assertFalse(pn.hasNext());
    }

    @Test
    public void isNotPrimeNumber() {
        PrimeNumberIterator pn = new PrimeNumberIterator(new int[]{4, 6, 8});
        assertFalse(pn.hasNext());
    }
}
