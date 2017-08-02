package com.algo.algorithm_technique.divide_and_conquer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Find the greater closest value in an sorted array. Using binary search
 * <p>
 * Input:
 * a = {-6, 2, 4, 7, 13, 36}
 * x = 5
 * <p>
 * Output:
 * 7
 */
public class GreaterClosestValueSortedArray {

    public int findGreaterClosest(int[] a, int x) {
        if (x < a[0]) {
            return a[0];
        }
        if (x > a[a.length - 1]) {
            return a[a.length - 1];
        }

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (x < a[mid]) {
                hi = mid - 1;
            } else if (x > a[mid]) {
                lo = mid + 1;
            } else {
                return a[mid];
            }
        }
        // lo == hi + 1
        return a[lo];
    }

    @Test
    public void test1() {
        int[] a = new int[]{-6, 2, 4, 7, 13, 36};
        Assert.assertEquals(findGreaterClosest(a, 5), 7);
    }

    @Test
    public void test2() {
        int[] a = new int[]{-6, 2, 4, 7, 13, 36};
        Assert.assertEquals(findGreaterClosest(a, 4), 4);
    }

    @Test
    public void test3() {
        int[] a = new int[]{-6, 2, 4, 7, 13, 36};
        Assert.assertEquals(findGreaterClosest(a, 8), 13);
    }

}
