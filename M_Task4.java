public class M_Task4 {
    public static void main(String[] args) {
        int[] array;
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(" " + array[i]);
            if(i%2 != 0){
                array[i] = 0;
            }
        }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i]);
            }
        }
    }

