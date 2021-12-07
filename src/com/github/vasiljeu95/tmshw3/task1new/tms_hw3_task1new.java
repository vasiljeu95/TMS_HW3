package com.github.vasiljeu95.tmshw3.task1new;

import java.util.Random;

public class tms_hw3_task1new {
    public static void main(String[] args) {
        String[] text = {"one", "two", "three", "four"};

        Random random = new Random();
        int num = random.nextInt(0, text.length);

        System.out.println(text[num]);
    }
}
