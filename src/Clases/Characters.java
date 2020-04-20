/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author cgpc2
 */
public class Characters {

    private int damage, life;
    private int cycle; // Count the cycle of each character.
    private String name;

    public Characters(int damage, int life) {
        this.damage = damage;
        this.life = life;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    public boolean isNUll(){
        if (this.name.equals(null)) return true;
        return false;
    }
    
    @Override
    public String toString() {
        return "Character{" + "Damage=" + damage + ", Life=" + life + '}';
    }
}