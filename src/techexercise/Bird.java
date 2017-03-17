package techexercise;

/**
 * A subclass of Animal, Birds are warm-blooded vertebrates covered in feathers
 * @author Matthew Pilon
 */
public class Bird extends Animal {
    
    //Constructors
    
    /**
     * Default constructor for the Bird class
     * Default values:
     * birthType: "Egg Birth"
     * propulsionType: "Wings"
     * population: 100000
     * annualGrowthRate: 0.02 (2%)
     */
    public Bird() {
        this.kingdom = "Bird";
        this.birthType = "Egg Birth";
        this.propulsionType = "Wings";
        this.population = 100000;
        this.annualGrowthRate = 0.02;
    }
    
    /**
     * Constructor for the typical Bird i.e. one that lays eggs and
     * uses its wings for locomotion
     * @param population integer describing the number of animals alive
     * @param annualGrowthRate double describing the growth rate of the population
     */
    public Bird(int population, double annualGrowthRate) {
        this.kingdom = "Bird";
        this.birthType = "Lays Eggs";
        this.propulsionType = "Wings";
        this.population = population;
        this.annualGrowthRate = annualGrowthRate;
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
        this.kingdom = "Bird";
        this.birthType = birthType;
        this.propulsionType = propulsionType;
        this.population = kingdom;
        this.annualGrowthRate = annualGrowthRate;
    }
    
}
