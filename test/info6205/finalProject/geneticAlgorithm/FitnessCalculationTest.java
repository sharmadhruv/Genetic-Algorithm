/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info6205.finalProject.geneticAlgorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mayank
 */
public class FitnessCalculationTest {
    /**
     * Test of getFitness method, of class FitnessCalculation.
     */
    @Test
    public void testGetFitness() {
        System.out.println("getFitness");
        Individual individual = null;
        int expResult = 0;
        int result = FitnessCalculation.getFitness(individual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxFitness method, of class FitnessCalculation.
     */
    @Test
    public void testGetMaxFitness() {
        System.out.println("getMaxFitness");
        int expResult = 0;
        int result = FitnessCalculation.getMaxFitness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
