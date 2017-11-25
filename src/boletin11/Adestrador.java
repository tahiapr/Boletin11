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
public class Adestrador extends Seleccion {
    
    private String idFederacion;
    
 
    public Adestrador( int id, String nome, String apelido, int edade, String idFederacion) {
    super(id, nome, apelido, edade);
    this.idFederacion=idFederacion;
    } 
    
     public String getidFederacion() {
        return idFederacion;
    }

    public void setidFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void viaxar (){
        System.out.println("Viaxan os adestradores");
    }
    
    public void dirixirPartido (){
        
    }
    
    public void dirixirAdestramento(){
        
    }

    @Override
    public String toString() {
        return super.toString()+"\nID Federación: "+idFederacion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
