/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez1_00;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author tss
 */
public class Alunno {

    private String cognome;
    private String nome;
    private int voto;
    private LocalDateTime datanascita;
    private String segnoZodiacale;
    //metodo costruttore con nome della stessa classe

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public String getSegnoZodiacale() {
        return segnoZodiacale;
    }

    public LocalDateTime getDatanascita() {
        return datanascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public Alunno(String cognome, String nome, int voto) {
        this.cognome = cognome;
        this.nome = nome;
        this.voto = voto;
        datanascita = LocalDateTime.now();
    }

    public Alunno(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
        datanascita = LocalDateTime.now();
    }

    public Alunno(String cognome) {

        String okcognome;
        if (cognome.length() > 50) {//taglialo
            okcognome = cognome.substring(0, 50);

        } else {
            okcognome = cognome;
            okcognome = okcognome.toUpperCase();
        }

        this.cognome = okcognome;
        nome = "";

        datanascita = LocalDateTime.now();

        int anno = datanascita.getYear();
        if (anno == 2018) {
            segnoZodiacale = "Drago";
        }
        if (anno == 2019) {
            segnoZodiacale = "Serpente";
        }
        if (anno == 2020) {
            segnoZodiacale = "Topo";
        }
    }

    

    public String getPresentazione() {
        String frase;
        frase = "Mi chiamo " + cognome + " " + nome;
        //sistemo la data

        DateTimeFormatter myFormatIT = DateTimeFormatter.ofPattern("dd/MM/yyyy 'alle ore' HH:mm:ss");

        String dataOkIT = datanascita.format(myFormatIT);

        frase += " e' sono nato il " + dataOkIT;

        return frase;
    }

}
