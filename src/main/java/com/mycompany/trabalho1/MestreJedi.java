/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1;

/**
 *
 * @author Gusmão
 */
class MestreJedi extends Jedi implements Raios {
    public MestreJedi() {
        this.forca = 100;
    }
    @Override
     public void usarRaio() {
       System.out.println("Mestre Jedi está usando raios de cor " + getCor() + ".");
    }
     
    @Override
     public String getCor() {
        return "Azul";
    }
}
