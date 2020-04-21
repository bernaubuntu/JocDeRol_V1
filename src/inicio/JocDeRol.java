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
        Human humano = new Human("John Smith", 13, 8, 100);
        Warrior guerrero = new Warrior("Martian PK", 27, 18, 32);
        
        Human humano2 = new Human("John Smith", 13, 8, 110);
        /*
        humano.attack(guerrero);
        humano.attack(guerrero);
        humano.attack(guerrero);
        humano.attack(guerrero);
        guerrero.attack(humano);
        */
        
        /*
        System.out.println(""+humano);
        System.out.println(""+et);
        et.attack(humano);
        et.attack(guerrero);
        */
        
        Team equipo1= new Team("Equipo A");
        Team equipo2= new Team("Equipo A");
        System.out.println("1: "+equipo1);
        equipo1.add(et);
        equipo1.add(humano);
        System.out.println("2: "+equipo1);
        equipo1.remove(et);
        System.out.println("3: "+equipo1);
        System.out.println("3.1: "+et);
        equipo2.add(humano);
        System.out.println("4: "+equipo1);
        System.out.println("5: "+equipo2);
        System.out.println("5.1: "+humano);
        
        System.out.println("\n****************************************");
        
        System.out.println("20: "+equipo1);
        System.out.println("21: "+equipo2);
        //comparar Team
        if (equipo1.equals(equipo2)) {
            System.out.println("10: el equipo "+equipo1.name+" es igual al equipo "+equipo2.name);
        }else{
            System.out.println("10: el equipo "+equipo1.name+" no es igual al equipo "+equipo2.name);
        }

        System.out.println("----------------------------------------");
        equipo1.add(et);
        equipo2.add(guerrero);
        System.out.println("22: "+equipo1);
        System.out.println("23: "+equipo2);
        if (equipo1.equals(equipo2)) {
            System.out.println("11: el equipo "+equipo1.name+" es igual al equipo "+equipo2.name);
        }else{
            System.out.println("11: el equipo "+equipo1.name+" no es igual al equipo "+equipo2.name);
        }

        
        equipo2=new Team("Equipo B");
        equipo2.add(humano);
        equipo2.add(guerrero);
        System.out.println("\n****************************************");
        System.out.println("24: "+equipo1);
        System.out.println("25: "+equipo2);
        System.out.println("");
        System.out.println("30: "+humano);
        System.out.println("31: "+humano2);
        //comparar player
        if (humano.equals(humano2)) {
            System.out.println("12: el Player "+humano.getName()+" es igual al Player "+humano2.getName());
        }else{
            System.out.println("12: el Player "+humano.getName()+" no es igual al Player "+humano2.getName());
        }
        
        humano2 = new Human("John Smith", 13, 10, 110);

        System.out.println("----------------------------------------");
        System.out.println("32: "+humano);
        System.out.println("33: "+humano2);
        if (humano.equals(humano2)) {
            System.out.println("13: el Player "+humano.getName()+" es igual al Player "+humano2.getName());
        }else{
            System.out.println("13: el Player "+humano.getName()+" no es igual al Player "+humano2.getName());
        }
        
        //si un Player ya pertenece a un equipo no se puede volver a añadir
        equipo1.add(et);
        System.out.println("\n26: "+equipo1);
        
        //comprobación para v5
        System.out.println("\nComprobar v5\n");
        Item arma1=new Item("Hacha",4,1);
        Item arma2=new Item("Escudo",-1,5);
        Item arma3=new Item("Espada",5,0);
        humano.add(arma1);
        System.out.println(""+humano);
        et.add(arma2);
        guerrero.add(arma3);
        System.out.println(""+et);
        System.out.println("Prueba de ataque con bonus");
        humano.attack(et);
        System.out.println(""+humano);
        System.out.println(""+et);
        
        System.out.println("\n** *** *** *** \n");
        humano.attack(guerrero);
        //No permite añadir un item si pertenece a otro jugador
        humano.add(arma3);
        System.out.println(""+humano);
        System.out.println(""+guerrero);
    }
}
