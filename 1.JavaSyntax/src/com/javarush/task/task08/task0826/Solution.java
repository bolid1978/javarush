package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Пять победителей
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }




        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
      //  System.out.println(Arrays.toString(array));
        Arrays.sort(array);
     //   System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int a=array[i];array[i]=array[array.length-1-i];array[array.length-1-i]=a;
        }
     //   System.out.println(Arrays.toString(array));
    }
}
