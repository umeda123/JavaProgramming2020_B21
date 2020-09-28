package day07_UnaryOperators;

public class PostPre {

    public static void main(String[] args) {
        int x = 2;
        int y = x++;// post increment: first passes current value 2

        System.out.println(x); //3
        System.out.println(y); // 2

        System.out.println("======================================");
        int x2 = 2;
        System.out.println( x2++ ); //2
        System.out.println(x2); //3

        System.out.println("======================================");
        int x3 = 2;
        System.out.println(--x3);

        System.out.println("======================================");
        int x4 = 8;
        int y4 = x4--; // y4 = 8,

        System.out.println(y4); // 8
        System.out.println(x4); //7

        System.out.println("======================================");
        int a =1; // a=-1

        int b = -a-- + a++ / -a-- * --a;
        //  b = -1 +  0  / - 1  *  -1
       //  b = -1 + 0 * -1
        //b = -1 + 0 =-1

        System.out.println(b);


    }

}
