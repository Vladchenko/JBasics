/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.ru.tinyprogs;

import java.util.List;
import java.util.SortedMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v.yanchenko
 */
public class BeginnersTasksTest {
    
    public BeginnersTasksTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testTask1() {
        
        BeginnersTasks smtsk = new BeginnersTasks();
        assertEquals(smtsk.task1("1234567890"), "1234567890");
        assertEquals(smtsk.task1("1111111111"), "1(10)");
        assertEquals(smtsk.task1("1111122222"), "1(5)2(5)");
        assertEquals(smtsk.task1("xxxxx12345"), "x(5)12345");
        assertEquals(smtsk.task1("1234iiii"), "1234i(4)");
        assertEquals(smtsk.task1("1234iiiin"), "1234i(4)n");
        assertEquals(smtsk.task1("y1234iiii"), "y1234i(4)");
        assertEquals(smtsk.task1("f1234iiiih"), "f1234i(4)h");
        assertEquals(smtsk.task1("11111_22222"), "1(5)_2(5)");
        assertEquals(smtsk.task1("1y999_1233345"), "1y9(3)_123(3)45");
        assertEquals(smtsk.task1("11__225556iiii"), "1(2)_(2)2(2)5(3)6i(4)");
        
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testTask1_Mod1() {
        
        BeginnersTasks smtsk = new BeginnersTasks();
        assertEquals(smtsk.task1Mod1("1234567890"), "1234567890");
        assertEquals(smtsk.task1Mod1("1111111111"), "1(10)");
        assertEquals(smtsk.task1Mod1("1111122222"), "1(5)2(5)");
        assertEquals(smtsk.task1Mod1("xxxxx12345"), "x(5)12345");
        assertEquals(smtsk.task1Mod1("1234iiii"), "1234i(4)");
        assertEquals(smtsk.task1Mod1("1234iiiin"), "1234i(4)n");
        assertEquals(smtsk.task1Mod1("y1234iiii"), "y1234i(4)");
        assertEquals(smtsk.task1Mod1("f1234iiiih"), "f1234i(4)h");
        assertEquals(smtsk.task1Mod1("11111_22222"), "1(5)_2(5)");
        assertEquals(smtsk.task1Mod1("1y999_1233345"), "1y9(3)_123(3)45");
        assertEquals(smtsk.task1Mod1("11__225556iiii"), "1(2)_(2)2(2)5(3)6i(4)");
        
//        fail("The test case is a prototype.");
    }    
    
    @Test
    public void testTask1_Mod2() {
        
        BeginnersTasks smtsk = new BeginnersTasks();
        assertEquals(smtsk.task1Mod2("1234567890"), "1234567890");
        assertEquals(smtsk.task1Mod2("1111111111"), "1(10)");
        assertEquals(smtsk.task1Mod2("1111122222"), "1(5)2(5)");
        assertEquals(smtsk.task1Mod2("xxxxx12345"), "x(5)12345");
        assertEquals(smtsk.task1Mod2("1234iiii"), "1234i(4)");
        assertEquals(smtsk.task1Mod2("1234iiiin"), "1234i(4)n");
        assertEquals(smtsk.task1Mod2("y1234iiii"), "y1234i(4)");
        assertEquals(smtsk.task1Mod2("f1234iiiih"), "f1234i(4)h");
        assertEquals(smtsk.task1Mod2("11111_22222"), "1(5)_2(5)");
        assertEquals(smtsk.task1Mod2("1y999_1233345"), "1y9(3)_123(3)45");
        assertEquals(smtsk.task1Mod2("11__225556iiii"), "1(2)_(2)2(2)5(3)6i(4)");
        
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testTask2() {
        BeginnersTasks smtsk = new BeginnersTasks();
        assertEquals(smtsk.task2(0.001), "0.001");
        assertEquals(smtsk.task2(0.00001), "1.0E-5");   // Should it be this way
        assertEquals(smtsk.task2(0.0010000), "0.001");
        assertEquals(smtsk.task2(0.0010090), "0.001009");
        assertEquals(smtsk.task2(10000.), "10000");
        assertEquals(smtsk.task2(14.00), "14");
        assertEquals(smtsk.task2(78.2), "78.2");
        assertEquals(smtsk.task2(3.001), "3.001");
        assertEquals(smtsk.task2(2048.07200), "2048.072");
        assertEquals(smtsk.task2(1.10000000100000000), "1.100000001");
    }
    
}
