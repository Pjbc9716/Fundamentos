/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.pkg02;

import javax.swing.JOptionPane;

/**
 *
 * @author PJ129
 */
public class Ejercicio1 {
    
    public void getInfo(){
        String text = JOptionPane.showInputDialog("Ingrese el texto.");
        String [] words = text.split(" ");
        for (int i=words.length;i>0;i--){
            String word = words[i-1];
            System.out.print(" "+word);
        }
        
    }
    public void burbuja (){
        int[] arreglo = new int[10];
        arreglo[0] = 1;
        arreglo[1] = 5;
        arreglo[2] = 7;
        arreglo[3] = 22;
        arreglo[4] = 43;
        arreglo[5] = 0;
        arreglo[6] = 67;
        arreglo[7] = 3;
        arreglo[8] = 54;
        arreglo[9] = 9;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                arreglo[i] = arreglo[i + 1];
            } else {

            }

        }
    }
}
