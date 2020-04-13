/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author damsp
 */
public class Warrior extends Human{

    public Warrior() {
        super();
        System.out.println("He creado un Warrior");
    }

    public Warrior(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }
    
    //@Override
    //public void attack(Player p){
    //    super.attack(p);
    //}
    
    @Override
    protected void hit(int attack){
        int diferencia = attack-this.defensePoints;
        if (this instanceof Warrior) {
            if (diferencia<=5) {
                diferencia=0;
                System.out.println(""+this.getName()+" tiene agilidad");
            }
        }
        int nuevavida = this.life-diferencia;
        if (nuevavida<0) {
            nuevavida=0;
        }
        String cadena =""+ this.getName()+" es golpeado con "+attack +" puntos y se defiende con "+this.defensePoints+". Vidas: "+this.life+" - "+diferencia+" = ";
        cadena+=""+nuevavida;
        System.out.println(cadena);
        this.life=nuevavida;
    }
}
