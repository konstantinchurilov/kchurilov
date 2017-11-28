package ru.job4j.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MultipleArrayIteratorTest {
    private Iterator createIterator(int[][] array) {
        return new MatrixIterator(array);
    }

    @Test
    public void checkHasNextMethod() {
        Iterator it = createIterator(new int[][]{{1}, {2}});
        assertTrue(it.hasNext());
        it.next();
        assertTrue(it.hasNext());
        it.next();
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void checkNextMethod() {
        Iterator it = createIterator(new int[][]{{1}, {2}});
        it.next();
        it.next();
        it.next();
    }

    @Test
    public void checkMatrixArray() {
        Iterator iterator = createIterator(new int[][]{{1, 2}, {3, 4}});
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 4, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void checkJaggedArray() {
        Iterator iterator = createIterator(new int[][]{{1, 2, 3}, {4}});
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 4, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void checkJaggedArrayThreeArrayElements() {
        Iterator iterator = createIterator(new int[][]{{1, 2, 3}, {4}, {77}});
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 4, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 77, iterator.next());
        assertFalse(iterator.hasNext());
    }


    @Test
    public void checkJaggedArrayFiveArrayElements() {
        Iterator iterator = createIterator(new int[][]{{1, 2, 3}, {4}, {77}, {32, 11}, {50, 11, 31}});
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 4, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 77, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 32, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 11, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 50, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 11, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Value is equals: ", 31, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void checkBigArrayWithValue() {
        Iterator it = createIterator(new int[][]{{1, 2, 3, 4, 5, 6}, {7, 8, 9}});
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 1, it.next());
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 2, it.next());
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 3, it.next());
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 4, it.next());
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 5, it.next());
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 6, it.next());
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 7, it.next());
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 8, it.next());
        assertTrue(it.hasNext());
        assertEquals("Value is equals: ", 9, it.next());
        assertFalse(it.hasNext());
    }
}
