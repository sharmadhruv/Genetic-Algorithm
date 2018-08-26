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
public class PopulationTest {

    /**
     * Test of getFittest method, of class Population.
     */
    @Test
    public void testGetFittest() {
        System.out.println("getFittest");
        Population instance = new Population(2, true);
        Individual expResult = null;
        Individual result = instance.getFittest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
