import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


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
public class CollectClass
{
    Scanner Sc = new Scanner(System.in);
    Map < String, Integer > mic = new HashMap < String, Integer > ();
    String name = " ";
    int rate;
    
    
    CollectClass()
    {
        this.mic.put("Toyota", 3);
        this.mic.put("Chevy", 6);
        this.mic.put("Ford", 2);
        this.mic.put("Honda", 5);
        this.mic.put("Hyundai", 1);
        this.mic.put("Nissan", 8);
        this.mic.put("Subaru", 4);
        this.mic.put("BMW", 11);
        this.mic.put("Audi", 9);
        this.mic.put("Acura", 7);
        this.mic.put("Cadillac", 10);
         
    }
    
    
    
    public void run()
    {
        while(!false)
        {
            System.out.println("Please enter in your"
                    + " favorite car brand" );
            readIn();
            if(finished())
            {
                break;
            }
            draft();
            Builder();
        
        }
    }
    
    boolean finished()
    {
        return "finished".equals(name);
    }
    
    void readIn()
    {
        name = Sc.nextLine();
    }
    void Builder()
    {
        System.out.println(rate);
    }
    
    void draft()
    {
        if(mic.containsKey(name))
        {
        System.out.println("Your car placement is: ");
        rate = mic.get(name);
        }
        else
        {
        System.out.println("Key: "  + name + "not in list of car brands");
        }
    }
    
    public static void main(String args [])
    {
      CollectClass col = new CollectClass();
      col.run();
    }
}
