/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg7;

/**
 *
 * @author PJ129
 */
public class Tarea7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocumentCSV documentCSV = new DocumentCSV("C:\\Users\\PJ129\\Desktop\\Tarea#7.csv");
        Persona persona = new Persona("Javier","Rodriguez","Male",19);
        documentCSV.<Persona>write(persona);
        
    }
    
}
