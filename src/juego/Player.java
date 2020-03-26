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
public abstract class Player {

    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life;
    
    public Player() {
        this.name = "Novato";
        this.attackPoints = 5;
        this.defensePoints = 1;
        this.life = 15;
        //System.out.println("He creado un Player");
    }

    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
    }

    public void attack(Player p){
        if (p.life<=0 || this.life<=0) {
            //System.out.println("No se puede atacar porque ya está muerto");
            return;
        }
        System.out.println("****************************************");
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
        String cadena =""+ this.name+" es golpeado con "+attack +" puntos y se defiende con "+this.defensePoints+". Vidas: "+this.life+" - "+diferencia+" = ";
        int nuevavida = this.life-diferencia;
        if (nuevavida<0) {
            nuevavida=0;
        }
        cadena+=""+nuevavida;
        System.out.println(cadena);
        this.life=nuevavida;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    
    @Override
    public String toString(){
        String result=this.name+" PA:"+this.attackPoints+" / PD:"+this.defensePoints+" / PV:"+this.life;
        return result;
    }
}
