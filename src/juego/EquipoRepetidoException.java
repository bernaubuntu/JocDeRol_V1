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
public class EquipoRepetidoException extends Exception{

    public EquipoRepetidoException(String message) {
        super(message);
    }

    public EquipoRepetidoException() {
        super("El Equipo está repetido");
    }
    
}
