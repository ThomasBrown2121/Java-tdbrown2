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
 * @author arizo
 */
public class Application3Test {
    
    /**
     * Test of Eucli method, of class Application3.
     */
    @Test
    public void testEucli1() {
        System.out.println("Eucli");
        Application3 instance = new Application3();
        instance.Radius = 3;
        instance.Eucli();
        assertEquals(instance.Euclidean,28.2743, .001); 
    }
    public void testEucli2() {
        System.out.println("Eucli");
        Application3 instance = new Application3();
        instance.Radius = 4;
        instance.Eucli();
        assertEquals(instance.Euclidean,50.2654, .001); 
    }
  
    public void testEucli3() {
        System.out.println("Eucli");
        Application3 instance = new Application3();
        instance.Radius = 6;
        instance.Eucli();
        assertEquals(instance.Euclidean,113.0973, .001); 
    }
    /**
     * Test of Taxicab method, of class Application3.
     */
    @Test
    
    public void testTaxicab1() {
        System.out.println("Taxicab");
        Application3 instance = new Application3();
        instance.Radius = 3;
        instance.Taxicab();
        assertEquals(instance.taxicab,18.000, .001);
    }
    
    public void testTaxicab2() {
        System.out.println("Taxicab");
        Application3 instance = new Application3();
        instance.Radius = 4;
        instance.Taxicab();
        assertEquals(instance.taxicab,32.000, .001);
    }
    
    public void testTaxicab3() {
        System.out.println("Taxicab");
        Application3 instance = new Application3();
        instance.Radius = 6;
        instance.Taxicab();
        assertEquals(instance.taxicab,72.000, .001);
    }
}
