
import java.io.PrintStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arizo
 */
// App is an object
public class App {
    Scanner in;
    PrintStream out;
    int a,b,s,n,m;
    double Angle, Velocity;
    
    //  s = byte = (-128,127),  u = char (0,65,535),  s = (short, int, long), float,double, boolean
    
    public static void main(String[] args) throws Exception{
        // app is an object of App
        App app = new App();
       
        app.run();
    }
    
    
    private void run() {
        in = new Scanner(System.in);
        out = System.out;
        while(true){
            read();
            if(finsh()) break;
            solve();
            write();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean finsh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void solve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
