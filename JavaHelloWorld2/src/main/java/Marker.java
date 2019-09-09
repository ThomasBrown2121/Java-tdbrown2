
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Thomas Brown II
 */
public class Marker {
    
    
    private String color = "black";
    
    // gets the private member color
    public String getcolor(){
        return color;
    }
    
    public void setcolor(String color){
         this.color = color;
    }
    
    
     public static void main(String [] args ) throws Exception {
        Marker MarkerOne = new Marker();
        MarkerOne.setcolor("orange");
         
        MarkerOne.write();
    }

    private void write() {
        System.out.println("Writing in " + getcolor());
    }
}
