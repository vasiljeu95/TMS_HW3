package com.github.vasiljeu95.tmshw3.task4;

import java.util.Random;

public class tms_hw3_task4 {
    public static void main(String[] args) {
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        int sum1 = 0;
        int sum2 = 0;

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(-40, 10);
            array2[i] = random.nextInt(-40, 10);
        }

        for (int i = 0; i < 10; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }

        System.out.println(sum1/10);
        System.out.println(sum2/10);
    }
}
