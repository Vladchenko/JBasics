/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.jbasics.java.util;

import ru.Utils;

import java.awt.Point;
import java.util.*;

/**
 * @author Software Developer
 */
public class Collections_ {

    /* 
     * This class also includes static size arrays, besides collections.
     * It doesn't look neat and not all the operations are present.
     * Maybe in some future it will become thorough
     */
    //** java.util.Map is present in a different class named Maps.java
    private int width = 5;
    private int height = 5;
    private int length = 10;
    private int arrayLength = 5;
    private String[] strs;

    enum position {

        START, MIDDLE, END
    }

    position pos;

    public Collections_() {

//        staticArrayOperating();
//        printSet(set3);
//        dynamicArrayListOperating();
//        dynamicArrayListOperating();
//        addToListAtRuntime(lst6_2);
//        populateSet(set);
//        printSet(set);
//        removeFromSet(set);
//        printSet(set);
//        
//        
//        System.out.println("ArrayList");
//        
//        showTimings(lst1);
//        System.out.println();
//        
//        System.out.println("LinkedList");
//        showTimings(lst2);
//        populateList(lst1);
//        traverseList(lst1);

        // Array to list conversion
//        Utils.printList(
//                arrayToList(new Integer[]{3,5,8,3})
//        );

        // Array to list conversion
//        Utils.printArr(
//                listToArray(
//                        new ArrayList<Boolean>(
//                                Arrays.asList(
//                                        new Boolean("true"),
//                                        new Boolean("false"),
//                                        new Boolean("true"))
//                        )
//                )
//        );

//        or

        // Array to list conversion
//        Utils.printArr(
//                listToArray(
//                        new ArrayList<Boolean>()
//                                {{
//                                        new Boolean("true");
//                                        new Boolean("false");
//                                        new Boolean("true");
//                        }}
//                )
//        );
    }

