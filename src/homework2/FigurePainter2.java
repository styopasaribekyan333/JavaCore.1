package homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(' ');
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }

        }
        System.out.println(" ");
        for (int i = -4; i < 0; i++) {
            System.out.println(' ');
            for (int j = 0; j >= i; j--) {
                System.out.print(" ");

            }
            for (int j = -4; j <= i; j++) {
                System.out.print("* ");
            }

        }
        for (int i = 3; i > 0; i--) {
            System.out.println(' ');

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");

            }

        }
        System.out.println(" ");
        for (int i = -3; i < 4; i++) {
            System.out.println(' ');
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }

            for (int j = -3; j <= i; j++) {
                System.out.print("* ");
                for (int k = j; k > 0; k--) {
                    System.out.print("  ");
//ես ավելի հակված եմ այս կոդը վերջացնելուն եթե ասեք որ ճիշտ ուղղու վրա եմ,
                }

            }
        }

    }
}
