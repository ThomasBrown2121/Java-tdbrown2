

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 *
 * @author arizo
 */

class SlowCacheKey implements Comparable<SlowCacheKey>{
    String a;
    int b;
    SlowCacheKey(String a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public int compareTo(SlowCacheKey to)
    {
        int ans = a.compareTo(to.a);
        if(ans != 0)
            return ans;
        if(b != to.b)
        {
            if(b < to.b)
            {
                return -1;
            }
            else 
                return -1;
            
        }
            else
            {
                return 0;
            }
        
        }
            
    @Override
    public boolean equals(Object object){
    return compareTo((SlowCacheKey) object) == 0;
        }
    }
    


public class SetEx {
    PrintStream out = System.out;
    void simpleSet(){
        HashSet<String> colors = new HashSet<String>();
        
        colors.add("green");
        
        colors.add("blue");
        
        if(colors.contains("green")){
            out.print("I got green");
        }
    }
    
    void simpleBoxSet(){
        HashMap<Long, String> cache = new HashMap<Long, String>();
        cache.put((123_456_789L), "something");
        
        cache.put(1L, "one");
        
        long key = 1;
        
        out.print("" + key + "->" + cache.get(key));
        
    }
        
    TreeMap<SlowCacheKey, Integer> cache = new TreeMap<SlowCacheKey, Integer>();
    private int uncachedSlow(String a, int b){
        int hash = (a + "/" + b).hashCode();
        return hash;
    }
    
    int slow(String a, int b)
    {
        var key = new SlowCacheKey(a, b);
        if(!cache.containsKey(key))
        {
            cache.put(key, uncachedSlow(a, b));
        }
            return cache.get(key);
    }
    
    public static void main(String[] args) {
        SetEx ex = new SetEx();
        ex.simpleBoxSet();
    }
    
    
    
    
    
    
    
    
    
    
}
