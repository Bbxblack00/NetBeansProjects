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

    public static void main(String[] args) {
        
        // input name string
        Scanner inp = new Scanner(System.in);
        
        // inizializzazione di un nuovo oggetto
        stampaaschermo ciao = new stampaaschermo();
        ciao.stampaaschermo();
        ciao.stampaNome(12, "Benny");
    }
}