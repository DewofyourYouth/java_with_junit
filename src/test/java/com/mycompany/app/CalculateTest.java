package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculateTest {
    @Test
    public void testAdd() {
        int[] intArr = { 1, 2, 3 };
        int sum = Calculate.Add(intArr);
        assertEquals(sum, 6);
    }

    @Test
    public void testMean() {
        int[] intArr = { 1, 2, 3, 4, 5 };
        int[] intArr2 = { 1, 10 };
        double mean = Calculate.Mean(intArr);
        assertEquals(mean, 3, 0.01);
        double mean2 = Calculate.Mean(intArr2);
        assertNotEquals(mean2, 7.0, 0.01);
        assertNotEquals(mean2, 7.0, 0.01);
        assertEquals(mean2, 5, 0.01);

    }

    @Test
    public void testMedian() {
        int[] intArr0 = { 4, 2, 3 };
        int[] intArr1 = { 3, 5, 7, 12, 13, 14, 21, 23, 23, 23, 23, 29, 39, 40, 56 };
        int[] intArr2 = { 3, 13, 7, 5, 21, 23, 23, 40, 23, 14, 12, 56, 23, 29 };
        double test0 = Calculate.Median(intArr0);
        double test1 = Calculate.Median(intArr1);
        double test2 = Calculate.Median(intArr2);
        assertEquals(test0, 3, 0.001);
        assertEquals(test1, 23, 0.001);
        assertEquals(test2, 22.0, 0.001);
    }

    @Test
    public void testMode() {
        int[] intArr0 = { 1, 1, 1, 3, 2, 3, 3, 4, 3 };
        int[] intArr1 = { 1, 1, 4, 6, 4, 555, 88, 5, 6, 6, 12, 1, 6, 6 };
        assertEquals(Calculate.Mode(intArr0), 3);
        assertEquals(Calculate.Mode(intArr1), 6);
    }
}
