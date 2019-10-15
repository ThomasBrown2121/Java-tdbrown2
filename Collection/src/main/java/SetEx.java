

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 *
 * @author Thomas Brown II
 */
// implements : means using an element of a Java interface
// Comparable<String>
class SlowCacheKey implements Comparable<SlowCacheKey> {
    // intializing a to string and b to int
    String a;
    int b;

// explicit constructor invocation calls on another
// constructor in the same class
    SlowCacheKey(String a, int b) {
        this.a = a;
        this.b = b;
    }
// Override envokes the method to becoming public
// in the super - class although on the other hand
// if private in the sub - class will create compile error
    @Override
// SlowCacheKey to : compares the two strings converting
// into unicode values for comparison
    public int compareTo(SlowCacheKey to)
    {
// intializing ans to int
        int ans = a.compareTo(to.a);
// comparison test of if ans is not equal to 0 
// then return the ans
        if (ans != 0) return ans;
// comparison test of if b is not equal to to.b
// to.b is compared to string b
        if (b != to.b)
        {
            if (b < to.b)
                return -1;
            else
                return 1;
        } else {
            return 0;
        }
    }
    
    @Override
// equals() : method compares the two given strings
// and returns false if the characters don't match
    // creates a new instance of the class of
    // the current object and initializes
    // all the fields of this object in java
    public boolean equals(Object object) {
        // compareTo : is comparing SlowCacheKey
        // to object to 0
        return compareTo((SlowCacheKey) object) == 0;
    }
}

// class SetEx is declared
public class SetEx {
    // prints to the terminal
    PrintStream out = System.out;
    
    // method simpleSet is envoked
    void simpleSet() {
        // HashSet is envoked storing elements by using 
        // a mechanism called hashing
        // copy of HashSet<String> to new copy
        
        HashSet<String> colors = new HashSet<String>();
        
        // add() method to add elements in the list
        colors.add("green");
        
        // add() method to add elements in the list
        colors.add("blue");
        
        // contains() method searches the sequence of
        // characters in the given string
        if (colors.contains("green")) {
            // prints "I got green!"
            out.print("I got green!");
        }
    }
    
    // simpleBoxSet is envoked
    void simpleBoxSet() {
        // Need explantion Jariah
        HashMap<Long, String> cache = new HashMap<Long, String>();
        
        // if key is passed then the previous value gets replaced
        // by the new value
        cache.put(123_456_789L, "something");
        
        cache.put(1L,"one");
        // intializing key as long data type
        long key = 1;
        // prints space + key + -> envoked method 
        // cache.get(key)
        out.print("" + key + "->" + cache.get(key));
    }
    
    // implement Map interface 
    TreeMap<SlowCacheKey, Integer> cache = new TreeMap<SlowCacheKey, Integer> ();
    
    // private method envoked 
    private int uncachedSlow(String a, int b) {
        // int hash is declared here
        int hash = (a + "/" + b).hashCode();
        return hash;
    }
    
    // slow is envoked here containing parameters
    // String a, & int b
    int slow(String a,int b) {
        // var is static in this case
        var key = new SlowCacheKey(a,b);
        // if test
        if (!cache.containsKey(key)) {
            cache.put(key, uncachedSlow(a,b));    
        }
        return cache.get(key);
    }
    // main method envoked here
    public static void main(String[] args) {
        SetEx ex = new SetEx();
        ex.simpleBoxSet();
    }
    
}