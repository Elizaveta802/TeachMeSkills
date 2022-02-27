package com.company;

public class M_Task2 {
    public static void main(String[] args) {
        int[] M = new int[50];
        for (int i = 1; i <= 99; i = i + 1) { //ЧИСЛА В МАССИВЕ
            if (i % 2 == 1) {
                M[i / 2] = i;
            }
        }

        for (int i = 0; i < M.length; i = i + 1) {
            //System.out.println(M1[i]);
            System.out.print(M[i] + " ");
        }
        System.out.println("");

        for (int i = M.length - 1 ; i >= 0; i = i - 1) {
            System.out.print(M[i] + " ");
        }
    }
}
