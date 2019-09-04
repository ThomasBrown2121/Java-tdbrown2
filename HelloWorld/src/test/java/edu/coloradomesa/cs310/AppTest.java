/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.cs310;

import org.junit.*;

import static org.junit.Assert.*;


/**
 *
 * @author arizo
 */
public class AppTest {
    
    public AppTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetDefaultwho() {
        System.out.println("getwho");
        App instance = new App();
        String expResult = "thomas";
        String result = instance.getwho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
 public void testGetnonDefaultwho() {
        System.out.println("getwho");
        App instance = new App();
        String value = "not" + instance.getwho();
        instance.setwho(value);
        String expResult = value;
        String result = instance.getwho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setwho method, of class App.
     */
    
    public void testSetwho() {
        System.out.println("setwho");
        String who = "";
        App instance = new App();
        instance.setwho(who);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGreeting method, of class App.
     */
    
    public void testGetGreeting() {
        System.out.println("getGreeting");
        App instance = new App();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGreeting method, of class App.
     */
    @org.junit.jupiter.api.Test
    public void testSetGreeting() {
        System.out.println("setGreeting");
        String greeting = "";
        App instance = new App();
        instance.setGreeting(greeting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class App.
     */
    @org.junit.jupiter.api.Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getwho method, of class App.
     */
    @Test
    public void testGetwho() {
        System.out.println("getwho");
        App instance = new App();
        String expResult = " ";
        String result = instance.getwho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spin method, of class App.
     */
    @Test
    public void testSpin() {
        System.out.println("spin");
        App instance = new App();
        String expResult = "thomas";
        String result = instance.getwho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
