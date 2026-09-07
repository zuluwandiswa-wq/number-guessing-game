/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introductiontowhileloops;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class Randomnumberguess {
    
    public static void main(String [] args) {
        Random obj = new Random(); // instance of a random class
        
        int secretNumber= obj.nextInt(100)+1;
        int userGuess=0;
        
        while (userGuess == userGuess){
            userGuess = Integer.parseInt(JOptionPane.showInputDialog("Hey, guess a number between 1 and 100"));
        }
    }
}
