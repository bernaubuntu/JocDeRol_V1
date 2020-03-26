/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import juego.*;
import io.*;

/**
 *
 * @author Bernardo Presencia
 */
public class JocDeRol {
    public static void main(String[] args) {
        pruebaFase();
    }
    private static void pruebaFase(){
        Alien et = new Alien("Capitan america", 15, 7, 40);
        Human humano = new Human("John Smith", 13, 8, 39);
        Warrior guerrero = new Warrior("Martian PK", 27, 2, 32);
        
        humano.attack(guerrero);
        humano.attack(guerrero);
        humano.attack(guerrero);
        humano.attack(guerrero);
        guerrero.attack(humano);
    }
}
