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
public class Menu {

    Square square = new Square();
    Rectangle rectangel = new Rectangle();
    Circle circle = new Circle();

    public void Menu() {
        boolean exit = false;
        while (!exit) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que desea: \n1.Perimetro\n2.Area\n3.Salir"));
            if (option != 3) {
                int form = Integer.parseInt(JOptionPane.showInputDialog("PERIMETRO\nDigite la figura que desea:\n1.Cuadrado\n2.Rectangulo\n3.Circulo "));
                if (option == 1) {
                    switch (form) {
                        case 1:
                            square.getInfo();
                            square.perimeter();
                            Menu();
                            break;
                        case 2:
                            rectangel.getInfo();
                            rectangel.perimeter();
                            Menu();
                            break;
                        case 3:
                            circle.getInfo();
                            circle.perimeter();
                            Menu();
                            break;
                        default:
                    }
                    break;
                }
                if (option == 2) {
                    switch (form) {
                        case 1:
                            square.getInfo();
                            square.area();
                            Menu();
                            break;
                        case 2:
                            rectangel.getInfo();
                            rectangel.area();
                            Menu();
                            break;
                        case 3:
                            circle.getInfo();
                            circle.area();
                            Menu();
                            break;
                        default:
                    }
                    break;
                }

            } else {
                exit = true;
            }

        }
    }
}
