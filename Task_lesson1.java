package com.company;

public class Task_lesson1 {

    public static void main(String[] args) {
        double sum = 10;
        double n = 10;
        for (int i = 1; i <= 6; i = i + 1) {
            n = n + n * 0.1;
            sum = sum + n;

        }
        System.out.println(sum);
    }
}
