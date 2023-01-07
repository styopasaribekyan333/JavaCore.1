package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println(' ');
            for (int j = 0; j < i; j++) {
                System.out.print('*' + " ");
            }
        }
        System.out.println(" ");
        for (int i = -5; i < 0; i++) {
            System.out.println(' ');
            for (int j = -5; j <= i; j++) {
                System.out.print('*' + " ");

            }
        }
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            System.out.println(' ');
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

        }


    }

}


