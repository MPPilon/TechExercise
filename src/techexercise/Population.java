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
public interface Population {
    //Each animal must have a growth rate
    double annualGrowthRate();
    //Must also be able to calculate population after a number of years
    int populationAfterYears(int years);
}
