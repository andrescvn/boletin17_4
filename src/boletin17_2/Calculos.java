/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

/**
 *
 * @author acomesanavila
 */
public class Calculos {

    private char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K','E'};
    private final int[] numeros = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};

    public void calcularLetra(float nif) {
        int resultado = (int) (nif % 23);
        System.out.println(resultado);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == resultado) {
                System.out.println("Tu letra es " + letras[i-1]);
            }
        }
    }
}
