package com.javalesson.operators;

public class Operators {

    public static void main(String[] Args) {
//        + - / * %
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;
        double e = a * b;
        double f = a / b;
        double g = a % b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);


//        a = a + 5; //также можно: a+=5
        ++a;
        System.out.println("newA = " + a);
        --b;
        System.out.println("newB = " + b);

        double n = 7;
        double m = 7;

        double res1 = 2 * n++; //сначала рассчитывается res1
        double res2 = 2 * ++m; //сначала увеличивается m, затем рассчитывается res2

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

//        == >= <= < > != && || ?:
        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = m >= n;

        System.out.println("boolVal = " + boolVal);

        boolean boolVal2 = y > z;

        boolean resultBool = boolVal || boolVal2;

        System.out.println("resultBool = " + resultBool);

        int res = (x > y) && (z < y) ? x : y;

        System.out.println("res = " + res);
        System.out.println("NOT " + !(x > y));
    }
}
