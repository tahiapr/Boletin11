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
public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;
    
    public Xogador( int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {
    super(id, nome, apelido, edade);
    this.dorsal=dorsal;
    this.demarcacion=demarcacion;
    } 


    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void concentrarse () {
        System.out.println("Concentrase a selección");
    }
    
    public void viaxar (){
        System.out.println("Viaxan os xogadores");
    }
    
    public void xogarPartido (){
        
    }
    
    public void entrenar (){
        
    }

    @Override
    public String toString() {
        return super.toString()+"\nDorsal: "+dorsal+"\nDemarcación: "+demarcacion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
