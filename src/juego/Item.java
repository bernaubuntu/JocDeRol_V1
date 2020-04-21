/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Objects;

/**
 *
 * @author damsp
 */
public class Item {
    private String name;
    private int attackBonus;
    private int defenseBonus;
    protected Player jugador;

    public Item(String name, int attackBonus, int defenseBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.jugador = null;
    }

    public String getName() {
        return name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    @Override
    public String toString(){
        String result=this.name+" BA:"+this.attackBonus+" / BD:"+this.defenseBonus;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Player)) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.name.toLowerCase(), other.name.toLowerCase())) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 6;
        hash = 57 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
}
