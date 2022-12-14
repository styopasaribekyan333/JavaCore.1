package homework;

public class HomeWork1 {
    public static void main(String[] args) {

        for (int i = 6; i > 0; i--) {
            System.out.println(' ');
            for (int j = 0; j < (i); j++) {
                System.out.print('*');
            }
        }
        for (int i = -6; i < 0; i++) {
            System.out.println(' ');
            for (int j = -6; j <= i; j++) {
                System.out.print('*');

            }
        }

    }
}


