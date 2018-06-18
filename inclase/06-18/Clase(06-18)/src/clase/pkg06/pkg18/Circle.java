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
public class Circle {
    int radius;
    
    public void getInfo (){
        radius =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo:"));
    }
    public void perimeter (){
        float perimeter = (float)(2*3.1416*radius);
        System.out.println("El perimetro del circulo es: "+perimeter);
    }
    public void area (){
        float area = (float) (3.1416*(this.radius*this.radius));
        System.out.println("El area del circulo es: "+area);
    }
    
}
