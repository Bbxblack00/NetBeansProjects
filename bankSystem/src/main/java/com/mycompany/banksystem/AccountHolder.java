/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banksystem;

/**
 *
 * @author benny
 */
public class AccountHolder {
    private String nome;
    private String cognome;
    private String nazione;
    private byte age;
    
    public AccountHolder (String nome, Stirng cognome, String nazione, byte age) {
        this.nome = nome;
        this.cognome = cognome;
        this.nazione = nazione;
        this.age = age;
    }
    
    // getters
    public String getNome() {
        return nome;
    }
    
    public String getCognome() {
        return cognome;
    }
    
    public String getNazione() {
        return nazione;
    }
    
    public byte getAge() {
        return age;
    }
    
    // override
    public String toString() {
        return "Nome:\t" + nome + "\tCognome:\t" + nome + "\tNazionalità:\t" + nome + "\tNome:\t" + nome + "\tNome:\t";
    }
}
