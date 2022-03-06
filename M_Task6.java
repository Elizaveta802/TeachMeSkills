public class M_Task6 {
    //Создайте массив из 4 случайных целых чисел из отрезка (0;10),
    //Выведите его на экран в строку. Определить и вывести на экран сообщение о том,
    //является ли массив строго возрастающей последовательностью
    public static void main(String[] args) {
        int temp = 0;
        boolean bool = true;
        int[] array1 = new int[4];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
            System.out.print(array1[i] + " ");
            if (temp >= array1[i])
                bool = false;
                temp = array1[i];

        }
        if (bool) {
            System.out.print("СТРОГО ВОЗРАСТАЮЩИЙ МАССИВ");
        } else {
            System.out.print("НЕ СТРОГО ВОЗРАСТАЮЩИЙ МАССИВ");
        }
    }
}
