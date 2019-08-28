/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

/**
 *
 * @author arizo
 */
public class App {
    public static void main(String [] args ) throws Exception {
        App app = new App();
        app.run();
        app.spin();
    }

    private void run() {
     String who = "World";
     System.out.println("Hello" + who+ "!");
     spin();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
