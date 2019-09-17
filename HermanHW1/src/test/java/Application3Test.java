/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author Thomas Brown II
 */
public class Application3Test {
    
    Application3 ex1(){
        Application3 app = new Application3();
        app.Radius = 1;
        app.Euclidean = 3.141593;
        app.taxicab = 2.000000;
        return app;
    }
    
    
    /**
     * Test of Eucli method, of class Application3.
     */
    @Test
    public void testEucli() {
        
        System.out.println("Eucli");
        int Radius = 0;
        Application3 instance = new Application3();
        double expResult = 0.0;
        //double result = instance.Eucli(Radius);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of Taxicab method, of class Application3.
     */
    @Test
    public void testTaxicab() {
        System.out.println("Taxicab");
        int Radius = 0;
        Application3 instance = new Application3();
        double expResult = 0.0;
       // double result = instance.Taxicab(Radius);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Application3.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Application3 instance = new Application3();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class Application3.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        Application3 instance = new Application3();
        instance.write();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
