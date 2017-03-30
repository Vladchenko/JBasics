/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.jbasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author v.yanchenko
 */
public class Generics {

    /*
     * You can use a type variable, such as T above, almost any place you can 
     *  use the name of a type. Here are the exceptions:
     *  - You cannot declare static variables of a type variable: static T thing;
     *  - You cannot return a type variable from a static method: 
     *  static T getValue() { return someT; }
     *  - You can declare, but not instantiate, an array of a type variable:
     *  T[] values = new T[10];
     *  - You cannot create an array of type-specific generic references: 
     *  Box<T> boxes[] = new Box<T>[10];
     *  - A generic class cannot extend Throwable.
     * 
     * http://www.quizful.net/post/java-generics-tutorial
     * 
     * http://neerc.ifmo.ru/wiki/index.php?title=Generics
     * 
     */
    //** Ordinary arrays used further
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
    Character[] charArray = {'q', 'w', 'e', 'r', 't', 'y'};
    String[] strArray = {"s1", "s2", "s3", "s4", "s5", "s6"};
    /**
     * Raw type (not a generic). This is the way lists were used before Java 5.
     * They allowed adding an items with a different types, that could invoke an
     * exception at runtime.
     */
    List lst1 = new ArrayList();
    /**
     * Putting a type in it, having embraced with a brackets, makes it to become
     * a generic. So this list accepts an instances of a type Double.
     */
    List<Double> lst2 = new ArrayList<>();
//    
    //** Putting an array to a list
    List<String> strList = new ArrayList<>(Arrays.asList(strArray));
    List<Double> doubleList = new ArrayList<>(Arrays.asList(doubleArray));
    /**
     * List with an initialized values in default. Here we use an anonymous
     * inner class with an instance initializer (also known as "double brace
     * initialization").
     */
    List<Double> charList = new ArrayList<Double>() {
        {
            add(10.0);
            add(10.0);
            add(10.0);
        }
    };

    public Generics() {
        printCollection(strList);
        printCollection(doubleList);
    }

    //** Generic class
    public class Box<T> {

        private List<T> contents;

        public Box() {
            contents = new ArrayList<T>();
        }

        public void add(T thing) {
            contents.add(thing);
        }

        public T clear() {
            if (contents.size() > 0) {
                return contents.remove(0);
            } else {
                return null;
            }
        }
    }
    //** Use of a generic class Box.
    Box<Integer> boxes = new Box<>();

    /**
     * Generic method. Prints all the elements in an array of any type. In this
     * case, generic allows to avoid creating all the overloaded methods.
     */
    private <E> void printArray(E[] inputArray) {
        for (E e : inputArray) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    
    //** Used for previous method
    private void printArrays() {
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        printArray(strArray);
    }

    //** Generic method. Determines the largest of three Comparable objects
    private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest       
        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now                 
        }
        return max; // returns the largest object   
    }
    //** Used for previous method
    private void printMax() {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum(3, 4, 5));

        System.out.printf("Maxm of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        System.out.printf("Max of %s, %s and %s is %s\n", "pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
    }

    //** Method prints any collection passed into it.
    private void printCollection(Collection<?> c) {
        for (Iterator<?> i = c.iterator(); i.hasNext();) {
            Object o = i.next();
            System.out.print(o + " ");
        }
    }

    //** Method accepts any type of list
    private void method1(List<?> lst1) {
    }

    //** Generic method. Mostly used to assign values.
    private <T extends Number> void setNumber(List<T> lst1) {
        //** What to put here ?
    }
    
    //** Method accepts a list that is of a type Number or extends it.
    private void sumOfNumbers(List<? extends Number> lst1) {
        double sum = 0;
        for (Number number : lst1) {
            sum += number.doubleValue();
        }
    }

    private void addNumbersToList(List<? super Number> lst1) {
        lst1.add(1);
        lst1.add(new Double(3.8));
    }

    //** Generic interface
    private interface Maps<K, V> {
    }
    
    /*
        Which declaration is to fit to a method that follows right after these 
    rows ?
        1. ArrayList<String> in; List<CharSequence> result;
        2. List<String> in; List<Object> result;
        3. ArrayList<String> in; List result;
        4. List<CharSequence> in; List<CharSequence> result;
        5. ArrayList<Object> in; List<CharSequence> result; 
    
        Answer: Seems like everyone of them, because compiler doesn't complain 
                to any of them.
     */
    public static <E extends CharSequence> List<? super E> doIt(List<E> nums) {
        return new ArrayList();
    }
    
    GenericInstance<String> gi = new GenericInstance<String>("123");
    
    //http://stackoverflow.com/questions/2721546/why-dont-java-generics-support-primitive-types
    // Generics cannot accept a primitive data.
//    GenericInstance<int> gi = new GenericInstance<int>(123);
}

// Simple generic class
class GenericInstance<T> {
    
    private T value;
    
    public GenericInstance(T value) {
        
    }
    
    public T getT() {
        return value;
    }
    
}