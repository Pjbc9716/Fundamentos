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
public class Persona {
    String name,
            lastname,
            gender;
    int age;

    public Persona(String name, String lastname, String gender, int age) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "," + this.lastname + ", " + this.gender + "," + age;
    }
    
    
}
