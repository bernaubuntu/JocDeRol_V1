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
public class Alien extends Player{

    public Alien() {
        super();
        System.out.println("He creado un Alien");
    }

    public Alien(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }
    
    @Override
    public void attack(Player p){
        if (p.life<=0 || this.life<=0) {
            return;
        }
        System.out.println("****************************************");
        if (this.life>20) {
            this.attackPoints+=3;
            this.defensePoints-=3;
            if(this.defensePoints<0){
                this.defensePoints=0;
            }
            System.out.println(""+this.getName()+" está enloquecido");
        }

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
    
    //@Override
    //protected void hit(int attack){
    //    super.hit(attack);
    //}
}
