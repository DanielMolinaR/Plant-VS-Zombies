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
public class Peashooter extends Characters {
    
    private int cost; 
    
    public Peashooter() {
        super(1, 3);
        this.cost = 50;
        this.setName("Peashooter");
    }    

    public int getCost() {
        return cost;
    }

    public void setCoste(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Peashooter{" + "Cost=" + cost + "Damage=" + this.getDamage() + ", Life=" + this.getLife() + '}';
    }    
}