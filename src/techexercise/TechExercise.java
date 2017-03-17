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
        // TODO code application logic here
        Animal dog = new Mammal(100000, 0.04); //Initialize a new Mammal
        Animal blueJay = new Bird(100000, 0.02); //Initialize a new Bird
        System.out.println(dog.getKingdom() + ", " +
                dog.propulsionType() + ", " + 
                dog.birthType() + ", " +
                "5 Years: " + dog.populationAfterYears(5));
        System.out.println(blueJay.getKingdom() + ", " +
                blueJay.propulsionType() + ", " + 
                blueJay.birthType() + ", " +
                "5 Years: " + blueJay.populationAfterYears(5));
    }
    
}
