package chapter3;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x и у: " + x + " " + y);
        }
        System.out.println("x равно "+" "+ x);
    }
}
