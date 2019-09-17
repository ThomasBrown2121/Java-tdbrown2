


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Thomas Brown II
 */
public class Application3 {
    
    public static void main(int num){
        Application3 app = new Application3();
        System.out.println("Please enter a positive integer <= 10,000");
        Scanner S = new Scanner(System.in);
        int Radius = S.nextInt();
        System.out.println(app.Eucli(Radius) + "\n" + app.Taxicab(Radius));
    }
    
    public double Eucli( int Radius){
        double Euclidean = Math.PI*((Radius)*(Radius));
        return Euclidean;
    }
    
    public double Taxicab( int Radius){
        double taxicab = 2 * Math.PI*(Radius)*(Radius);
        return taxicab;
    }
}
