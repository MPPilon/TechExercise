package techexercise;

/**
 * The superclass for all animals to be derived from.
 * The Specifics and Population interfaces are implemented within this class, 
 * and most methods are implemented as getters for a respective class variable. 
 * These variables are also given a setter method here. This was done primarily
 * to catch edge cases like the Platypus or Emu.
 * @author Matthew Pilon
 */
public abstract class Animal implements Specifics, Population {
    //Class vars
    protected String kingdom; //The type of animal (Mammal, Bird, etc.)
    protected int population; //Number of animals alive
    //Implement Specifics interface vars
    protected String birthType, propulsionType;
    //Implement Population interface var
    protected double annualGrowthRate;
    
    //Getters & Setters

    /**
     * Get the population population.
     * @return The population
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * Set the population population.
     * @param kingdom The new population value
     */
    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }
    
    //Implementation methods
    
    /**
     * Implementation of birthType() from the Specifics interface
     * Returns how the animal is born.
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
        
        //Now multiply the population population by the compounded growth rate.
        //Round to the nearest whole animal, of course.
        return (int) Math.round((double) this.population * compoundedGrowthRate);
    }
}
