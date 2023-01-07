package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        char c = 'o';
        int y = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                y = y + 1;
                System.out.println("number of characters։ " + y);
                System.out.println();
            }
        }
        int a;
        int d;
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        a = chars2.length / 2;
        d = a - 1;
        System.out.println("two symbols in the middle։ " + chars2[d] + "," + chars2[a]);
        System.out.println();


        boolean b = false;
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        if (chars3[chars3.length - 1] == 'y') {
            b = true;
        }
        System.out.println(b);
        System.out.println();

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }

        }
    }

}
