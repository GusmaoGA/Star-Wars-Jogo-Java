/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1;

/**
 *
 * @author Gusmão
 */
public class Força {
    protected int forca;
    protected int vida;
    protected String genero;
    protected String nome;
    
    public void atacar(int forca){
        System.out.println(nome + " atacou com força " + forca);
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }    
}