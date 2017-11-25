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
public class Masaxista extends Seleccion {
    
        private int anosExperiencia;
        private String titulacion;
    
    public Masaxista( int id, String nome, String apelido, int edade, String titulacion, int anosExperiencia) {
    super(id, nome, apelido, edade);
    this.titulacion=titulacion;
    this.anosExperiencia=anosExperiencia;
    } 
    
     public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public void viaxar (){
        System.out.println("Viaxan os masaxistas");
    }
    
    public void darMasaxes (){
        System.out.println("Intenté llamarlo");
    }

    @Override
    public String toString() {
        return super.toString()+"\nTitulación: "+titulacion+"\nAnos Experiencia: "+anosExperiencia; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
