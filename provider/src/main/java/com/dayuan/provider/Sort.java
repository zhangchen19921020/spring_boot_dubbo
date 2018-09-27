package com.dayuan.provider;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arrays = {7, 9, 5, 6, 8, 4, 3, 1, 2};
        for (int j = 0; j < arrays.length - 1; j++) {
            for (int i = 0; i < arrays.length - j - 1; i++) {
                int temp;
                if (arrays[i] > arrays[i + 1]) {
                    temp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
