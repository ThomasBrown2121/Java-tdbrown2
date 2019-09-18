


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.lang.Math;
import java.io.PrintStream;

/**
 *
 * @author Thomas Brown II
 */
public class Application3 {
        
        double Euclidean, taxicab, Radius;
        Scanner S = new Scanner(System.in);
        PrintStream out = System.out;
        
        
    public static void main(String[] args) throws Exception{
        Application3 app = new Application3();
        app.run();
    }
    
    public void Eucli(){
        this.Euclidean = Math.PI*((Radius)*(Radius));
    }
    
    public void Taxicab(){
        this.taxicab = (Radius + Radius)*(Radius + Radius)/2;
    }
    
    void run(){
        this.Radius = S.nextDouble();
        Eucli();
        Taxicab();
        write();
        
    }
    
    void write(){
        out.printf("%f \n%f",Euclidean,taxicab);
    }
}
