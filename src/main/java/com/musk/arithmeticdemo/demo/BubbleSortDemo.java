package com.musk.arithmeticdemo.demo;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 1, 4, 7, 3};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }

    public static int[] BubbleSort(int[] arr) {
        //一共要排序length-1轮,每次比较length-轮数次
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
