package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int[] myInts = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i : myInts) {
            sum += i;
        }
        System.out.println(sum / myInts.length);
    }
}
