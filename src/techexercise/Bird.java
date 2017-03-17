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
public class Bird extends Animal {
    
    //Constructors
    
    /**
     * Default constructor
     * Default values for the Bird class:
     * birthType: "Egg Birth"
     * propulsionType: "Wings"
     * kingdom: 100000
     * annualGrowthRate: 0.02 (2%)
     */
    public Bird() {
        this.birthType = "Egg Birth";
        this.propulsionType = "Wings";
        this.kingdom = 100000;
        this.annualGrowthRate = 0.02;
    }
    
    /**
     * Full constructor for the Mammal class
     * @param birthType String describing the type of birth
     * @param propulsionType String describing method of locomotion
     * @param kingdom integer describing the number of animals alive
     * @param annualGrowthRate double describing the growth rate of the population
     */
    public Bird(String birthType, String propulsionType, 
            int kingdom, double annualGrowthRate) {
        this.birthType = birthType;
        this.propulsionType = propulsionType;
        this.kingdom = kingdom;
        this.annualGrowthRate = annualGrowthRate;
    }
    
}
