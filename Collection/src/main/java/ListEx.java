
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arizo
 */
public class ListEx {
    PrintStream out = System.out;
    LinkedList<String> lls = new LinkedList<String>();
    void listOfStrings() {
        var lls = new ArrayList<String>();
        lls.add("alice");
        lls.add("bob");
        
        for (var name : lls) {
            out.println(name);
         }
        
        lls.forEach((name) -> { out.println(name); });
        
        lls.sort((a,b) -> -a.toLowerCase().compareTo(b.toLowerCase()));
    }
    
    public static void main(String[] args) {
        ListEx ex = new ListEx();
        ex.listOfStrings();
    }
}
