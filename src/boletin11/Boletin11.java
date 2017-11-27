/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author sherlyn
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Seleccion selec1 = new Seleccion (001,"María","Castelo",23);
    Xogador xog1 = new Xogador (002,"Paco","Montes",25,4,"Lateral");
    Adestrador ades1 = new Adestrador (003,"Mario","Mariano",44,"FedeSteres");
    Masaxista max1 = new Masaxista (004, "Roxana","Rosita",34,"Fisioterapia",5);
    
    Seleccion selec2 = new Xogador(0022,"Fernando","Fernandez",13,12,"Portero");
        
    selec1.concentrarse(); 
    xog1.concentrarse();
   ades1.concentrarse(); 
   max1.concentrarse(); 
   
   selec1.viaxar();
   xog1.viaxar();
   ades1.viaxar();
   max1.viaxar();
   
   //llamar método superclase con objeto subclase
   ades1.viaxar();
   
   //llamar método subclase con obxeto superclase
   //selec1.darMasaxes(); a error
    }
    
    
}
