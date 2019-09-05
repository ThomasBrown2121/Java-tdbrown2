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
        String expResult = "World";
        String result = instance.getwho();
        assertEquals(expResult, result);
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
    }
    /**
     * Test of setwho method, of class App.
     */
    
    public void testSetwho() {
        System.out.println("setwho");
        String who = "Rando";
        App app = new App();
        app.setwho(who);
        String expResult = who;
        String result = app.getwho();
        assertEquals(expResult,result);
    }
        

    /**
     * Test of getGreeting method, of class App.
     */
    
    public void testGetGreeting() {
        System.out.println("getGreeting");
        App instance = new App();
        String expResult = "Hello";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGreeting method, of class App.
     */
    @Test
    public void testSetGreeting() {
        System.out.println("setGreeting");
        String greeting = "Rando";
        App instance = new App();
        instance.setGreeting(greeting);
        String result = instance.getGreeting();
        String expResult = greeting;
        assertEquals(expResult, result);
    }

  
    /**
     * Test of get who method, of class App.
     */
    @Test
    public void testGetwho() {
        System.out.println("getwho");
        App instance = new App();
        String expResult = "World";
        String result = instance.getwho();
        assertEquals(expResult, result);
    }
}
