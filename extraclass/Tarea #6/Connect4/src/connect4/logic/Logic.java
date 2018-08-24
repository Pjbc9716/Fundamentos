/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4.logic;

import connect4.models.Game;
import connect4.windows.GameControl;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author PJ129
 */
public class Logic {

public Game matriz[][] = new Game[6][7];
    GameControl newJFrame = new GameControl(1,this);
    
    public void verifySpace(int column, int player) {
        for (int i = matriz.length-1; i >=0 ; i--) {
            if (this.matriz[i][column].getNumber() == 0) {
                this.matriz[i][column].setNumber(player); 
                break;
            }

        }

    }

    public boolean victory() {
        boolean victory= false;
        for (int column = 0; column < this.matriz[1].length; column++) {
            if ((matriz[5][column].getNumber() == 1 && matriz[4][column].getNumber() == 1 && matriz[3][column].getNumber() == 1 && matriz[2][column].getNumber() == 1)
                    || (matriz[4][column].getNumber() == 1 && matriz[3][column].getNumber() == 1 && matriz[2][column].getNumber() == 1 && matriz[1][column].getNumber() == 1)
                    || (matriz[3][column].getNumber() == 1 && matriz[2][column].getNumber() == 1 && matriz[1][column].getNumber() == 1 && matriz[0][column].getNumber() == 1)) {
                JOptionPane.showMessageDialog(null, "Gana el jugador #1");
                victory = true;
            } else if (((matriz[5][column].getNumber() == 2 && matriz[4][column].getNumber() == 2 && matriz[3][column].getNumber() == 2 && matriz[2][column].getNumber() == 2)
                    || (matriz[4][column].getNumber() == 2 && matriz[3][column].getNumber() == 2 && matriz[2][column].getNumber() == 2 && matriz[1][column].getNumber() == 2)
                    || (matriz[3][column].getNumber() == 2 && matriz[2][column].getNumber() == 2 && matriz[1][column].getNumber() == 2 && matriz[0][column].getNumber() == 2))) {
                JOptionPane.showMessageDialog(null, "Gana el jugador #2");
                    victory = true; 
            }
        }
        for (int row = 0; row < this.matriz.length; row++) {
            if ((matriz[row][0].getNumber() == 1 && matriz[row][1].getNumber() == 1 && matriz[row][2].getNumber() == 1 && matriz[row][3].getNumber() == 1)
                    || (matriz[row][1].getNumber() == 1 && matriz[row][2].getNumber() == 1 && matriz[row][3].getNumber() == 1 && matriz[row][4].getNumber() == 1)
                    || (matriz[row][2].getNumber() == 1 && matriz[row][3].getNumber() == 1 && matriz[row][4].getNumber() == 1 && matriz[row][5].getNumber() == 1)
                    || (matriz[row][3].getNumber() == 1 && matriz[row][4].getNumber() == 1 && matriz[row][5].getNumber() == 1 && matriz[row][6].getNumber() == 1)) {
                JOptionPane.showMessageDialog(null, "Gana el jugador #1");
                victory = true;
            } else if ((matriz[row][0].getNumber() == 2 && matriz[row][1].getNumber() == 2 && matriz[row][2].getNumber() == 2 && matriz[row][3].getNumber() == 2)
                    || (matriz[row][1].getNumber() == 2 && matriz[row][2].getNumber() == 2 && matriz[row][3].getNumber() == 2 && matriz[row][4].getNumber() == 2)
                    || (matriz[row][2].getNumber() == 2 && matriz[row][3].getNumber() == 2 && matriz[row][4].getNumber() == 2 && matriz[row][5].getNumber() == 2)
                    || (matriz[row][3].getNumber() == 2 && matriz[row][4].getNumber() == 2 && matriz[row][5].getNumber() == 2 && matriz[row][6].getNumber() == 2)) {
                JOptionPane.showMessageDialog(null, "Gana el jugador #2");
                victory = true;
            }
        }
        return victory;
    }
}
