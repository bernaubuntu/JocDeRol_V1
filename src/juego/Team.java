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
public class Team {
    public String name;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        this.players=new ArrayList();
    }
    
    public void add(Player p) throws JugadorRepetidoException{
        if (!existePlayer(p)) {
            p.add(this);
            players.add(p);
        }else{
            throw new JugadorRepetidoException("El jugador '"+p.getName()+"' ya pertenece al equipo '"+this.name+"'");
        }
    }
    
    public void remove(Player p) throws JugadorNoPerteneceEquipoException{
        if (existePlayer(p)) {
            p.remove(this);
            players.remove(p);
        }else{
            throw new JugadorNoPerteneceEquipoException("El jugador '"+p.getName()+"' no pertenece al equipo '"+this.name+"'");
        }
    }

    //public String getName() {
    //    return name;
    //}

    public ArrayList<Player> getMembers() {
        return players;
    }

    private boolean existePlayer(Player p){
        if (players==null) {
            return false;
        }
        for (Iterator<Player> it = players.iterator(); it.hasNext();) {
            Player otro=it.next();
            
            if (otro.equals(p)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        String result="Equipo "+this.name;
        for (Iterator<Player> it = players.iterator(); it.hasNext();) {
            result+="\n"+it.next().toString();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Team)) {
            return false;
        }
        final Team other = (Team) obj;
        if (!Objects.equals(this.name, other.name )) {
            return false;
        }
        ArrayList<Player> otraLista =other.getMembers();
        if (otraLista.size()!=players.size()) {
            return false;
        }
        for (Iterator<Player> iterator = otraLista.iterator(); iterator.hasNext();) {
            Player next = iterator.next();
            if (!existePlayer(next)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 4;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }
}
