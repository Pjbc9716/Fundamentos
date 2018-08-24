/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4.models;

import javax.swing.JLabel;

/**
 *
 * @author PJ129
 */
public class Game {
    
    private int number;
    private JLabel label;

    public Game(int number, JLabel label) {
        this.number = number;
        this.label = label;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    
}
