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
public class DivisoresComunes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero: ");
            int numero1 = sc.nextInt();
        System.out.print("Introduce numero: ");
            int numero2 = sc.nextInt();
        System.out.print("Divisores comunes: ");
        for (int i = 1; i < numero1; i++){
            if ( numero1%i == 0 && numero2%i == 0){
                System.out.print(i+" "); 
            }   
        }
        System.out.println();
    }
    
}
