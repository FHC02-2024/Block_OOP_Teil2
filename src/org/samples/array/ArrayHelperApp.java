package org.samples.array;

import java.util.Arrays;

public class ArrayHelperApp {

    public static void main(String[] args) {
        int[] arr = {14, 12, 20, 24, 8, 26, 1, 2, 3};

        System.out.println("original: " + toString(arr));
        System.out.println("resvers: " + toString(reverse(arr)));

        System.out.println("findIndex(arr, 24) = " + findIndex(arr, 24));
        System.out.println("findIndex(arr, 99) = " + findIndex(arr, 99));

        System.out.println("calcSum(arr) = " + calcSum(arr));
    }

    public static String toString(int[] numbers) {
        String result = "";
        for (int value : numbers) {
            result += value + ", ";
        }

        return result;
    }

    public static int findIndex(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }

        return -1;
    }
    
    public static int calcSum(int[] numbers) {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return sum;
    }

    public static int[] reverse(int[] numbers) {

        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            int newIndex = numbers.length - 1 - i;
            result[newIndex] = numbers[i];
        }

        return result;
    }
}
