package techexercise;

/**
 * A subclass of Animal, Mammals are warm-blooded vertebrates with hair or fur
 * @author Matthew Pilon
 */
public class Mammal extends Animal  {
    
    //Constructors
    
    /**
     * Default constructor for the Mammal class
     * Default values:
     * birthType: "Live Birth"
     * propulsionType: "Legs"
     * population: 100000
     * annualGrowthRate: 0.04 (4%)
     */
    public Mammal() {
        this.kingdom = "Mammal";
        this.birthType = "Live Birth";
        this.propulsionType = "Legs";
        this.population = 100000;
        this.annualGrowthRate = 0.04;
    }
    
    /**
     * Constructor for the typical mammal i.e. one that gives live birth and
     * uses its legs for locomotion
     * @param population integer describing the number of animals alive
     * @param annualGrowthRate double describing the growth rate of the population
     */
    public Mammal(int population, double annualGrowthRate) {
        this.kingdom = "Mammal";
        this.birthType = "Live Birth";
        this.propulsionType = "Legs";
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
    public Mammal(String birthType, String propulsionType, 
            int kingdom, double annualGrowthRate) {
        this.kingdom = "Mammal";
        this.birthType = birthType;
        this.propulsionType = propulsionType;
        this.population = kingdom;
        this.annualGrowthRate = annualGrowthRate;
    }
    
    
    
}
