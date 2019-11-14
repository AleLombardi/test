/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez1_00;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class MainStart {

    static String[] Alunni;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Alunno a1 = new Alunno("rossi","mario",100);

        //a1.getnome = "mario";
        //a1.getvoto = 10;

        long milsec = 4000;
        Thread.sleep(milsec);

        Alunno a2 = new Alunno("guerrini","luca");

        //a2.cognome = "guerrini";
        //a2.nome = "luca";
        //a2.voto = 5;

        LocalDateTime ddd = a2.getDatanascita();

        System.out.println(a1.getPresentazione());
        System.out.println(a2.getPresentazione());
        //JOptionPane.showMessageDialog(null, a1.getPresentazione()+"\n"+a2.getPresentazione());
        if (a1.setVoto() > a2.getVoto()) {
            System.out.println("bravo " + a1.getCognome() + " " + a1.getNome() + " voto " + a1.getVoto());
        } else {
            System.out.println("bravo " + a2.getCognome() + " " + a2.getNome() + " voto " + a2.getVoto());
        }

    }

}
