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
public class Rectangle {
    int length;
    int width;

    public void getInfo (){
        length = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo del rectangulo:"));
        width = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho del rectangulo:"));
    }
    public void perimeter (){
        int perimeter = (2*this.length)+(2*this.width);
        System.out.println("El perimetro del rectangulo es: "+perimeter);
    }
    public void area (){
        int area = this.length*this.width;
        System.out.println("El area del rectagulo es: "+area);
    }
    
}
