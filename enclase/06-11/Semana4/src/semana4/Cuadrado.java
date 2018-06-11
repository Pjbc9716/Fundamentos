/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author ulacit
 */
public class Cuadrado {
    int tamaño;
    public Cuadrado(int size) {
        tamaño =size;

    }
    public void dibujaCuadrado (){
        for(int i=1;i<tamaño;i++){
            if(i==1){
                filaLLena();
                System.out.println("");
            }if(i==tamaño-1){
                filaLLena();
            }else{
                filaVacia();
                System.out.println("");
                
            }
        }
    }
    private void filaLLena(){
        for (int i=0;i<tamaño;i++){
            System.out.print("* ");
        }
        
    }
    private void filaVacia (){
        System.out.print("* ");
        for (int i=2;i<tamaño;i++){
            System.out.print("  ");
        }
        System.out.print("*");
    }
    
    
   
    
}