    //<editor-fold defaultstate="collapsed" desc="Static size arrays">
    public void staticArrayOperating() {

        /*
         * Following row makes a five-element array referring to an arrays of ten
         * objects of type "char". This statement does NOT allocate memory for any
         * "char" objects. Accessing an undefined array element causes a runtime
         * exception called ArrayIndexOutOfBoundsException. Accessing a defined
         * array element that has not yet been assigned to an object results in a
         * runtime NullPointerException.
         */
        char[][] chars = new char[10][5];

//        int ints1[][] = new int[][];   // Array dimensions missing !
//        int ints2[][] = new int[][10];    // Array incorrect dimension !
        //** Following declarations are also allowed
        char chars2[][] = new char[10][];
        char[] chars3[] = new char[10][5];
        char[][] chars4 = new char[10][5];

        chars4[1] = new char[]{'1', '5', '9', '3'};
        System.out.println("chars4[0] = " + chars4[0]);
        System.out.println("chars4[1] = " + chars4[1]);
        System.out.println("chars4[0][0] = " + chars4[0][0]);
        System.out.println("chars4[1][0] = " + chars4[1][0]);

        // Aggregate initialization
        Object[] o1 = {
                new Point(120, 160),
                new String("123"),
                new Character('1')
        };
        //** Following declaration is not allowed
//        String s[3];
        String[] s = new String[2];
        String[] s_[];
        String[][] s_1 = new String[5][];
        //** Following declaration fires "Array dimension missing"
//        String[] s = new String[];
        String[] s2 = new String[]{"q", "w", "e"}; //** static initialization
        String[] s3 = {"q", "w", "e"}; //** static initialization
        String string1 = "123";
        String string2 = "456";
        String[] strings = new String[]{string1, string2};
        System.out.println(strings[0]);
        int[] arr = {3, 6, 3, 1, 9};    //** static initialization
        arr = new int[]{1, 2};           //** Different way of initialization
        int jj[]={};   // equivalent to - new int[0]

        int[] Array1 = new int[arrayLength];
        int[] Array1_2 = {1, 2, 3, 4, 5};
        Integer[] Array2 = new Integer[arrayLength];
        int[] Array3 = new int[arrayLength];
        int[][] Array4 = new int[arrayLength][arrayLength];

        /**
         * Array's index is only of an int type. Types like byte, short, char
         * can also be used, but will be upcasted to an int implicitly.
         */
        int temp = 0;
        byte i1 = 0;
        temp = Array1[i1];
        short i2 = 0;
        temp = Array1[i2];
        char i3 = 0;
        temp = Array1[i3];
        long i4 = 0;
        /**
         * Long cannot be cast to int implicitly, thus compiler triggers
         * "possibly lossy conversion from long to int" error and doesn't
         * compile.
         */
//        temp = Array1[i4];
        Object arr2[] = new Object[3];
        Object[][] items = new Object[3][];
        items[0] = new Integer[]{1, 2, 4};
        items[1] = new String[]{"a", "b"};
        items[2] = new Float[]{1.0f, 2.0f};
        /**
         * Next row triggers a runtime exception. An array index is negative,
         * some how compiler cannot check this in advance.
         */
//        arr2[-1] = new Object();
        arr2[0] = new Object();
        arr2[1] = null;
        //** Array of "Object" can refer to itself, unlike of any other type.
        arr2[2] = arr2;

        Object arr3[] = {1, null, new Object(), new Character('1'), "fwr"};
        //** Initializing an earlier created array with some default values
        arr3 = new Object[]{new String("!"), 5};

        //** Initializing an earlier created array with some default values
        Array1 = new int[]{4, 9, 34, 8, 0};

        //** Following row provides a hashcode
        System.out.println("Hashcode for an Array4 is: " + Array4);

        // One may use byte or short or char or int as an index type.
        // But not long.
        for (byte i = 0; i < 10; i++) {

        }

        System.out.println("Array1,Array2 values: ");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = (int) (Math.random() * 1000);
            Array2[i] = new Integer(6);
            System.out.print(Array1[i] + "," + Array2[i] + "  ");
        }
        System.out.println();
        System.out.println();

        //* Extra way of traversing an elements of array */
        System.out.println("Array1 values: ");
        for (int i : Array1) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //* Copying contents of an array to another array */
        System.out.println("Array3 length = " + Array3.length);
        System.out.println("Array1(2,3) -> Array3: ");
        Array3 = java.util.Arrays.copyOfRange(Array1, 2, 4);
        for (int i = 0; i < Array3.length; i++) {
            System.out.print(Array3[i] + " ");
        }
        System.out.println("Array3 length = " + Array3.length);
        System.out.println();
        System.out.println();

