/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.teclado;
/**
 *
 * @author Mireya
 */
public class computadora {
/**
     * @param args the command line arguments
     */
   public static void main(String[] args){
    Cpu cpu1= new Cpu();
    cpu1.setModelo("alienware");
    cpu1.setMarca("alienware");
    cpu1.setVelocidadProcesador(7);
    
    System.out.println(cpu1);
    Monitor mon1= new Monitor(); 
    mon1.setMarca("ACER");
    mon1.setModelo("LCD");
    mon1.setPulgadas(40);
    
    System.out.println(mon1);
    
    Mouse mouse1= new Mouse();
    mouse1.setMarca("chafa");
    
    System.out.println(mouse1);
    
    teclado tec1=new teclado();
    tec1.setMultimedia(20);
    System.out.println(tec1);

   }
}