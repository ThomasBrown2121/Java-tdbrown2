


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
        int Radius;
        double Euclidean, taxicab;
        Scanner S = new Scanner(System.in);
        PrintStream out = System.out;
        
        
    public static void main(String[] args) throws Exception{
        Application3 app = new Application3();
        app.run();
    }
    
    public double Eucli(){
        Euclidean = Math.PI*((Radius)*(Radius));
        return Euclidean;
    }
    
    public double Taxicab(){
        taxicab = 2 * Math.PI*(Radius)*(Radius);
        return taxicab;
    }
    
    void run(){
        int Radius = S.nextInt();
        Eucli();
        Taxicab();
        
    }
    
    void write(){
        out.printf("%f",Euclidean,taxicab);
    }
}