        //* Assigning a values to 2d array and printing them */
        System.out.println("2d Array: ");
        for (int i = 0; i < Array4.length; i++) {
            for (int j = 0; j < Array4[i].length; j++) {
                Array4[i][j] = (int) (Math.random() * 1000);
                System.out.print(Array4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // This is the way a  2d array-class(object) is instantiated
        Coordinates[][] objectArray;
        objectArray = new Coordinates[width][];
        for (int i = 0; i < objectArray.length; i++) {
            objectArray[i] = new Coordinates[height];
            for (int j = 0; j < objectArray[i].length; j++) {
                objectArray[i][j] = new Coordinates();
            }

        }

        // Assigning a values to 2d array-class and printing them
        System.out.println("2d array-class(object)");
        for (int i = 0; i < objectArray.length; i++) {
            for (int j = 0; j < objectArray[i].length; j++) {
                objectArray[i][j].x = (int) (Math.random() * 1000);
                objectArray[i][j].y = (int) (Math.random() * 1000);
                System.out.print("x=" + objectArray[i][j].x + " " + "y=" + objectArray[i][j].y + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Dynamic size arrays">
    //** An old way of using lists (before Java 5). Not parametrized lists.
    //** 10 is an initial size of a list.
    private List lst1 = new ArrayList(10);
    /**
     * A possible, but a bad way of declaring a lists. Use interface instead
     * of class, i.e. - List instead of an ArrayList.
     */
    private ArrayList lst1_ = new ArrayList();
    // Left side parametrized list, with raw type at a right side.
    // This is no good. Use <>, to get proper generic operating.
    // http://stackoverflow.com/questions/4166966/what-is-the-point-of-the-diamond-operator-in-java-7
    private List<Integer> lst2 = new LinkedList();
    //** Parametrized list, with no type defined in right part.
    private List<String> lst2_2 = new ArrayList<>();
    //** Immutable (cannot be modified) empty list 
    private List<Double> lst3 = Collections.emptyList();
    //** Collection is a predecessor of a List, so this is allowed
    private Collection<Float> lst5 = new Vector<>();
    //** Statically populated list. Cannot be modified.
    private List<Character> lst4 = Arrays.asList('1', '2', '3');
    //** Statically populated list. CAN be modified !
    private List<Character> lst4_2 = new ArrayList<>(Arrays.asList('1','2','3'));

    //** Statically populated list
    private List<String> lst6 = new ArrayList<String>() {
        {
            add("one");
            add("two");
            add("three");
        }
    };
    private List lst6_2 = new ArrayList<String>() {
        {
            add("one");
            add("two");
//            add(10);  // Cannot be added at compile time
            // but can be added at runtime, check addToListAtRuntime method.
        }
    };
    private List<?> lst7 = new ArrayList<>();
    /**
     * Переменная numList может хранить ссылку только на список, содержащий
     * элементы унаследованные от Number.
     */
    List<? extends Number> numList = new ArrayList<Integer>();
    /**
     * Выражение <? super X> означает, что вы можете использовать любой базовый
     * тип (класс или интерфейс) типа Х, а также и сам тип Х.
     */
    List<? super Integer> intList = new ArrayList<Integer>();

    private class Coordinates {

        private int x;
        private int y;
    }

    private List<Coordinates> lst8 = new ArrayList<>();
    private List<Coordinates> lst9 = new LinkedList<>();

    public void dynamicArrayListOperating() {

        //** Putting to "i" a value that is to be a size of a "lst1"
        int i = (int) (Math.random() * 5) + 5;
        //** Populating a "lst1"
        while (i > 0) {
            lst8.add(new Coordinates());
            i--;
        }
        i = 0;
        //** Printing a "lst1"
        while (i < lst8.size()) {
            System.out.println(lst8.get(i));
            i++;
        }
        System.out.println();
        //** Adding more elements to "lst1"
        i = (int) (Math.random() * 3) + 1;
        while (i > 0) {
            lst8.add(new Coordinates());
            i--;
        }

        //** Extra way of passing through an ArrayList
        System.out.println("Traversing through an ArrayList using Iterator");
        for (Iterator<Coordinates> it = lst8.iterator(); it.hasNext(); ) {
            Collections_.Coordinates class1 = it.next();
            System.out.println(class1);
        }
        System.out.println();

        //** Extra way of passing through an ArrayList
        System.out.println("Traversing through an ArrayList using ListIterator");
        for (ListIterator<Coordinates> it = lst8.listIterator(); it.hasNext(); ) {
            Collections_.Coordinates class1 = it.next();
            System.out.println(class1);
        }
        System.out.println();

        //** Extra way of passing through an ArrayList
        System.out.println("Traversing through an ArrayList using "
                + "Collections.Coordinates class1 : lst1");
        for (Collections_.Coordinates class1 : lst8) {
            System.out.println(class1);
        }
        System.out.println();

        //** Removing a several items from an ArrayList
        i = (int) (Math.random() * 4) + 1;
        while (i > 0) {
            lst8.remove(1);
            i--;
        }
        /**
         * As of removing an elements from ArrayList. There are 2 methods for
         * removal - clear() and removeAll(Collection c). clear() removes all
         * the elements, its cost is O(n), removeAll removes the elements
         * present in Collection c, its cost is O(n^2). Eventually when removing
         * all the elements it is better to use clear() method.
         */
        //** Printing a values of "lst1" to console
        for (int j = 0; j < lst8.size(); j++) {
            Collections_.Coordinates class1 = lst8.get(j);
            System.out.println(class1);
        }

        // Throws java.lang.UnsupportedOperationException, since the lst4 is
//        populateList(lst4);
        // Same error.
//        lst4.remove(1);
        // This works fine, because no change of a size of an array in this list.
        lst4.set(1, '8');
//        populateList(lst4_2);


    }

    void populateList(List lst) {
        for (int i = 0; i < length; i++) {
            lst.add(0);
        }
    }

    void populateListByDefault() {
        List<String> shapes = new ArrayList<String>(){{
            new String("Hey");
            new String("Hi");
            new String("Hello");
        }};
    }

    void removeList(List lst, position pos) {
        if (pos == position.START) {
            for (int i = 0; i < length; i++) {
                lst.remove(0);
            }
        }
        if (pos == position.MIDDLE) {
            for (int i = 0; i < length; i++) {
                lst.remove(lst.size() / 2);
            }
        }
        if (pos == position.END) {
            for (int i = 0; i < length; i++) {
                lst.remove(lst.size() - 1);
            }
        }
    }

    void showTimings(List lst) {

        System.out.println("Adding data:");
        long start = System.currentTimeMillis();
        populateList(lst);
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");

        System.out.println("Removing data at 1st index:");
        start = System.currentTimeMillis();
        removeList(lst, position.START);
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");

        populateList(lst);
        System.out.println("Removing data at MIDDLE index:");
        start = System.currentTimeMillis();
        removeList(lst, position.MIDDLE);
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");

        populateList(lst);
        System.out.println("Removing data at LAST index:");
        start = System.currentTimeMillis();
        removeList(lst, position.END);
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");

    }

    void traverseList(List lst) {
        //** Only in Java 8
//        lst.stream().forEach(str -> System.out.println(str));
//        
//        lst.stream()
//         .filter(country -> country.contains("n"))
//         .forEach(str -> System.out.println(str));
//        
//        lst.stream()
//         .filter(country -> country.contains("n"))
//         .forEach(System.out::println);

        for (int i = 0; i < lst.size(); i++) {
            System.out.println("# " + i + " : " + lst.get(i));
        }

        for (Object lstItem : lst) {
            System.out.print((int) lstItem + " ");
        }

        for (Iterator it = lst.iterator(); it.hasNext(); ) {
            Object object = it.next();
            System.out.print(object + " ");
        }

        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()) {
            int number = itr.next();
            System.out.print(number + " ");
        }

        ListIterator<Integer> listItr = lst.listIterator();
        while (listItr.hasNext()) {
            int number = listItr.next();
            System.out.print(number + " ");
        }
    }

    void operateList() {
        //** Making a list from an array
        List lst1 = Arrays.asList(strs);
        List lst2 = Arrays.asList("one", "two", "three");
        List lst3 = Arrays.asList(new String[]{"one", "two", "three"});
        //** For further making an ArrayList from List, do
        ArrayList alst1 = new ArrayList<>(lst2);
        /**
         * Arrays.asList() can not be used as regular List for further adding or
         * removing elements. It's kind of fixed length Lists which doesn't
         * support addition and removal of elements. Nevertheless its clean
         * solution for creating and initializing List in Java in one line,
         * quite useful for testing purpose.
         */
    }

    void addToListAtRuntime(List lst) {
        lst.add(10);
        lst.add(new Character('2'));
        for (Object oLst : lst) {
            System.out.println(oLst);
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sets">
    /*
     * Java Set example
     * http://examples.javacodegeeks.com/core-java/util/set/java-set-example/
     * 
     */
    //** Set that can hold any kind of objects, i.e. instances of Object
    Set set = new HashSet();
    //** Set that can hold Integer objects
    Set<Integer> set2 = new HashSet();

    // Populating a set using an object initializer.
    Set<Character> set3 = new HashSet() {
        // Object initializer
        {
            add('1');
            add('X');
            add('!');
        }
    };

    void populateSet(Set set) {

        set.add("1");
        set.add(new Object());
        set.add(2);
        set.add('3');

        //** Traversing through, extra way
//            for (String s : setThree) {
//                System.out.println(s);
//            }
        //** Traversing through, extra way
        //** In Java 8.0
//            set.forEach(System.out::println);
        //** Traversing through, extra way
        //** In Java 8.0
//        set.stream().forEach((elem) -> {
//      System.out.println(elem);
//});
//        System.out.println("populateSet() method out.");
    }

    void printSet(Set set) {

        /**
         * Since Set interface or HashSet class doesn't provide a get() method
         * to retrieve elements, the only way to take out elements from a Set is
         * to iterate over it by using Iterator, or loop over Set using advanced
         * for loop of Java 5.
         *
         */
        System.out.println("Set elements are:");
        //** Traversing through the set
        if (set.isEmpty()) {
            System.out.println("Set is empty");
        }
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("Element: class-" 
//                    + iterator.getClass() 
//                    + " value-" 
//                    + iterator.next());
//        }
        for (Object st : set) {
            System.out.print(st + ", ");
        }
        // iterating over HashSet using forEach() method in Java 8 
//        set.forEach(System.out::println);
        System.out.println("");

    }

    void removeFromSet(Set set) {

        System.out.println("removeFromSet method");
        /**
         * Removal using "iterator" method doesn't make any changes to set.
         */
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            //** At next row, there is a problem
//            set.remove(iterator.hasNext());
//            break;
//        }
        /**
         * Following code is well used, has to have a "break" statement after
         * removal. It removes a first element from a set.
         */
        for (Object setItem : set) {
            set.remove(setItem);
            break;
        }

    }
    //</editor-fold>

    public void listDemo1() {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map1.put( "Number1", new Integer( 100 ) );
        map1.put( "Number2", new Integer( 200 ) );
        map1.put( "Number3", new Integer( 300 ) );
        // One can put Map interface in a diamond operator.
        List<Map> list = new ArrayList<>();
        list.add( map1 );
        list.add( map2 );
        HashMap resultMap = (HashMap) list.get( 0 );
        // Prints 200.
        System.out.println( "Number: " + resultMap.get( "Number2" ) );
    }

    // Converting array to list, using int type values only.
    public List<Integer> arrayToList(int[] ints) {

        // This way won't work. Check the link below this row.
//        return Arrays.asList(ints);

        // http://stackoverflow.com/questions/1073919/how-to-convert-int-into-listinteger-in-java
        List intList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            intList.add(ints[i]);
        }
        return intList;
    }

    // Converting array to list using generics.
    // Method is able to process any type.
    public <T> List<T> arrayToList(T[] objects) {

        // This way won't work. Check the link below this row.
//        return Arrays.asList(objects);
        // http://stackoverflow.com/questions/1073919/how-to-convert-int-into-listinteger-in-java

        // This is the only way.
        List<T> intList = new ArrayList<T>();
        for (int i = 0; i < objects.length; i++) {
            intList.add(objects[i]);
        }
        return intList;
    }

    // Converting array to list
    public <T> T[] listToArray(List<T> lst) {
        return (T[]) lst.toArray();
    }

    public void setToList() {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        // Преобразование. 
        List<String> list = new ArrayList<>(set);
    }

    public void listToSet() {
        List<Integer> listInts = new ArrayList<>();
        listInts.add(1);
        listInts.add(2);
        listInts.add(2);
        Set set = new HashSet(listInts);
    }
}
