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
public class HeadwearZombie extends Characters {

    public HeadwearZombie(){
        super(1, 8);
        this.setCycle(1);
        this.setName("Headwear Zombie");
    }
    
    @Override
    public String toString() {
        return "Headwear Zombie{" + "Damege=" + this.getDamage() + ", Life=" + this.getLife() + '}';
    }
    
}