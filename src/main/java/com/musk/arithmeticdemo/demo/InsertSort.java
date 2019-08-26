package com.musk.arithmeticdemo.demo;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 1, 4, 7, 3};
        System.out.println(Arrays.toString(insertSort(arr)));
    }

    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //设定索引为1的为中间值
            int temp = arr[i];
            int j = i;
            //当中间值小于前面的值
            while (j > 0 && temp < arr[j - 1]) {
                //把前面的值赋给中间值
                arr[j] = arr[j - 1];
                //游标自减,当中间值大于或者等于比较的值,并且到索引为0时跳出循环
                j--;
            }
            //把中间值付给最前面的索引的值
            arr[j] = temp;
        }
        return arr;
    }

}
