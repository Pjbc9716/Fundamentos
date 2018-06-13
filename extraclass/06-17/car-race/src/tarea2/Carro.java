/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author PJ129
 */
public class Carro {
   private String brand;
   private int year;
   private int horse_power;
   private int Advanced_Meters;
   
    public Carro(String brand, int year, int horse_power) {
        this.brand = brand;
        this.year = year;
        this.horse_power = horse_power;
        this.Advanced_Meters=0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorse_power() {
        return horse_power;
    }

    public void setHorse_power(int horse_power) {
        this.horse_power = horse_power;
    }

    public int getAdvanced_Meters() {
        return Advanced_Meters;
    }

    public void setAdvanced_Meters(int Advanced_Meters) {
        this.Advanced_Meters = Advanced_Meters;
    }
   
    public void race (){
        Advanced_Meters = Advanced_Meters +((int)(Math.random()*2)*this.horse_power); 
}
    
   
}
