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
public class CocienteDivisonesSucesivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca dividendo: ");
        n1 = sc.nextInt();
        do {
            System.out.print("Introduzca divisor (>0): ");
            n2 = sc.nextInt();
        } while (n1 <= 0);
        System.out.printf("%d/%d = %d %n", n1, n2, cociente(n1, n2));
    }

    public static int cociente(int a, int b) {
        if (a < b)
            return 0;
        else
            return 1 + cociente(a - b, b);
    }
    
}
