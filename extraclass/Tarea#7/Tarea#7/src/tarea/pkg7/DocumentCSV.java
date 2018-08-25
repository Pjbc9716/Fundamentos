/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg7;

import java.io.FileWriter;

/**
 *
 * @author PJ129
 * @param <T>
 */
public class DocumentCSV<T> {
String address;
    public DocumentCSV(String address) {
        this.address = address;
    }
    
    public <T> boolean write(T information) {
        try {
            FileWriter info = new FileWriter(address, true);
            info.write(information.toString());
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}
