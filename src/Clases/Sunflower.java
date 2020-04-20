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
public class Sunflower extends Characters {
    
    private int cost;

    public Sunflower(){
        super(0, 1);
        this.setCycle(1);
        this.cost = 20;
        this.setName("Sunflower");
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Sunflower{" + "Cost=" + cost + "Damage=" + this.getDamage() + ", Life=" + this.getLife() + '}';
    }
    
    
    
}