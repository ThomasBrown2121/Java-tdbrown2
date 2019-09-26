/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author arizo
 */
public class Application21Test {
    
    @Test
    public void testAddSuffix() {
        System.out.println("addSuffix");
        Application21 instance = new Application21();
        instance.addSuffix("alice");
        instance.addSuffix("bob");
        assertEquals("alicebob",instance.getResult());
    }

    /**
     * Test of addPrefix method, of class App.
     */
    @Test
    public void testAddPrefix() {
        System.out.println("addPrefix");
        Application21 instance = new Application21();
        instance.addPrefix("alice");
        instance.addPrefix("bob");
        assertEquals("bobalice",instance.getResult());
    }
}
    
    