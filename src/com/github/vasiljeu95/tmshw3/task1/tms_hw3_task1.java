package com.github.vasiljeu95.tmshw3.task1;
import java.util.Scanner;
import java.util.Arrays;

public class tms_hw3_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] textArr = text.split(" ");
        int count = textArr.length/2;

        if (textArr[0] == "") {
            System.out.println("Invalid");
        } else {
            for (int i = 0; i < textArr.length; i++) {

                if (count % 2 == 0){
                    if ((i == count-1) || (i == count)) {
                        continue;
                    }
                } else if (i == count) {
                    continue;
                }

                System.out.print(textArr[i]);
                System.out.print(i != textArr.length - 1 ? " " : "");
            }
        }
    }
}
