/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
public class AppTest {
    
    public AppTest() {
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class App.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        App instance = new App();
        instance.read();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finsh method, of class App.
     */
    @Test
    public void testFinsh() {
        System.out.println("finsh");
        App instance = new App();
        boolean expResult = false;
        boolean result = instance.finsh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solve method, of class App.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        App instance = new App();
        instance.solve();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class App.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        App instance = new App();
        instance.write();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSample1(){
        App app = new App();
        app.a = 100;
        app.b = 100;
        app.s = 1;
        app.m = 1;
        app.n = 1;
        app.solve();
        assertEquals(app.Angle, 45.00,0.01);
        assertEquals(app.Velocity, 141.42,0.01);
    }
}
