/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author daniel
 */

public class ExceptionGame extends Exception{
    
    public ExceptionGame(String msg){
        super("Game - Exception define by the user: "+msg);
    }    
}