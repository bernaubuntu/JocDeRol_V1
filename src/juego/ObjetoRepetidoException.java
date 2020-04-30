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
public class ObjetoRepetidoException extends Exception{

    public ObjetoRepetidoException(String message) {
        super(message);
    }

    public ObjetoRepetidoException() {
        super("El Objeto ya existe");
    }
    
}
