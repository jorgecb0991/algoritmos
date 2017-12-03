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
public class HoraSiguienteSegundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa hora");
        int h = sc.nextInt();
        System.out.println("Ingresa minuto");
        int m = sc.nextInt();
        System.out.println("Ingresa segundo");
        int s = sc.nextInt();
        if (h < 24 && m < 60 && s < 60) {
            if (s < 59 && s >= 0) {
                System.out.println(h + "h " + m + "m " + (s + 1) + "s");
            } else {
                if (s == 59) {
                    if (m == 59) {
                        if (h == 23) {
                            System.out.println("00h 00m 00s");
                        } else {
                            System.out.println((h + 1) + "h 00m 00s");
                        }
                    } else {
                        System.out.println(h + "h " + (m + 1) + "m 00s");
                    }
                }
            }
        } else {
            System.out.println("Fuera de Rango");
        }
    }

}
