public class M_Task5 {
    //Создайте 2 массива из 5 случайных целых чисел из отрезка (0,15) каждый,
    //Посчитайте среднее арифметическое элементов каждого массиива и сообщите, для какого из
    //массивов это значение оказалость больше(либо сообщите, что их средние арифметические равны)
    public static void main(String[] args) {
        double ari1;
        double ari2;
        int sum1 = 0;
        int sum2 = 0;

        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 15);
            sum1 = sum1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        double res1 = (double) sum1 / array1.length;//преобразование из int в double
        System.out.println("\nResult1 = " + res1);

        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 15);
            sum2 = sum2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        double res2 = (double) sum2 / array2.length;
        System.out.println("\nResult2 = " + res2);

        if (res1 > res2)
            System.out.println("Result1 > Result2. Result1 = " + res1);

        if (res1 < res2)
            System.out.println("Result2 > Result1. Result2 = " + res2);

        if (res1 == res2)
            System.out.println("Result1 = Result2");
    }
}
