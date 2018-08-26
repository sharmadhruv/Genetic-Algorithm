/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info6205.finalProject.geneticAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Mayank Gangrade and Dhruv Sharma
 */
public class RandomGeneration_GA {

    public static String stringToBinary(String text) {
        String bString = "";
        String temp = "";
        for (int i = 0; i < text.length(); i++) {
            temp = Integer.toBinaryString(text.charAt(i));
            for (int j = temp.length(); j < 8; j++) {
                temp = "0" + temp;
            }
            //bString += temp + " ";
            bString += temp;
        }

        System.out.println(bString);
        return bString;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        int[] result = new int[5];
        
        result = ParallelProcess.parallel("mayank");
        
        Arrays.sort(result);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println("Thread: " + (i+1) + " Solution found in genertion: "+ result[i]);
        }
        
        System.out.println("***************************************************************");
        System.out.println("Minimum generation count to produce desired result : " + result[0]);
        System.out.println("***************************************************************");

//        // Set a input
//        String input = "mayank";
//        
//        // Set length for solution
//        FitnessCalc.setLength(input.length());
//        
//        // Set gene length
//        Individual.setDefaultGeneLength(input.length() * 8);
//        
//        // Set a candidate solution
//        FitnessCalc.setSolution(stringToBinary(input));
//
//        // Create an initial population
//        Population myPop = new Population(500, true);
//
//        // Evolve our population until we reach an optimum solution
//        int generationCount = 0;
//        while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
//            generationCount++;
//            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest().getFitness());
//            myPop = Algorithm.evolvePopulation(myPop);
//        }
//        System.out.println("Solution found!");
//        System.out.println("Generation: " + generationCount);
//        System.out.println("Genes:");
//        System.out.println(myPop.getFittest());

    }
}
