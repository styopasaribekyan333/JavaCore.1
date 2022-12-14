package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int a = 200;
        if (a > 100) {
            System.out.println("a greater than 100" + a);
            System.out.println("a=");
            System.out.println(a);
        }
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x<y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x==y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x>y");
        }
        if (x == y) {
            System.out.println("x==y");
        }
    }
}
