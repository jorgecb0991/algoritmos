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
public class FactorizarNumer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        int num;

        int divisor = 2;

        System.out.print("Introduce el número a dividir en factores: ");

        num = miScanner.nextInt();

        System.out.print("Los factores del número " + num + " son: ");

        while (num != 1) {

            if (num % divisor == 0) {

                System.out.print(divisor + " ");

                num = num / divisor;

            } else {

                divisor++;

            }

        }
    }

    }
