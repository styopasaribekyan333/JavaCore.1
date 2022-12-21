package homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        if (a > b) {
            System.out.println(a);
        }
        if (b > a) {
            System.out.println(b);

        }
        //այս առայադրանքի ճիշտ կոդը չգտա

        System.out.println(' ');


        int x = 5;
        int y = 10;
        for (int i = x; i <= y; i++) {
            System.out.print((i) + "  ");
        }

        System.out.println("  ");

        a = 88;
        b = 89;
        char c;
        c = (char) a;
        System.out.print(c + "  ");
        c = (char) b;
        System.out.println(c);


        a = 20;
        b = 20;
        boolean q;
        q = (a == b);
        if (q == true) {
            System.out.println("a is equal b");
        }
        if (q == false) {
            System.out.println("a is not equal b");
        }


    }

}
