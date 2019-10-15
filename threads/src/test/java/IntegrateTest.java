/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author arizo
 */
public class IntegrateTest {
    
    public IntegrateTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of f method, of class Integrate.
     */
    @Test
    public void testF() {
        System.out.println("f");
        double x = 0.0;
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.f(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of slice method, of class Integrate.
     */
    @Test
    public void testSlice() {
        System.out.println("slice");
        int i = 0;
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.slice(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class Integrate.
     */
    @Test
    public void testEval_0args() {
        System.out.println("eval");
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.eval();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class Integrate.
     */
    @Test
    public void testEval_int_int() {
        System.out.println("eval");
        int i0 = 0;
        int i1 = 0;
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.eval(i0, i1);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parallelEval method, of class Integrate.
     */
    @Test
    public void testParallelEval() {
        System.out.println("parallelEval");
        int threads = 0;
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.parallelEval(threads);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Integrate.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Integrate.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        double value = 0.0;
        Integrate instance = new Integrate();
        instance.setArea(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addArea method, of class Integrate.
     */
    @Test
    public void testAddArea() {
        System.out.println("addArea");
        double delta = 0.0;
        Integrate instance = new Integrate();
        instance.addArea(delta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of x method, of class Integrate.
     */
    @Test
    public void testX() {
        System.out.println("x");
        double i = 0.0;
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.x(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parallelEval method, of class Integrate.
     */
    @Test
    public void testParallelEval_int() {
        System.out.println("parallelEval");
        int threads = 0;
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.parallelEval(threads);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parallelEval method, of class Integrate.
     */
    @Test
    public void testParallelEval_0args() {
        System.out.println("parallelEval");
        Integrate instance = new Integrate();
        double expResult = 0.0;
        double result = instance.parallelEval();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of streamExample method, of class Integrate.
     */
    @Test
    public void testStreamExample() {
        System.out.println("streamExample");
        Integrate instance = new Integrate();
        instance.streamExample();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
