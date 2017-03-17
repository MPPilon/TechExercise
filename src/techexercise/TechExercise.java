package techexercise;

/**
 * Main program execution
 * @author Matthew Pilon
 */
public class TechExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize some testing animals
        
        //Dogs are normal mammals
        Animal dog = new Mammal(100000, 0.04);
        //The platypus is a mammal that lays eggs
        Animal platypus = new Mammal("Lays Eggs", "Legs", 100000, 0.01);
        
        //The blue jay is a normal bird
        Animal blueJay = new Bird(100000, 0.02);
        //The ostritch is a flightless bird, using its legs for locomotion
        Animal ostrich = new Bird("Lays Eggs", "Legs", 100000, 0.03);
        
        //Test results
        
        System.out.println("Dog:");
        //Should print "Mammal, Legs, Live Birth, 5 Years: 121665"
        System.out.println(dog.getKingdom() + ", " +
                dog.propulsionType() + ", " + 
                dog.birthType() + ", " +
                "5 Years: " + dog.populationAfterYears(5));
        
        System.out.println("Platypus:");
        //Should print "Mammal, Legs, Lays Eggs, 5 Years: 105101"
        System.out.println(platypus.getKingdom() + ", " +
                platypus.propulsionType() + ", " + 
                platypus.birthType() + ", " +
                "5 Years: " + platypus.populationAfterYears(5));
        
        System.out.println("Blue Jay:");
        //Should print "Bird, Wings, Lays Eggs, 5 Years: 110408"
        System.out.println(blueJay.getKingdom() + ", " +
                blueJay.propulsionType() + ", " + 
                blueJay.birthType() + ", " +
                "5 Years: " + blueJay.populationAfterYears(5));
        
        System.out.println("Ostrich:");
        //Should print "Bird, Legs, Lays Eggs, 5 Years: 115927"
        System.out.println(ostrich.getKingdom() + ", " +
                ostrich.propulsionType() + ", " + 
                ostrich.birthType() + ", " +
                "5 Years: " + ostrich.populationAfterYears(5));
    }
    
}
