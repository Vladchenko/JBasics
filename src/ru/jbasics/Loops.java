/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.jbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author v.yanchenko
 */
public class Loops {

    int i = 0;
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    List lst = new ArrayList<>();

    public void run() {

        //** Following for statement is valid to compile and run
//        for (; true;) {
//            System.out.println();
//        }
        //** i < arr.length - 2 will traverse up to element "7".
        for (i = 0; i < arr.length - 2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        i = 0;

        for (int i2 : arr) {
            System.out.print(i2 + " ");
        }
        System.out.println("");

        // http://stackoverflow.com/questions/1073919/how-to-convert-int-into-listinteger-in-java
        // This way won't work
//        lst = Arrays.asList(arr);

        // As of iterating through an object type variables, it is required for 
        // such object to implement Iterable interface.
        // http://javarevisited.blogspot.ru/2016/02/how-does-enhanced-for-loop-works-in-java.html

        List<String> listOfCities = new ArrayList<>(
                Arrays.asList(new String[]{"USD", "GBP", "INR"}));
        for (String city : listOfCities) {
            System.out.println(city);
        }
        System.out.println("");

        while (i < arr.length) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        i = 0;

        do {
            System.out.print(lst.get(i) + " ");
            i++;
        } while (i < lst.size());
        System.out.println("");

        System.out.println("Iterator: " + lst.size());
        Iterator itLst = lst.iterator();
        while (itLst.hasNext()) {
            System.out.print(itLst.next() + " ");
        }

        // Prints Hello Hello Goodbye. Each from a next line.
        outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Hello");
                continue outer;
            }
            System.out.println("outer");
        }
        System.out.println("Good-Bye");

    }

    private void demo() {
        // Strangely why this method has no compilation error.
        while (true);
    }
}
