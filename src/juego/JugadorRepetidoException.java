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
public class JugadorRepetidoException extends Exception{

    public JugadorRepetidoException(String message) {
        super(message);
    }

    public JugadorRepetidoException() {
        super("El jugador está repetido");
    }
    
}
