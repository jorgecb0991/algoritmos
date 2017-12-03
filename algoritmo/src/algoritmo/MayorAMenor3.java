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
public class MayorAMenor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, Mayor, Medio, Menor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dadomeros devolver los 3 en orden ascendente");
        System.out.println("Ingreseº numero");
        a = teclado.nextInt();
        System.out.println("Ingreseº numero");
        b = teclado.nextInt();
        System.out.println("ingreseº numeero");
        c = teclado.nextInt();

        if (a > b && a > c) {
            Mayor = a;
        } else if (b > a && b > c) {
            Mayor = b;
        } else {
            Mayor = c;
        }

        if (a < b && a < c) {
            Menor = a;
        } else if (b < a && b < c) {
            Menor = b;
        } else {
            Menor = c;
        }
        Medio = (a + b + c) - (Mayor + Menor);
        System.out.println("");
        System.out.println("eln ascendente de los numeros ingresados es: ");
        System.out.println(Menor + " " + Medio + " " + Mayor);
    }

}
