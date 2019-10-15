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
        CollectClass instance = new CollectClass();
        instance.student.put("YOB", "1990");
        instance.student2.put("YOB", "2000");
        int expResult = 1990;
        int result = instance.compareAge(instance.student, instance.student2);
        assertEquals(expResult, result);
       
    }
    
    public void testCompareAge2() {
        System.out.println("compareAge");
        CollectClass instance = new CollectClass();
        instance.student.put("YOB", "1745");
        instance.student2.put("YOB", "1780");
        int expResult = 1745;
        int result = instance.compareAge(instance.student, instance.student2);
        assertEquals(expResult, result);
       
    }
    
    public void testCompareAge3() {
        System.out.println("compareAge");
        CollectClass instance = new CollectClass();
        instance.student.put("YOB", "1921");
        instance.student2.put("YOB", "1954");
        int expResult = 1921;
        int result = instance.compareAge(instance.student, instance.student2);
        assertEquals(expResult, result);
       
    }
}
