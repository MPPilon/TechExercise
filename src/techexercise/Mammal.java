/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techexercise;

/**
 *
 * @author Matthew Pilon
 */
public class Mammal extends Animal  {
    
    //Constructors
    
    /**
     * Default constructor
     */
    public Mammal() {
        this.birthType = "Live Birth";
        this.propulsionType = "Legs";
        this.kingdom = 100000;
        this.annualGrowthRate = 0.04;
    }
    
    /**
     * Full constructor for the Mammal class
     * @param birthType String describing the type of birth
     * @param propulsionType String describing method of locomotion
     * @param kingdom integer describing the number of animals alive
     * @param annualGrowthRate double describing the growth rate of the population
     */
    public Mammal(String birthType, String propulsionType, 
            int kingdom, double annualGrowthRate) {
        this.birthType = birthType;
        this.propulsionType = propulsionType;
        this.kingdom = kingdom;
        this.annualGrowthRate = annualGrowthRate;
    }
    
    
    
}
