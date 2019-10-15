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
    // initializing of Map
    Map < String, String > student = new HashMap <String, String> ();
    Map < String, String > student2 = new HashMap <String, String> ();

    String Name;
    String Age;
    String YOB;
    String State;
    
    public static void main(String args [])
    {
      CollectClass obj = new CollectClass();
      obj.run();
    }

    private void run() {
        
        System.out.println("Please enter the first person in order by name, age, year you were "
                + " born, and state you reside in as for example: Co");
        Name = Sc.nextLine();
        student.put("Name", Name);
        Age = Sc.nextLine();
        student.put("Age", Age);
        YOB = Sc.nextLine();
        student.put("YOB", YOB);
        State = Sc.nextLine();
        student.put("State", State);
        
        System.out.println("Please enter the second person in order by name, age, year you were "
                + " born, and state you reside in as for example: Co");
        Name = Sc.nextLine();
        this.student2.put("Name", Name);
        Age = Sc.nextLine();
        this.student2.put("Age", Age);
        YOB = Sc.nextLine();
        this.student2.put("YOB", YOB);
        State = Sc.nextLine();
        this.student2.put("State", State);
        
        if(Integer.parseInt(student.get("YOB")) == compareAge(this.student, this.student2))
        {
            System.out.println("First person is older");
        }
        else
            System.out.println("Second person is older");
    }

    public int compareAge(Map < String, String > student, Map < String, String > student2) {
        if(Integer.parseInt(student.get("YOB")) < Integer.parseInt(student2.get("YOB")))
        {
            return Integer.parseInt(student.get("YOB"));
        }
        else
            return Integer.parseInt(student2.get("YOB"));
    }
}
