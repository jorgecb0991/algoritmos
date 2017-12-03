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
public class Nnaturales {

    public static void main(String[] args) {
        int n, s = 0;
        System.out.println("*Obteneruma de los N numeros naturales positivos*");
        System.out.println("ingreseumero: ");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        s = n*(n+1)/2;
        System.out.println("la de los " + n + "numeros es " + s);

    }

}
