/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1;

/**
 *
 * @author Gusmão
 */
class MestreSith extends Sith {
    public MestreSith() {
        this.forca = 120;
    }

    public void usarRaio() {
    System.out.println("Mestre Sith está usando raios de cor " + getCor() + ".");
    }
    
    public String getCor() {
    return "Vermelha";
    }
}
