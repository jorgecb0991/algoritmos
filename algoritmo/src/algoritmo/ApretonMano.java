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
public class ApretonMano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int n,a;
          Scanner leer=new Scanner(System.in);
                       
          System.out.println("Ingrese numero de personas: ");
          n=leer.nextInt();
          a=n*(n-1)/2;
          System.out.println("Numero de apretones de mano: "+a);   
    }
    
}
