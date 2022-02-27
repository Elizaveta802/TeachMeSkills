package com.company;

public class Task3 {
    // Вычислить: 1+2+4+8+...+256
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 257) {// write your code here{
            sum = sum + i;
            i = 2 * i;
        }
        System.out.println(sum);
    }
}


