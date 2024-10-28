/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho1;

/**
 *
 * @author Gusmão
 */
public class Trabalho1 {
    public static void main(String[] args) {
        //TEAM JEDI
        Padawan padawan = new Padawan();
        padawan.nome = "Padawan";
        padawan.atacar(padawan.forca);
        
        Cavaleiro cavaleiro = new Cavaleiro();
        cavaleiro.nome = "Cavaleiro";
        cavaleiro.atacar(cavaleiro.forca);
        
        MestreJedi mestreJedi = new MestreJedi();
        mestreJedi.nome = "Mestre Jedi";
        mestreJedi.atacar(mestreJedi.forca);
        mestreJedi.usarRaio(); 
        //////
        
        // TEAM SITH
        Aprendiz aprendiz = new Aprendiz();
        aprendiz.nome = "Aprendiz";
        aprendiz.atacar(aprendiz.forca);

        Lord lord = new Lord();
        lord.nome = "Lord";
        lord.atacar(lord.forca);

        MestreSith mestreSith = new MestreSith();
        mestreSith.nome = "Mestre Sith";
        mestreSith.atacar(mestreSith.forca);
        mestreSith.usarRaio();
        //////
    }
        
    }


