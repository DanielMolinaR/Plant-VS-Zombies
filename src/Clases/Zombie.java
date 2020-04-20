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
public class Zombie extends Characters {

    public Zombie(){
        super(1, 5);
        this.setCycle(1);
        this.setName("Zombie");
    }
    
    @Override
    public String toString() {
        return "Zombie{" + "Damage=" + this.getDamage() + ", Life=" + this.getLife() + '}';
    }
    
}