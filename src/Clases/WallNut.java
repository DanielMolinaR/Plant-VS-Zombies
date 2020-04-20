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
public class WallNut extends Characters {

    private int cost;
    
    public WallNut(){
        super(0, 10);
        this.cost = 50;
        this.setName("Wall-Nut");
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Wall-Nut{" + "Cost=" + cost + ", Life=" + this.getLife() + '}';
    }
    
    
    
}