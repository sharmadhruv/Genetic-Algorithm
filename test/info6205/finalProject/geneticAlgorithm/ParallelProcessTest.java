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
public class ParallelProcessTest {
    /**
     * Test of parallel method, of class ParallelProcess.
     */
    @Test
    public void testParallel() throws Exception {
        System.out.println("parallel");
        String input = "mayank";
        int[] expResult = null;
        int[] result = ParallelProcess.parallel(input);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
