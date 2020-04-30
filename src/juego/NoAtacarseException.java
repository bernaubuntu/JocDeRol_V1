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
public class NoAtacarseException extends Exception{

    public NoAtacarseException(String message) {
        super(message);
    }

    public NoAtacarseException() {
        super("El jugador se puede atacar a si mismo");
    }
    
}
