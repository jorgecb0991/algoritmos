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
public class FuncionesTrigonometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor = 0;

        double angulo = 45; //grados
        double anguloRadianes = Math.toRadians(angulo);

        valor = Math.cos(anguloRadianes);
        System.out.println("Coseno de " + angulo + "º = " + valor);

        valor = Math.sin(anguloRadianes);
        System.out.println("Seno de " + angulo + "º = " + valor);

        valor = Math.tan(anguloRadianes);
        System.out.println("Tangente de " + angulo + "º = " + valor);

        valor = 0.707;

        anguloRadianes = Math.acos(valor);
        angulo = Math.toDegrees(anguloRadianes);
        System.out.println("Arco Coseno de " + valor + " = " + angulo + "º");

        anguloRadianes = Math.asin(valor);
        angulo = Math.toDegrees(anguloRadianes);
        System.out.println("Arco Seno de " + valor + " = " + angulo + "º");

        anguloRadianes = Math.atan(valor);
        angulo = Math.toDegrees(anguloRadianes);
        System.out.println("Arco Tangente de " + valor + " = " + angulo + "º");

    }

}
