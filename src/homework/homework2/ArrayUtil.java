package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30,};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("largest element։ " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        System.out.println("smallest element։ " + min);
        System.out.println();
        int x = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                x = x + 1;
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print("number of odd numbers: " + x);
        System.out.println();
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                y = y + 1;
            }
        }
        System.out.println("number of even numbers: " + y);
        System.out.println();

        System.out.println("first element: " + array[0]);
        System.out.println("middle element " + array[array.length / 2]);
        System.out.println("last element: " + array[array.length - 1]);


        int a;
        double d;
        for (int i = 1; i < array.length; i++) {
            a = array[0] + array[i];
            array[0] = a;

        }
        System.out.print("total amount " + array[0] + "։ ");
        System.out.println("the arithmetic mean:" + array[0] / array.length);


    }


}




