package com.github.vasiljeu95.tmshw3.task6;

public class tms_hw3_task6 {
    public static void main(String[] args) {
        Integer a = -50;
        Integer b = a;
        Integer c = a;
        Integer d = a;

        while (a == b) {
            a++;
            b++;
        }
        b--;

        while (c == d) {
            c--;
            d--;
        }
        d++;

        System.out.println("from " + d + " to " + b);
    }
}
