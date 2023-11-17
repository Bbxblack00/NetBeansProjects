/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciseuni;
import java.lang.StringBuilder;
import java.util.InputMismatchException;

/**
 *
 * @author benny
 */
public class ErrorPrinter {
    StringBuilder buildError;
    
    // creo questa classe per potergestire dinamicamente gli errori e rendere le stringhe mutabili con la classe StringBuilder

    public ErrorPrinter() { 
     /**
       * !questo è un costruttore!
       * viene eseguito quando viene chiamata la classe
     */
        this.buildError = new StringBuilder("");
    }
    
    public String logger (StringBuilder e) {
        buildError.append("");
        String res = buildError.toString();
        return res;
    }
    
    public String InputMismatchExceptionLogger(InputMismatchException e) {
        buildError.append("Mi dispiace non è un numero valido:\n\n").append(e);
        return logger(buildError);
    }
}
