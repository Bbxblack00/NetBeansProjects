/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciseuni;
import java.lang.StringBuilder;

/**
 *
 * @author benny
 */
public class stampaaschermo {

    private StringBuilder temp;
    
    public void stampaaschermo() {
        
        System.out.println("What's your name?\n");
        return;
    }
    
    public void stampaNome(int age, String name) {
        System.out.println("\n\nCiao " + name);
        System.out.println("Tu hai: ");
        System.out.println(age + " anni!");
        return;
    }
    
    public long mathOperation() {
        
        return 0;
    }
    
    public void vocalCounter(String str) {
        int num = 0;
        String noVocal = "Non ci sono vocali";
        if(str.length() == 0) System.out.println(noVocal);
        if(str.indexOf(" ") >= 0) str.replace(" ", "");
        for (int i = 0; i < str.length() ; i++){
            char thisChar = str.toLowerCase().charAt(i);
            num += 
                    thisChar == 'a' ||
                    thisChar == 'e' ||
                    thisChar == 'i' ||
                    thisChar == 'o' ||
                    thisChar == 'u' 
                    ? 1 : 0;
        }
        System.out.println("Il tuo nome ha: " + num + " vocali");
    }
}
