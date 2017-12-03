/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

/**
 *
 * @author Administrator
 */
public class mcdeUCLIDES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //implementar
    }

    int MCD_Euclides(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
