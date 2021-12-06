package com.github.vasiljeu95.tmshw3.task2;
import java.util.Arrays;
import java.util.Scanner;

public class tms_hw3_task2 {
    public static void main(String[] args) {
        int[] arr = new int [4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+5;
        }

        System.out.println(Arrays.toString(arr));
    }
}
