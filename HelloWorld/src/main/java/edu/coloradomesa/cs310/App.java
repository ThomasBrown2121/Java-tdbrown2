/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// https://github.com/ThomasBrown2121/Java-tdbrown2
// Repo add Macevoy Assignment
package edu.coloradomesa.cs310;

/**
 *
 * @author arizo
 */
public class App {
    
        private String who;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getwho() {
        return who;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setwho(String who) {
        this.who = who;
    }

    private String greeting = "Hello";
    public String getGreeting(){
        return greeting;
    }
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }
    public static void main(String [] args ) throws Exception {
        App app = new App();
        app.run();
        app.spin();
    }
    private void run() {
     String who = "World";
     System.out.println(getGreeting() + " " + getwho() + "!");
     spin();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}