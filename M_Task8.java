package com.company;

// Создайте 2 массива из 10 целых случайных чисел из отрезка (0;9) и третий
// массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//массива должен = соотношению элемента из первого массива с i-ым
//индексом к элементу из второго массива с i-ым индексом. Вывести все три массива
//на экран(каждый на отдельной строке), затем вывести количество
//целых элементов в третьем массиве
public class M_Task8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int numberofint = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 9);
            System.out.print(array1[i] + "");}

        System.out.println();

        for (int j = 0; j < array2.length; j++) {
            array2[j] = (int) (Math.random() * 9);
            System.out.print(array2[j] + "");}

        System.out.println();

            for (int c = 0; c < array3.length; c++) {
                array3[c] = (double) array1[c] / array2[c];
                System.out.print(array3[c] + " ");
            }
        System.out.println();

           for(int i = 0; i < array3.length; i++)
                if(array3[i] % 1 == 0) numberofint++;
        System.out.println("Количество целых элементов в третьем массиве: " + numberofint);
        }
    }

