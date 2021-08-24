package com.mycompany.app;

import java.util.Arrays;

public class Calculate {
    public static int Add(int[] intArr) {
        int sum = 0;
        for (int i : intArr) {
            sum += i;
        }
        return sum;
    }

    public static double Mean(int[] intArr) {
        int sum = Add(intArr);
        return sum / intArr.length;
    }

    public static double Median(int[] intArr) {
        int index = intArr.length / 2;
        Arrays.sort(intArr);
        if (intArr.length % 2 != 0)
            return intArr[index];
        else {
            int index2 = intArr.length / 2 - 1;
            int[] indices = { intArr[index], intArr[index2] };
            return Mean(indices);

        }
    }

    public static int Mode(int[] intArr) {
        // not yet done
        return 0;
    }
}
