/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * @author PJ129
 */
public class Logica {

    ArrayList<Usuario> lista = new ArrayList<Usuario>();

    public void getInfo() {

        try {
            FileReader address = new FileReader("src\\data\\Lista.csv");
            BufferedReader file = new BufferedReader(address);
            boolean emptyList = false;
            while (!emptyList) {
                String info = file.readLine();
                if (info != null) {
                    String userInfo[] = info.split(",");
                    String name = userInfo[0];
                    String password = userInfo[1];
                    lista.add(new Usuario(name, password));
                }else{
                emptyList = true;
            }
            }   
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        

    }
    public boolean verifyInfo(String name, String password) {
        boolean correctInfo = false;
        for (Usuario l : lista) {
            correctInfo = (l.getUserName().equals(name) && l.getUserPassword().equals(password));
            if (correctInfo) {
                break;
            }
        }
        return correctInfo;
    }
}
    

