/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import juego.*;
import io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernardo Presencia
 */
public class JocDeRol {
    
    private static ArrayList<Player> jugadores;
    private static ArrayList<Team> grupos;
    private static ArrayList<Item> armas;
    
    public static void main(String[] args) {
        jugadores = new ArrayList();
        grupos = new ArrayList();
        armas = new ArrayList();
        
        menuPrincipal();
        //pruebaFase();
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
        
        try {
            equipo1.add(et);
        } catch (JugadorRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        try {
            equipo1.add(humano);
        } catch (JugadorRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        System.out.println("2: "+equipo1);
        try {
            equipo1.remove(et);
        } catch (JugadorNoPerteneceEquipoException ex) {
            System.out.println("**Error: "+ex.getMessage());
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("3: "+equipo1);
        System.out.println("3.1: "+et);
        try {
            equipo2.add(humano);
        } catch (JugadorRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
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
        try {
            equipo1.add(et);
        } catch (JugadorRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        try {
            equipo2.add(guerrero);
        } catch (JugadorRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        System.out.println("22: "+equipo1);
        System.out.println("23: "+equipo2);
        if (equipo1.equals(equipo2)) {
            System.out.println("11: el equipo "+equipo1.name+" es igual al equipo "+equipo2.name);
        }else{
            System.out.println("11: el equipo "+equipo1.name+" no es igual al equipo "+equipo2.name);
        }

        
        equipo2=new Team("Equipo B");
        try {
            equipo2.add(humano);
        } catch (JugadorRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        try {
            equipo2.add(guerrero);
        } catch (JugadorRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
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
        
        try {
            //si un Player ya pertenece a un equipo no se puede volver a añadir
            equipo1.add(et);
        } catch (JugadorRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        System.out.println("\n26: "+equipo1);
        
        //comprobación para v5
        System.out.println("\nComprobar v5\n");
        Item arma1=new Item("Hacha",4,1);
        Item arma2=new Item("Escudo",-1,5);
        Item arma3=new Item("Espada",5,0);
        try {
            humano.add(arma1);
        } catch (ObjetoRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        System.out.println(""+humano);
        try {
            et.add(arma2);
        } catch (ObjetoRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        try {
            guerrero.add(arma3);
        } catch (ObjetoRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        System.out.println(""+et);
        System.out.println("Prueba de ataque con bonus");
        try {
            humano.attack(et);
        } catch (MuertoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        System.out.println(""+humano);
        System.out.println(""+et);
        
        System.out.println("\n** *** *** *** \n");
        try {
            humano.attack(guerrero);
        } catch (MuertoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        try {
            //No permite añadir un item si pertenece a otro jugador
            humano.add(arma3);
        } catch (ObjetoRepetidoException ex) {
            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("**Error: "+ex.getMessage());
        }
        System.out.println(""+humano);
        System.out.println(""+guerrero);
    }
    
    private static void menuPrincipal(){
        int opcion=0;
        boolean salir = false;
        do{
            System.out.println("");
            System.out.println("   *** Juego de Rol ***");
            System.out.println("1. Configuración");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            System.out.println("");
            
            opcion=Leer.leerEntero("Selecciona una opción (1-3): ", 1, 3);
            switch(opcion){
                case 1:
                    menuConfiguracion();
                    break;
                case 2:
                    jugar();
                    break;
                case 3:
                    salir = true;
                    break;
            }
        }while(!salir);
    }
    
    private static void menuConfiguracion(){
        int opcion=0;
        boolean salir = false;
        do{
            System.out.println("");
            System.out.println("   *** Configuración ***");
            System.out.println("1. Gestión Jugadores");
            System.out.println("2. Gestión Equipos");
            System.out.println("3. Gestión Objetos");
            System.out.println("4. Salir");
            System.out.println("5. Cambiar Vida");
            System.out.println("");
            
            opcion=Leer.leerEntero("Selecciona una opción (1-4): ", 1, 4);
            switch(opcion){
                case 1:
                    menuJugadores();
                    break;
                case 2:
                    menuEquipos();
                    break;
                case 3:
                    menuObjetos();
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }while(!salir);
    }
    
    private static void menuJugadores(){
        int opcion=0;
        boolean salir = false;
        do{
            System.out.println("");
            System.out.println("   *** Jugadores ***");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Mostrar Jugadores");
            System.out.println("3. Borrar Jugador");
            System.out.println("4. Asignar Jugador a Equipo");
            System.out.println("5. Asignar Objeto a Jugador");
            System.out.println("6. Salir");
            System.out.println("");
            
            opcion=Leer.leerEntero("Selecciona una opción (1-6): ", 1, 6);
            switch(opcion){
                case 1:
                    crearJugador();
                    break;
                case 2:
                    mostrarJugadores();
                    break;
                case 3:
                    borrarJugador();
                    break;
                case 4:
                    asignarJugadorEquipo();
                    break;
                case 5:
                    asignarObjetoJugador();
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }while(!salir);
    }

    private static void crearJugador(){
        int pa = 0;
        int pd = 0;
        int vida = 100;
        String texto = "";
        String nombreJugador = "";
        boolean salir = false;
        String nombrePlayer[]={"Alien","Warrior","Human"};
        //String tipoJugador = "";
        int opcionNombre=0;
        //do{
            //boolean repetir = true;
            //texto = Leer.leerTexto("Tipo de jugador? (A,W,H): ");
            texto = Leer.leerArray("Tipo de jugador? (A,W,H): ", new String[] {"A","W","H"});
            switch(texto.toLowerCase()){
                case "a"://alien
                    opcionNombre = 0;
                    //salir = true;
                    break;
                case "w"://warrior
                    opcionNombre = 1;
                    //salir = true;
                    break;
                case "h"://human
                    opcionNombre = 2;
                    //salir = true;
                    break;
                //case "x"://para salir
                //    salir = true;
                //    break;
                //default:
                //    System.out.println("Solo se permite la letra 'A', 'W' o la 'H'");
                //    break;
            }
        //}while(!salir);
        
        salir = false;
        do{
            nombreJugador = Leer.leerTexto("Nombre para el jugador del tipo '"+nombrePlayer[opcionNombre]+"'? ");
        }while(nombreJugador.trim().equalsIgnoreCase(""));
        
        pa = Leer.leerEntero("puntos de ataque para el jugador '"+nombreJugador+"' (1-100): ",1,100);
        pd = 100-pa;
        
        Player j=null;
        switch(opcionNombre){
            case 0://Alien
                j = new Alien(nombreJugador,pa,pd,vida);
                break;
            case 1://Warrior
                j = new Warrior(nombreJugador,pa,pd,vida);
                break;
            case 2://Human
                j = new Human(nombreJugador,pa,pd,vida);
                break;
            default:
                j = null;
                break;
        }
        if (!existeJugador(j)) {
            //jugadores.add(j);
            if (jugadores.add(j)) {
                System.out.println("Se ha añadido al jugador '"+j.getName()+"'");
            }else{
                System.out.println("No se ha podido añadir al jugador '"+j.getName()+"'");
            }
        }else{
            try {
                throw new JugadorRepetidoException("El jugador '"+j.getName()+"' ya existe.");
            } catch (JugadorRepetidoException ex) {
                //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("**Error: "+ex.getMessage());
            }
        }
                
    }
    
    private static void mostrarJugadores(){
        if (jugadores.size()>0) {
            System.out.println("\nMostrando los Jugadores:");
            System.out.println("***********************");
            for (Iterator<Player> it = jugadores.iterator(); it.hasNext();) {
                Player otro=it.next();
                System.out.println(""+otro);
            }
            System.out.println("***********************");
            Leer.esperarSegundos(5);
        }else {
            System.out.println("\nNo hay Jugadores");
            Leer.esperarSegundos(2);
        }
    }
    
    private static void borrarJugador(){
        if (jugadores.size()>0) {
            int opcion = 0;
            //System.out.println("Selecciona un jugador para borrarlo");
            System.out.println("***********************");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println(""+(i+1)+". "+jugadores.get(i));
            }
            System.out.println("***********************");
            opcion = Leer.leerEntero("Selecciona un jugador para borrarlo (1-"+jugadores.size()+"): ", 0,jugadores.size());
            if (opcion==0) {
                System.out.println("No has seleccionado ningún jugador para eliminar ");
                Leer.esperarSegundos(2);
            }else{
                Player p = jugadores.get(opcion-1);
                if (jugadores.remove(p)) {
                    //borrar al jugador de los equipos a los que pertenece
                    for (int i = 0; i < p.getEquipos().size(); i++) {
                        Team otro=p.getEquipos().get(i);
                        try {
                            otro.remove(p);
                        } catch (JugadorNoPerteneceEquipoException ex) {
                            System.out.println("**Error: "+ex.getMessage());
                            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    System.out.println("Se ha eliminado al jugador '"+p.getName()+"'");
                    Leer.esperarSegundos(3);                  
                }else {
                    System.out.println("No se ha podido eliminar al jugador '"+p.getName()+"'");
                    Leer.esperarSegundos(2);
                }
            }
        }
    }
    
    private static void asignarJugadorEquipo(){
        if (jugadores.size()>0 && grupos.size()>0) {
            int opcion = 0;
            //System.out.println("Selecciona un jugador para borrarlo");
            System.out.println("***********************");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println(""+(i+1)+". "+jugadores.get(i));
            }
            System.out.println("***********************");
            opcion = Leer.leerEntero("Selecciona un jugador para añadir a un equipo (1-"+jugadores.size()+"): ", 0,jugadores.size());
            if (opcion==0) {
                System.out.println("No has seleccionado ningún jugador");
                Leer.esperarSegundos(2);
            }else{
                Player p = jugadores.get(opcion-1);
                System.out.println("***********************");
                opcion = 0;
                for (int i = 0; i < grupos.size(); i++) {
                    System.out.println(""+(i+1)+". "+grupos.get(i));
                }
                System.out.println("***********************");
                opcion = Leer.leerEntero("Selecciona un Equipo para añadir al jugador '"+p.getName()+"' (1-"+grupos.size()+"): ", 0,grupos.size());
                if (opcion==0) {
                    System.out.println("No has seleccionado ningún Equipo");
                    Leer.esperarSegundos(2);
                }else{
                    Team t = grupos.get(opcion-1);
                    try {
                        t.add(p);
                        System.out.println("Se ha añadido el jugador '"+p.getName()+"' al equipo '"+t.name+"'");
                        Leer.esperarSegundos(3);
                    } catch (JugadorRepetidoException ex) {
                        System.out.println("**Error: "+ex.getMessage());
                        //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                //jugadores.remove(p);
                //System.out.println("Se ha eliminado al jugador '"+p.getName()+"'");
                //Leer.esperarSegundos(3);
            }
        }
    }

    private static void borrarJugadorEquipo(){
        if (jugadores.size()>0 && grupos.size()>0) {
            int opcion = 0;
            //System.out.println("Selecciona un jugador para borrarlo");
            System.out.println("***********************");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println(""+(i+1)+". "+jugadores.get(i));
            }
            System.out.println("***********************");
            opcion = Leer.leerEntero("Selecciona un jugador para borrarlo del Equipo (1-"+jugadores.size()+"): ", 0,jugadores.size());
            if (opcion==0) {
                System.out.println("No has seleccionado ningún jugador");
                Leer.esperarSegundos(2);
            }else{
                Player p = jugadores.get(opcion-1);
                System.out.println("***********************");
                opcion = 0;
                for (int i = 0; i < grupos.size(); i++) {
                    System.out.println(""+(i+1)+". "+grupos.get(i));
                }
                System.out.println("***********************");
                opcion = Leer.leerEntero("Selecciona un Equipo para borrar al jugador '"+p.getName()+"' (1-"+grupos.size()+"): ", 0,grupos.size());
                if (opcion==0) {
                    System.out.println("No has seleccionado ningún Equipo");
                    Leer.esperarSegundos(2);
                }else{
                    Team t = grupos.get(opcion-1);
                    try {
                        t.remove(p);
                        System.out.println("Se ha borrado al jugador '"+p.getName()+"' del equipo '"+t.name+"'");
                        Leer.esperarSegundos(3);
                    } catch (JugadorNoPerteneceEquipoException ex) {
                        System.out.println("**Error: "+ex.getMessage());
                        //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                //jugadores.remove(p);
                //System.out.println("Se ha eliminado al jugador '"+p.getName()+"'");
                //Leer.esperarSegundos(3);
            }
        }
    }

    private static void asignarObjetoJugador(){
        if (jugadores.size()>0 && armas.size()>0) {
            int opcion = 0;
            System.out.println("***********************");
            for (int i = 0; i < armas.size(); i++) {
                System.out.println(""+(i+1)+". "+armas.get(i));
            }
            System.out.println("***********************");
            opcion = Leer.leerEntero("Selecciona un Objeto para asignarlo a un jugador (1-"+armas.size()+"): ", 0,armas.size());
            if (opcion==0) {
                System.out.println("No has seleccionado ningún Objeto");
                Leer.esperarSegundos(2);
            }else{
                Item t = armas.get(opcion-1);
                System.out.println("***********************");
                opcion = 0;
                for (int i = 0; i < jugadores.size(); i++) {
                    System.out.println(""+(i+1)+". "+jugadores.get(i));
                }
                System.out.println("***********************");
                opcion = Leer.leerEntero("Selecciona un Jugador para asignarle el objeto '"+t.getName()+"' (1-"+jugadores.size()+"): ", 0,jugadores.size());
                if (opcion==0) {
                    System.out.println("No has seleccionado ningún Jugador");
                    Leer.esperarSegundos(2);
                }else{
                    Player p = jugadores.get(opcion-1);
                    //p.add(t);
                    //System.out.println("Se ha añadido el Objeto '"+t.getName()+"' al jugador '"+p.getName()+"'");
                    //Leer.esperarSegundos(3);
                    try {
                        p.add(t);
                        System.out.println("Se ha añadido el Objeto '"+t.getName()+"' al jugador '"+p.getName()+"'");
                        Leer.esperarSegundos(3);
                    } catch (ObjetoRepetidoException ex) {
                        System.out.println("**Error: "+ex.getMessage());
                        //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                //jugadores.remove(p);
                //System.out.println("Se ha eliminado al jugador '"+p.getName()+"'");
                //Leer.esperarSegundos(3);
            }
        }
    }

    private static boolean existeJugador(Player p){
        if (jugadores==null) {
            return false;
        }
        for (Iterator<Player> it = jugadores.iterator(); it.hasNext();) {
            Player otro=it.next();
            
            if (otro.equals(p)) {
                return true;
            }
        }
        return false;
    }
    
    private static void menuEquipos(){
        int opcion=0;
        boolean salir = false;
        do{
            System.out.println("");
            System.out.println("   *** Equipos ***");
            System.out.println("1. Crear Equipo");
            System.out.println("2. Mostrar Equipos");
            System.out.println("3. Borrar Equipo");
            System.out.println("4. Asignar Equipo a Jugador");
            System.out.println("5. Borrar Jugador del Equipo");
            System.out.println("6. Salir");
            System.out.println("");
            
            opcion=Leer.leerEntero("Selecciona una opción (1-6): ", 1, 6);
            switch(opcion){
                case 1:
                    crearEquipo();
                    break;
                case 2:
                    mostrarEquipos();
                    break;
                case 3:
                    borrarEquipo();
                    break;
                case 4:
                    asignarJugadorEquipo();
                    break;
                case 5:
                    borrarJugadorEquipo();
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }while(!salir);
    }

    private static void crearEquipo(){
        String texto = "";
        String nombreEquipo = "";
        boolean salir = false;

        do{
            nombreEquipo = Leer.leerTexto("Nombre para el Equipo? ");
        }while(nombreEquipo.trim().equalsIgnoreCase(""));
                
        Team t=new Team(nombreEquipo);
        if (!existeEquipo(t)) {
            //grupos.add(t);
            if (grupos.add(t)) {
                System.out.println("Se ha añadido el Equipo '"+t.name+"'");
            } else {
                System.out.println("No se ha podido añadir el Equipo '"+t.name+"'");
            }
        }else{
            try {
                throw new EquipoRepetidoException("El Equipo '"+t.name+"' ya existe.");
            } catch (EquipoRepetidoException ex) {
                //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("**Error: "+ex.getMessage());
            }
        }
    }

    private static void mostrarEquipos(){
        if (grupos.size()>0) {
            System.out.println("\nMostrando los Equipos:");
            System.out.println("***********************");
            for (Iterator<Team> it = grupos.iterator(); it.hasNext();) {
                Team otro=it.next();
                System.out.println(""+otro);
            }
            System.out.println("***********************");
            Leer.esperarSegundos(5);
        }else {
            System.out.println("\nNo hay Equipos");
            Leer.esperarSegundos(2);
        }
    }

    private static void borrarEquipo(){
        if (grupos.size()>0) {
            int opcion = 0;
            System.out.println("***********************");
            for (int i = 0; i < grupos.size(); i++) {
                System.out.println(""+(i+1)+". "+grupos.get(i));
            }
            System.out.println("***********************");
            opcion = Leer.leerEntero("Selecciona un Equipo para borrarlo (1-"+grupos.size()+"): ", 0,grupos.size());
            if (opcion==0) {
                System.out.println("No has seleccionado ningún Equipo para eliminar ");
                Leer.esperarSegundos(2);
            }else{
                Team t = grupos.get(opcion-1);
                if (grupos.remove(t)) {
                    //borrar al equipo de los jugadores a los que pertenece
                    for (int i = 0; i < t.getMembers().size(); i++) {
                        Player otro=t.getMembers().get(i);
                        try {
                            otro.remove(t);
                        } catch (JugadorNoPerteneceEquipoException ex) {
                            //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("**Error: "+ex.getMessage());
                        }
                    }
                    System.out.println("Se ha eliminado al Equipo '"+t.name+"'");
                    Leer.esperarSegundos(3);                    
                }else{
                    System.out.println("No se ha podido eliminar al Equipo '"+t.name+"'");
                    Leer.esperarSegundos(2);
                }
            }
        }
    }

    private static boolean existeEquipo(Team t){
        if (grupos==null || grupos.size()==0) {
            return false;
        }
        for (Iterator<Team> it = grupos.iterator(); it.hasNext();) {
            Team otro=it.next();
            
            if (otro.equals(t)) {
                return true;
            }
        }
        return false;
    }

    private static void menuObjetos(){
        int opcion=0;
        boolean salir = false;
        do{
            System.out.println("");
            System.out.println("   *** Objetos ***");
            System.out.println("1. Crear Objeto");
            System.out.println("2. Mostrar Objetos");
            System.out.println("3. Borrar Objeto");
            System.out.println("4. Asignar Objeto a Jugador");
            System.out.println("5. Salir");
            System.out.println("");
            
            opcion=Leer.leerEntero("Selecciona una opción (1-5): ", 1, 5);
            switch(opcion){
                case 1:
                    crearObjeto();
                    break;
                case 2:
                    mostrarObjetos();
                    break;
                case 3:
                    borrarObjeto();
                    break;
                case 4:
                    asignarObjetoJugador();
                    break;
                case 5:
                    salir = true;
                    break;
            }
        }while(!salir);
    }
    

    private static void crearObjeto(){
        int pa = 0;
        int pd = 0;
        String texto = "";
        String nombreObjeto = "";
        boolean salir = false;
        do{
            nombreObjeto = Leer.leerTexto("Nombre para el Objeto? ");
        }while(nombreObjeto.trim().equalsIgnoreCase(""));
        
        pa = Leer.leerEntero("puntos de ataque para el Objeto '"+nombreObjeto+"'?: ");
        pd = Leer.leerEntero("puntos de defensa para el Objeto '"+nombreObjeto+"'?: ");
        
        Item j=new Item(nombreObjeto,pa,pd);
        if (!existeObjeto(j)) {
            //armas.add(j);
            if (armas.add(j)) {
                System.out.println("Se ha añadido el Objeto '"+j.getName()+"'");
            }else{
                System.out.println("No se ha podido añadir el Objeto '"+j.getName()+"'");
            }
        }else{
            try {
                throw new ObjetoRepetidoException("El Objeto '"+j.getName()+"' ya existe.");
            } catch (ObjetoRepetidoException ex) {
                //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("**Error: "+ex.getMessage());
            }
        }
                
    }

    private static void mostrarObjetos(){
        if (armas.size()>0) {
            System.out.println("\nMostrando los Objetos:");
            System.out.println("***********************");
            for (Iterator<Item> it = armas.iterator(); it.hasNext();) {
                Item otro=it.next();
                System.out.println(""+otro);
            }
            System.out.println("***********************");
            Leer.esperarSegundos(5);
        }else {
            System.out.println("\nNo hay Objetos");
            Leer.esperarSegundos(2);
        }
    }

    private static void borrarObjeto(){
        if (armas.size()>0) {
            int opcion = 0;
            System.out.println("***********************");
            for (int i = 0; i < armas.size(); i++) {
                System.out.println(""+(i+1)+". "+armas.get(i));
            }
            System.out.println("***********************");
            opcion = Leer.leerEntero("Selecciona un Objeto para borrarlo (1-"+armas.size()+"): ", 0,armas.size());
            if (opcion==0) {
                System.out.println("No has seleccionado ningún Objeto para eliminar ");
                Leer.esperarSegundos(2);
            }else{
                Item t = armas.get(opcion-1);
                //armas.remove(t);
                if (armas.remove(t)) {
                    //elimina el objeto del jugador
                    if (t.jugador != null) {
                        t.jugador.remove(t);
                    } 
                    System.out.println("Se ha eliminado al objeto '"+t.getName()+"'");
                    Leer.esperarSegundos(3);                    
                }else{
                    System.out.println("No se ha podido eliminar el objeto '"+t.getName()+"'");
                    Leer.esperarSegundos(2);                    
                }
            }
        }
    }

    private static boolean existeObjeto(Item t){
        if (armas==null || armas.size()==0) {
            return false;
        }
        for (Iterator<Item> it = armas.iterator(); it.hasNext();) {
            Item otro=it.next();
            
            if (otro.equals(t)) {
                return true;
            }
        }
        return false;
    }

    private static void jugar(){
        if (jugadores.size()<2) {
            System.out.println("Tienen que haber 2 jugadores como mínimo para poder jugar");
            return;
        }
        int posicion = 0;
        int posicionAtaque = 0;
        boolean salir = false;
        boolean repetir = false;
        System.out.println("\nEmpieza el juego\n");
        do{
            Player p=jugadores.get(posicion);
            if (p.getLife()>0) {
                Player atacado = null;
                do{
                    repetir=false;
                    try {
                        //do{
                            System.out.println("Le toca atacar a "+p.getName());
                            //repetir=false;
                            posicionAtaque=elegirJugador();

                            atacado=jugadores.get(posicionAtaque-1);

                            if (p.equals(atacado)) {
                                throw new NoAtacarseException("No puede atacarse a si mismo");
                                //System.out.println("No puede atacarse a si mismo");
                                //System.out.println("Selecciona otro jugador para atacar");
                                //repetir=true;
                            //}else if (atacado.getLife()==0) {
                            //    System.out.println("No puede atacar a quien está muerto");
                            //    System.out.println("Selecciona otro jugador para atacar");
                            //    repetir=true;
                            }
                        //}while(repetir);
                        p.attack(atacado);
                    } catch (MuertoException ex) {
                        repetir=true;
                        System.out.println("**Error: "+ex.getMessage());
                        //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NoAtacarseException ex) {
                        //Logger.getLogger(JocDeRol.class.getName()).log(Level.SEVERE, null, ex);
                        repetir=true;
                        System.out.println("**Error: "+ex.getMessage());
                    }
                }while(repetir);
                if (cantidadJugadoresVivos()==1) {
                    if (p.getLife()==0 && atacado.getLife()>0) {
                        System.out.println("Ha ganado el jugador '"+atacado.getName()+"'");
                    }else {
                        System.out.println("Ha ganado el jugador '"+p.getName()+"'");
                    }
                    salir=true;
                }else if (cantidadJugadoresVivos()==0) {
                    System.out.println("No ha habido ningún ganador porque están todos muertos");
                    salir=true;
                }
            }else{
                if (cantidadJugadoresVivos()==0) {
                    System.out.println("No ha habido ningún ganador porque están todos muertos");
                    salir=true;
                }
            }
            
            if (!salir) {
                posicion++;
                if (posicion>=jugadores.size()) {
                    posicion = 0;
                }
            }
        }while(!salir);
        jugadores = new ArrayList();
        grupos = new ArrayList();
        armas = new ArrayList();
        
    }
    
    private static int cantidadJugadoresVivos(){
        int result=0;
        for (Iterator<Player> it = jugadores.iterator(); it.hasNext();) {
            Player otro=it.next();
            if (otro.getLife()>0) {
                result++;
            }
        }
        return result;
    }
    
    private static int elegirJugador(){
        int opcion = 0;
        System.out.println("***********************");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(""+(i+1)+". "+jugadores.get(i));
        }
        System.out.println("***********************");
        opcion = Leer.leerEntero("Selecciona un jugador para atacarlo (1-"+jugadores.size()+"): ", 1,jugadores.size());
        return opcion;
    }
}
