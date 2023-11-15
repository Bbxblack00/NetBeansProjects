/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciseuni;
import java.util.Scanner;

/**
 *
 * @author benny
 * @version 0.0.2
 */
public class ExerciseUni {
        
    // input name string
    Scanner inp = new Scanner(System.in);

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



    public static void main(String[] args) {
        //input variables    
        String messageInp;
        short shortInp;
            
        // inizializzazione di un nuovo oggetto
        stampaaschermo stamp = new stampaaschermo();
        stamp.stampaaschermo();
        
        ExerciseUni exr = new ExerciseUni();  
        messageInp = exr.inp.next();
        
        exr.setName(messageInp);
        
        stamp.stampaNome(12, exr.getName());
        return;
    }
    
    
}