package com.company;

public class M_Task3 {
    public static void main(String[] args) {
        int[] array;
        array = new int[15];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
            System.out.println(array[i]);
            if (i%2 == 0){
             count = count + 1;
            }
        }
        System.out.println("колличество четных" + count);
    }
}
