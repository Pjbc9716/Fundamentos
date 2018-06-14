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
public class Ejercicio2 {
    
      public void ejercicio2 (){
        int billetes [][]=new int [2][7];
        billetes[0][0]= 20000;
        billetes[0][1]= 10000;
        billetes[0][2]= 5000;
        billetes[0][3]= 2000;
        billetes[0][4]= 1000;
        billetes[0][5]= 500;
        billetes[0][6]= 100;
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  precio"));
        int monto = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto"));
        int vuelto = monto-precio;
        if (vuelto==0){
            System.out.println("Monto de paga completo, no hay vuelto");
        }
        for (int i=0;i<7;i++){
            if(vuelto/billetes[0][i]>0){
                billetes[1][i] = vuelto/billetes[0][i];
                System.out.println("");
                System.out.println("Se puede pagar con billete "+billetes[0][i]+" con cantidad "+billetes[1][i]);
                vuelto=vuelto-(billetes[0][i]*billetes[1][i]);
            }
            if(vuelto<100){
                break;
            }
        }
        
           
        }
    }
 
