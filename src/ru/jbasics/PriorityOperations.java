/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.jbasics;

/**
 *
 * @author Влад
 */
public class PriorityOperations {

    public PriorityOperations() {
    }

    public void performPriority() {

        int a,
                b,
                c;

        a = 1;
        b = 1;
        c = ++a + ++b;
        System.out.println(c);  // 4

        a = 1;
        b = 1;
        c = a++ + ++b;
        System.out.println(c);  // 3

        a = 1;
        b = 1;
        c = a++ + b++;
        System.out.println(c);  // 2

        a = 1;
        b = 1;
        c = (a++) + (b++);
        System.out.println(c);  // 2

        a = 1;
        b = 1;
        c = ++a * ++b;
        System.out.println(c);  // 4

        a = 1;
        b = 1;
        c = a++ * ++b;
        System.out.println(c);  // 2

        a = 1;
        b = 1;
        c = a++ * b++;
        System.out.println(c);  // 1

    }

    public void Operations() {

        int a,
                b,
                c;

        a = 100;
        b = ~a;    // Побитовое дополнение (инвертировние битов)
        System.out.println("Inverted a is: " + b);

        //** XOR
        a = 112;        //         00000000 00000000 00000000 01110000
        b = 94;         //         00000000 00000000 00000000 01011110
        c = a ^ b;      // c = 46: 00000000 00000000 00000000 00101110

        //** Сдвиг вправо c учетом знака
        a = -17;        //         11111111 11111111 11111111 11101111
        b = a >> 2;     // b = -5: 11111111 11111111 11111111 11111011

        //** Сдвиг вправо без учета знака
        a = -17;        //         11111111 11111111 11111111 11101111
        b = a >>> 2;    // b:      00111111 11111111 11111111 11111011
                        // b =     1073741819

        boolean isEqual, isNonEqual, isGreater,
                isGreaterOrEqual, isLess, isLessOrEqual;
        int x1 = 5, x2 = 5, x3 = 3, x4 = 7;
        isEqual = x1 == x2;     // isEqual = true
        isNonEqual = x1 != x2;  // isNonEqual = false
        isGreater = x1 > x3;    // isGreater = true
        // isGreaterOrEqual = true
        isGreaterOrEqual = x2 >= x3;
        isLess = x3 < x1;       // isLess = true
        isLessOrEqual = x1 <= x3; // isLessOrEqual = false

    }
}
