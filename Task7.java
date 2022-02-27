package com.company;

public class Task7 {
//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<100){
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        System.out.print(sum);
    }
}
