/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculos cal= new Calculos();
        float nif=Float.parseFloat(JOptionPane.showInputDialog("numero nif"));
        cal.calcularLetra(nif);
        
    }
    
}
