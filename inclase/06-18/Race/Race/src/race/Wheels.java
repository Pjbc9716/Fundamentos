/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

/**
 *
 * @author PJ129
 */
public class Wheels {

    private int size = 0;

    public Wheels(int size) {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getFactor() {
        float factor = this.size / 20;
        return factor;
    }

}
