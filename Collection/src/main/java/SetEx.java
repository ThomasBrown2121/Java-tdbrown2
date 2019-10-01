

import java.io.PrintStream;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arizo
 */
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
}
