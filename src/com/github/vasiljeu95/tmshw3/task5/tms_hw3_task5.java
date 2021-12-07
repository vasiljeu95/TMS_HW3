package com.github.vasiljeu95.tmshw3.task5;

import java.util.Scanner;

public class tms_hw3_task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char t = text.charAt(i);

            if (i%2 == 0) {
                System.out.println(t);
            }
        }
    }
}
