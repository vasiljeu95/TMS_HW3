package com.github.vasiljeu95.tmshw3.task3;
import java.util.Scanner;
import java.util.Arrays;

public class tms_hw3_task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] textArr = text.split(" ");

        // преобразуем строковый массив в массив int
        int [] intArray = new int[textArr.length];
        for(int i = 0 ; i < textArr.length; i ++){
            intArray[i] = Integer.parseInt(textArr[i]);
        }

        Arrays.sort(intArray);

        System.out.println("Min – " + intArray[0]);
        System.out.println("Max – " + intArray[intArray.length-1]);
    }
}
