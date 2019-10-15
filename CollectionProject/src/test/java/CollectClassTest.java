/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;


/**
 *
 * @author arizo
 */
public class CollectClassTest {
    
    public CollectClassTest() {
    }
    
    @Test
    public void testCompareAge() {
        System.out.println("compareAge");
        Map<String, String> student = null;
        Map<String, String> student2 = null;
        CollectClass instance = new CollectClass();
        int expResult = 0;
        int result = instance.compareAge(student, student2);
        assertEquals(expResult, result);
       
    }
    
}
