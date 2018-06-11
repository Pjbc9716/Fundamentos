/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Ejercicio1 {
    int randomNumber = (int)(Math.random()*100);
        

    public void ejercicio1 (){
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero:"));
        if(userNumber==randomNumber){
            System.out.println("Acerto el numero");
        }    
        if (userNumber>randomNumber){
            System.out.println("El numero es menor.");
            ejercicio1();
        }if (userNumber<randomNumber){
            System.out.println("El numero es mayor");
            ejercicio1();
            }
    }
 
}
    

