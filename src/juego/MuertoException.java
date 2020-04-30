/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Bernardo Presencia
 */
public class MuertoException extends Exception{

    public MuertoException(String message) {
        super(message);
    }

    public MuertoException() {
        super("El jugador está muerto");
    }
    
}
