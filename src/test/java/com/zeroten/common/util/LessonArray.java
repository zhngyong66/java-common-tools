package com.zeroten.common.util;

import org.testng.annotations.Test;

import java.util.Arrays;

import static com.zeroten.common.util.ArrayUtils.sort;

public class LessonArray {
    @Test
    public void testArraySort() {
        int[] arr = {4, 7, 78, 10, 5, 6, 1, -1};
        int[] arr2 = sort(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
