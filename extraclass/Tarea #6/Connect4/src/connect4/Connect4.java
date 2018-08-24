/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import connect4.logic.Logic;
import connect4.windows.GameControl;

/**
 *
 * @author PJ129
 */
public class Connect4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Logic myLogic = new Logic ();
        GameControl newJFrame = new GameControl(1, myLogic);
        newJFrame.fillList();
        newJFrame.setVisible(true);
//        logic.fillList();
//        logic.victory();
        
                
    }
    
}
