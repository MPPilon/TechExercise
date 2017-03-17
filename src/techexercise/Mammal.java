package techexercise;

/**
 * A subclass of Animal, Mammals are warm-blooded vertebrates with hair or fur
 * The instructions called for this class to implement the interfaces. However,
 * I felt that the interfaces didn't capture edge cases such as the platypus
 * or the echidna, both of which are mammals that lay eggs. The interfaces are 
 * implemented by the Animal superclass instead.
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
     * Partial constructor for the typical mammal i.e. one that gives live 
     * birth and uses its legs for locomotion
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
     * @param birthType String describing the type of birth (some mammals
     *  lay eggs instead of a live birth)
     * @param propulsionType String describing method of locomotion
     * @param population integer describing the number of animals alive
     * @param annualGrowthRate double describing the growth rate of the population
     */
    public Mammal(String birthType, String propulsionType, 
            int population, double annualGrowthRate) {
        this.kingdom = "Mammal";
        this.birthType = birthType;
        this.propulsionType = propulsionType;
        this.population = population;
        this.annualGrowthRate = annualGrowthRate;
    }
    
    
    
}
