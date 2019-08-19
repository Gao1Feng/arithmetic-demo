package com.musk.arithmeticdemo.demo;

import java.util.Arrays;

public class SelectSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 1, 4, 7, 3};
        System.out.println(Arrays.toString(SelectSort(arr)));
    }
    public static int[] SelectSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int location = i;
            for(int j = i; j < arr.length-1; j++) {
                if(arr[j+1] < arr[location]) {
                    location = j+1;//记录下最小值的位置
                }
            }
            //交换两个位置的值
            if(location != i) {
                int temp = arr[i];
                arr[i] = arr[location];
                arr[location] = temp;
            }
        }
        return arr;
    }

}
