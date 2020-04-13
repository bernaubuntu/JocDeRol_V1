/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Bernardo Presencia
 */
public abstract class Player {

    private String name;
    protected int attackPoints;// modificado a protected para poder acceder desde la clase heredada
    protected int defensePoints;// modificado a protected para poder acceder desde la clase heredada
    protected int life;// modificado a protected para poder acceder desde la clase heredada
    private ArrayList<Team> teams;
    
    public Player() {
        this("Novato",5,1,15);
        /*
        this.name = "Novato";
        this.attackPoints = 5;
        this.defensePoints = 1;
        this.life = 15;
        */
        //System.out.println("He creado un Player");
    }

    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
        this.teams=new ArrayList();
    }

    public void add(Team t){
        if (!existeTeam(t)) {
            teams.add(t);
            t.add(this);
            //t.add(this);
            //System.out.println("Equipo añadido a Player");
        }
    }
    
    public void remove(Team t){
        if (existeTeam(t)) {
            teams.remove(t);
            t.remove(this);
            //System.out.println("Equipo eliminado de Player");
        }
    }

    private boolean existeTeam(Team t){
        if (teams.size()==0) {
            return false;
        }
        for (Iterator<Team> it = teams.iterator(); it.hasNext();) {
            Team otro=it.next();
            if (otro.equals(t)) {
                return true;
            }
        }
        return false;
    }
    
    public void attack(Player p){
        if (p.life<=0 || this.life<=0) {
            return;
        }
        System.out.println("****************************************");
        //if (this instanceof Alien) {
        //    if (this.life>20) {
        //        this.attackPoints+=3;
        //        this.defensePoints-=3;
        //        if(this.defensePoints<0){
        //            this.defensePoints=0;
        //        }
        //        System.out.println(""+this.name+" está enloquecido");
        //    }
        //}
        
        // antes del ataque
        System.out.println("Atacante: "+this);
        System.out.println("Atacado:  "+p+"\n");
        
        // ataque
        p.hit(this.attackPoints);
        if (p.life>0) {
            this.hit(p.attackPoints);
        }
        // despues del ataque
        System.out.println("\nAtacante: "+this);
        System.out.println("Atacado:  "+p);
        System.out.println("----------------------------------------");
    }
    
    protected void hit(int attack){
        int diferencia = attack-this.defensePoints;
        //if (this instanceof Warrior) {
        //    if (diferencia<=5) {
        //        diferencia=0;
        //        System.out.println(""+this.name+" tiene agilidad");
        //    }
        //}
        int nuevavida = this.life-diferencia;
        if (nuevavida<0) {
            nuevavida=0;
        }
        String cadena =""+ this.name+" es golpeado con "+attack +" puntos y se defiende con "+this.defensePoints+". Vidas: "+this.life+" - "+diferencia+" = ";
        cadena+=""+nuevavida;
        System.out.println(cadena);
        this.life=nuevavida;
    }
    
    public String getName() {
        return name;
    }
    
    /*
    public void setName(String name) {
        this.name = name;
    }
    */

    public int getAttackPoints() {
        return attackPoints;
    }
    
    /*
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }
    */

    public int getDefensePoints() {
        return defensePoints;
    }
    
    /*
    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }
    */
    
    public int getLife() {
        return life;
    }
    
    /*
    public void setLife(int life) {
        this.life = life;
    }
    */
    
    @Override
    public String toString(){
        String result=this.name+" PA:"+this.attackPoints+" / PD:"+this.defensePoints+" / PV:"+this.life;
        result+=" ( pertenece a "+teams.size()+" equipo"+((teams.size()>1)?"s":"")+" )";
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Player)) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name) || !Objects.equals(this.attackPoints, other.attackPoints) || !Objects.equals(this.defensePoints, other.defensePoints) || !Objects.equals(this.life, other.life)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
