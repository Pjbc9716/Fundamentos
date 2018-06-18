/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg06.pkg18;

import javax.swing.JOptionPane;

/**
 *
 * @author PJ129
 */
public class Square {
    int side= 0;

    public void getInfo (){
        side = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
    }
    public void perimeter (){
        int perimetro = side*4;
        System.out.println("El perimetro del cuadrado es: "+perimetro);
    }
    public void area (){
        int area = side *side;
        System.out.println("El area del cuadrado es: "+area);
    }
    
    
}
