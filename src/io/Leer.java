/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Bernardo Presencia
 */
public class Leer {
    private final static BufferedReader entradaConsola = 
        new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    /**
    * Llig un text del teclat. 
    * @param mensaje Text que es passa a l'usuaro
    * @return el text introduit. Blanc en cas d'error
    */
    public static String leerTexto(String mensaje) {
        String respuesta=null;
        do{
            try {
                System.out.print(mensaje);
                respuesta= entradaConsola.readLine();
            } // ()
            catch (IOException ex) {
                return "";
            }
        } while(respuesta ==null);
        esperarMiliSegundos(50);
        return respuesta;

    } //leer texto

    /**
    * Llig un text del teclat. 
    * @param mensaje Text que es passa a l'usuaro
    * @param cadena Array de String con los caracteres permitidos
    * @return el text introduit. Blanc en cas d'error
    */
    public static String leerArray(String mensaje,String cadena[]) {
        String respuesta=null;
        do{
            try {
                System.out.print(mensaje);
                respuesta= entradaConsola.readLine();
            } // ()
            catch (IOException ex) {
                return "";
            }
            if (respuesta!=null && cadena.length>0) {
                if (!existeEnArray(cadena,respuesta)) {
                    System.out.println("\n\tSolo se permiten: "+Arrays.toString(cadena));
                    respuesta=null;
                }
            }
        } while(respuesta ==null);
        esperarMiliSegundos(50);
        return respuesta;

    } //leer Array String

    /**
    * Introducció de numeros enters
    * @param mensaje Text que es passa a l'usuari
    * @param numeros Array de int con los números permitidos
    * @return un enter amb el valor
    */
    public static int leerArray(String mensaje, int numeros[]) {
        int n=0;
        boolean aconseguit=false;
        while(!aconseguit){
            try{
                n= Integer.parseInt(leerTexto(mensaje));
                aconseguit=true;
                if (numeros.length>0) {
                    //if (Arrays.asList(numeros).contains(n)) {
                    if (!existeEnArray(numeros,n)) {
                        System.out.println("\n\tSolo se permiten: "+Arrays.toString(numeros));
                        aconseguit=false;
                    }
                }
            }
            catch(NumberFormatException ex){
                System.out.println("\tDebes poner un número correcto");
            }
        }//while
        return n;
    } //leer Array int

    /**
     * Devuelve true si encuentra la busqueda dentro de arreglo
     * @param arreglo Array del tipo String
     * @param busqueda String a buscar
     * @return 
     */
    private static boolean existeEnArray(String arreglo[], String busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x].equalsIgnoreCase(busqueda)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve true si encuentra la busqueda dentro de arreglo
     * @param arreglo Array del tipo int
     * @param busqueda int a buscar
     * @return 
     */
    private static boolean existeEnArray(int arreglo[], int busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x] == busqueda) {
                return true;
            }
        }
        return false;
    }

    /**
    * Introducció de numeros enters
    * @param mensaje Missatge que es dona a l'usuari
    * @return un enter amb el valor
    */
    public static int leerEntero(String mensaje) {
        int n=0;
        boolean aconseguit=false;
        while(!aconseguit){
            try{
                n= Integer.parseInt(leerTexto(mensaje));
                aconseguit=true;
            }
            catch(NumberFormatException ex){
                System.out.println("\tDebes poner un número correcto");
            }
        }//while
        return n;
    }//leerEntero

    /**
    * Introducción de numeros enteros
    * @param mensaje Mensaje que te da el usuario
    * @param primero Número menor que está permitido
    * @param ultimo Número mayor que está permitido
    * @return un entero con el valor
    */
    public static int leerEntero(String mensaje, int primero, int ultimo) {
        int n=0;
        boolean aconseguit=false;
        while(!aconseguit){
            try{
                n= Integer.parseInt(leerTexto(mensaje));
                aconseguit=true;
            }
            catch(NumberFormatException ex){
                System.out.println("\tDebes poner un número correcto\n");
            }
            if (aconseguit) {
                if (n < primero || n > ultimo) {
                    System.out.println("\tTiene que ser un número entre "+ primero +" y "+ ultimo +"\n");
                    aconseguit=false;
                }
            }
        }//while
        return n;
    }//leerentero

    /**
    * Introducció de numeros doubles
    * @param mensaje Missatge que es dona a l'usuari
    * @return un double amb el valor
    */
    public static double leerDouble(String mensaje) {
        double n=0.0;
        boolean aconseguit=false;
        while(!aconseguit){
            try{
                n= Double.parseDouble(leerTexto(mensaje));
                aconseguit=true;
            }
            catch(NumberFormatException ex){
                System.out.println("\tDebes poner un número correcto");
            }
        }//while
        return n;
    }//leerdouble

    /**
    * Introducción de numeros doubles
    * @param mensaje Mensaje que te da el usuario
    * @param primero Número menor que está permitido
    * @param ultimo Número mayor que está permitido
    * @return un double con el valor
    */
    public static double leerDouble(String mensaje, double primero, double ultimo) {
        double n=0.0;
        boolean aconseguit=false;
        while(!aconseguit){
            try{
                n= Double.parseDouble(leerTexto(mensaje));
                aconseguit=true;
            }
            catch(NumberFormatException ex){
                System.out.println("\tDebes poner un número correcto");
            }
            if (aconseguit) {
                if (n < primero || n > ultimo) {
                    System.out.println("\tTiene que ser un número entre "+ primero +" y "+ ultimo);
                    aconseguit=false;
                }
            }
        }//while
        return n;
    }//leerdoble
/**/

    /**
    * Introducció de numeros floats
    * @param mensaje Missatge que es dona a l'usuari
    * @return un float amb el valor
    */
    public static float leerFloat(String mensaje) {
        float n=0;
        boolean aconseguit=false;
        while(!aconseguit){
            try{
                n= Float.parseFloat(leerTexto(mensaje));
                aconseguit=true;
            }
            catch(NumberFormatException ex){
                System.out.println("\tDebes poner un número correcto");
            }
        }//while
        return n;
    }//leerfloat

    /**
    * Introducción de numeros floats
    * @param mensaje Mensaje que te da el usuario
    * @param primero Número menor que está permitido
    * @param ultimo Número mayor que está permitido
    * @return un float con el valor
    */
    public static float leerFloat(String mensaje, float primero, float ultimo) {
        float n=0;
        boolean aconseguit=false;
        while(!aconseguit){
            try{
                n= Float.parseFloat(leerTexto(mensaje));
                aconseguit=true;
            }
            catch(NumberFormatException ex){
                System.out.println("\tDebes poner un número correcto");
            }
            if (aconseguit) {
                if (n < primero || n > ultimo) {
                    System.out.println("\tTiene que ser un número entre "+ primero +" y "+ ultimo);
                    aconseguit=false;
                }
            }
        }//while
        return n;
    }//leerfloat
    
    /**
     * Pausa la ejecución durante X segundos.
     * @param segundos El número de segundos que se quiere esperar.
     */
    public static void esperarSegundos(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }//esperarSegundos
    
    /**
     * Pausa la ejecución durante X milisegundos.
     * @param milisegundos El número de milisegundos que se quiere esperar.
     */
    public static void esperarMiliSegundos(int milisegundos){
        try {
            Thread.sleep(milisegundos);
         } catch (Exception e) {
            System.out.println(e);
         }
    }//esperarSegundos

}//final de la clase
