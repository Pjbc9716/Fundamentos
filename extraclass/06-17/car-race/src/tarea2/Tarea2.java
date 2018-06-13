/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.ArrayList;

/**
 *
 * @author PJ129
 */
public class Tarea2 {

    
    public static void main(String[] args) {
        Carro micarro = new Carro ("Mazda",1990,100);
        Carro micarro2 = new Carro ("Toyota",1986,100);
        Carro micarro3 = new Carro ("Jeep",1986,100);
        ArrayList <Carro> carsList = new ArrayList <>();
        carsList.add(micarro);
        carsList.add(micarro2);
        carsList.add(micarro3);
        while ((micarro.getAdvanced_Meters()<1000)&&(micarro2.getAdvanced_Meters()<1000)&&(micarro3.getAdvanced_Meters()<1000)){
            micarro.race();
            micarro2.race();
            micarro3.race();
        }
        for (int i =0;i<carsList.size();i++){
            if (carsList.get(i).getAdvanced_Meters()>=1000){
                System.out.println("El carro ganador es: "+carsList.get(i).getBrand());
            }
    }
    
}
