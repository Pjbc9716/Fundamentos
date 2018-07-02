/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.pkg02;

import java.util.Random;

/**
 *
 * @author PJ129
 */
public class ArraySample {
        int [] miArreglo = new int [10];
        int [] miArreglo2 = new int [10];
        int [] miArreglo3 = new int [10];
        
    public void fillArrays(){
        Random r = new Random();
        for (int i=0;i<miArreglo.length;i++){
            int number = r.nextInt(100);
            miArreglo[i]= number;
            System.out.println(miArreglo[i]);
        }
        System.out.println("----------------");
        for (int i=0;i<miArreglo2.length;i++){
            int number = r.nextInt(100);
            miArreglo2[i]= number;
            System.out.println(miArreglo2[i]);
        }
        
    }
    public void fillArray3 (){
        System.out.println("");
        System.out.println("");
        for (int i=0;i<miArreglo.length;i++){
            miArreglo3[i]=0;
            for (int j=0;j<miArreglo2.length;j++){
                miArreglo3[i]=miArreglo3[i]+(miArreglo[i]*miArreglo2[j]);
            }
            System.out.println(miArreglo3[i]);
        }
    }
}

 
