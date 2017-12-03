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
public class LlamadaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double costo;
         System.out.println("Ingrese los minutos usados");
         int m=sc.nextInt();
         if(m<=3){
             costo=0.5;
         }else{
             costo=0.5+0.5*0.1*(m-3);
         }
         System.out.println(costo);
     }
    
    
}
