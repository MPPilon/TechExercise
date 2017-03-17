/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techexercise;

/**
 *
 * @author c0538434
 */
public abstract class Animal implements Specifics, Population {
    //Class vars
    protected int kingdom; //Number of animals alive (population)
    

    //Getters & Setters
    
    /**
     * Get the kingdom population.
     * @return The kingdom's population
     */
    public int kingdom() {
        return kingdom;
    }

    /**
     * Set the kingdom population.
     * @param kingdom The new population value
     */
    public void setKingdom(int kingdom) {
        this.kingdom = kingdom;
    }
}
