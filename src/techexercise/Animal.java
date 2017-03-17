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
public abstract class Animal implements Specifics, Population {
    //Class vars
    protected int kingdom; //Number of animals alive (population)
    //Implement Specifics interface vars
    protected String birthType, propulsionType;
    //Implement Population interface var
    protected double annualGrowthRate;
    
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
    
    //Getters & Setters
    
    /**
     * Get how the animal is born.
     * @return The birth type of the animal
     */
    @Override //Implements the method from the Specifics interface
    public String birthType() {
        return birthType;
    }

    /**
     * Set the birth type of the animal.
     * @param birthType The new birth type
     */
    public void setBirthType(String birthType) {
        this.birthType = birthType;
    }

    /**
     * Get the locomotion type of the animal.
     * @return String describing the animal's method of locomotion
     */
    @Override //Implements the method from the Specifics interface
    public String propulsionType() {
        return propulsionType;
    }

    /**
     * Set the animal's locomotion type.
     * @param propulsionType A description of the animal's method of locomotion
     */
    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    /**
     * Get the animal's annual growth rate.
     * @return The growth rate as a decimal number (double)
     */
    @Override //Implements the method from the Population interface
    public double annualGrowthRate() {
        return annualGrowthRate;
    }

    /**
     * Sets the annual growth rate per year
     * @param annualGrowthRate double indicating the percentage (0.01 = 1%, 1.0 = 100%)
     */
    public void setAnnualGrowthRate(double annualGrowthRate) {
        this.annualGrowthRate = annualGrowthRate;
    }
    
    /**
     * Overload for the case that an integer is used instead of a double
     * @param annualGrowthRate integer indicating the percentage (1 = 1%, 100 = 100%)
     */
    public void setAnnualGrowthRate(int annualGrowthRate) {
        this.annualGrowthRate = annualGrowthRate/100;
    }
    
    //Class methods
    
    /**
     * Calculates the population of an animal after a number of years,
     * compounding annually (Once per year).
     * @param years The number of years to calculate for
     * @return Compounded population after given number of years
     */
    @Override //Implements the method from the Population interface
    public int populationAfterYears(int years) {
        //Perform the compounding calculation:
        //(1 + rate / frequency) ^ (frequency * years)
        //In this case, frequency is once per year and thus 1
        double compoundedGrowthRate = Math.pow(1 + this.annualGrowthRate, years);
        
        //Now multiply the kingdom population by the compounded growth rate.
        //Round to the nearest whole animal, of course.
        return (int) Math.round((double) this.kingdom * compoundedGrowthRate);
    }
}
