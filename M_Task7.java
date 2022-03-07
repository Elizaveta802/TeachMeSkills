package com.company;
//Создайте массив из 12 случайных целых чисел из отрезка (0;15). Определите  какой
// элемент является в этом массиве макс. и сообщите индекс его последнего вхождения в массив.
public class M_Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int max = 0;
        int max_index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
            if (array[i] > max){
                max = array[i];
                max_index = i;
            }
            System.out.println(array[i]);
        }
        System.out.println("max = " + max);
        System.out.println("max_index = " + max_index);
    }
}