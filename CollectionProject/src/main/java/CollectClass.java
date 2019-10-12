
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Thomas Brown II
 * 
 */
public class CollectClass {
    
    
    
    public static void main(String args [])
    {
        Map < String, Integer > hm = new HashMap < String, Integer > ();
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        
        Set < Map.Entry < String, Integer > > ht = hm.entrySet();
        
        for (Map.Entry < String, Integer > me : ht)
        {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
        

    }
}
