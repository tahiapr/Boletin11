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
public class Seleccion {
    private int id;
    private String nome;
    private String apelido;
    private int edade;
    
    public Seleccion (int id, String nome, String apelido, int edade){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public void viaxar (){
    System.out.println("Viaxa a selección");
    }
    
    public void concentrarse () {
    System.out.println("Concentrase a selección");
    }
    
    @Override
    public String toString() {
        return "Nome: "+nome+"\nApelido: "+apelido+"\nEdade: "+edade; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
