/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciseuni;
import java.util.Scanner;
// exeptions
import java.util.InputMismatchException;
import java.lang.StringIndexOutOfBoundsException;

import java.lang.StringBuilder;

/**
 *
 * @author benny
 * @version 0.0.4
 */
public class ExerciseUni {
        
    // classi inizializzate
    Scanner inp;
    stampaaschermo stamp;
    ErrorPrinter ePrinter;

    // variables
    private String name;
    private short age;

    // initialization of getter

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    // initialization of setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }
    
    //COSTRUTTORE
    public ExerciseUni(){
        this.inp = new Scanner(System.in);
        this.stamp = new stampaaschermo();
        this.ePrinter = new ErrorPrinter();
    }

    public static void main(String[] args) {
        ExerciseUni exr = new ExerciseUni();  // Aggiunto per creare un'istanza di ExerciseUni
        
        //input variables    
        String messageInp;
        short shortInp;
            
        // inizializzazione di un nuovo oggetto
        exr.stamp.stampaaschermo();
        
        messageInp = exr.inp.next();
        exr.setName(messageInp);
        
        try {
            
        } catch (InputMismatchException e) {
            // chiamo la funzione per stampare il messaggio d'errore
            System.out.println(exr.ePrinter.InputMismatchExceptionLogger(e));
        }
        
        exr.stamp.stampaNome(12, exr.getName());
        exr.stamp.vocalCounter(exr.getName());
        return;
    }
}

enum Nazionalità {
    
    /** 
     * Quando verrà chiamata questa enum automaticamente il costruttore otterrà 
     * l'indice presente all'interno dell'alternatica qui sotto scelta
     */
    ITALIANA(0), AMERICANA(1), UE(2), ASIA(3), AFRICA(5), AUSTRALIA(6);
    
    private int ind;
    
    public int getIndexCode() {
        return ind;
    }
    
    /** 
     * quando viene inizializzato un oggetto enum, a prescindere da cosa si 
     * scelga è come se venisse chiamato il costruttore; 
     * 
     * ecco perchè passano il valore a ind;
     */
    Nazionalità (int ind) {
        this.ind = ind;
    }
    
    public String aera() {
        switch(ind){
            case 0:
                
        }
    }
}