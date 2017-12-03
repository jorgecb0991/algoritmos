/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Cubos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n;
                        double s;
                        Scanner leer=new Scanner(System.in);
                       
                        System.out.println("Ingrese numero de terminos:");
                        n=leer.nextInt();
                        s=n*n*(n+1)*(n+1)/4;
                        System.out.println("Suma de los cubos de los n primeros terminos:"+s);
                        
    }
    
}
