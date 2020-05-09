package com.javalesson.hello;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        byte b = 10; //2^8
        short c = 200; //2^16
        int a = b + 23;
        //Можно делить лонг-число на разряды символом "_"
        long myLongValue = 123_456_789_876L; //хороший тон - устанавливать L в конце лонга.
        float myFloatValue = 23.56F; //2^32
        double myDoubleValue = 56.45D; //2^64

        double sum = a + b + c + myLongValue + myFloatValue + myDoubleValue;

        float floatResult = myFloatValue / 3;

        double myNewDouble = 23.56;
        double myDoubleResult = myNewDouble / 3;

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n'; //перенос строки
        char char4 = '^';
        char char5 = '\u00A9';
        System.out.println("charSum");
        System.out.println(char1 + char2 + char3 + char4 + char5);

        System.out.println("Characters: ");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);


        System.out.println("double myDoubleResult = " + myDoubleResult);
        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("int a = " + a);
        System.out.println("Sum = " + sum);
        System.out.println("float floatResult = " + floatResult);

        boolean b1 = true;
        boolean b2 = false;

        String s = "some string" + char3 + "some other string";
        System.out.println(s);


        short someShort = b;
        int someInt = someShort;
        someInt = (int) myLongValue;

        someShort = (short) someInt; //Casting
        System.out.println("long myLongValue = " + myLongValue);
//        System.out.println("someShort = " + someInt);
        System.out.println("someInt = " + someInt);
    }
}
