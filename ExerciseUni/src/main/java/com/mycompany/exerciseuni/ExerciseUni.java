/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciseuni;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author benny
 * @version 0.0.3
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
        return;
    }
}