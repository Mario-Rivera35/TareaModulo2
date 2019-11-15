/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo2;

/**
 *
 * @author Mario Santos
 */
public class Recursos {
   
    private int div;
    
    public void getMensaje(){
        System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo.");
    }
    
    public void getNota(int nota){
        if(nota>=70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }
    
    public void getDivisión(int x, int y){
        div=x/y;
        System.out.println("El resultado es: "+div+"");
    }
    
    public void lista(int número){
        int i = número;
        while(i <= 100) {
            System.out.println(i);
            i+=número;
        }
    }
    
    public void getMessage(){
        System.out.println("Gracias por su atención");
    }
    
}
