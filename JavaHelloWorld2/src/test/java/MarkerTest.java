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
public class MarkerTest {
    
   
    /**
     * Test of getcolor method, of class Marker.
     */
    @org.junit.jupiter.api.Test
    public void testGetcolor() {
        System.out.println("getcolor");
        Marker instance = new Marker();
        String expResult = "black";
        String result = instance.getcolor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setcolor method, of class Marker.
     */
    @org.junit.jupiter.api.Test
    public void testSetcolor() {
        System.out.println("setcolor");
        String color = "blue";
        Marker instance = new Marker();
        instance.setcolor(color);
        String expResult = instance.getcolor();
        assertEquals(expResult, color);
       
    }
    
}
