package techexercise;

/**
 * The interface to require an implementation of population factors
 * @author Matthew Pilon
 */
public interface Population {
    //Each animal must have a growth rate
    double annualGrowthRate();
    //Must also be able to calculate population after a number of years
    int populationAfterYears(int years);
}
