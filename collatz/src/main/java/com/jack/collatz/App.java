package com.jack.collatz;
import java.math.BigInteger; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BigInteger iteration = BigInteger.TWO; 
        BigInteger highest = BigInteger.TWO; 
        BigInteger stopPoint = BigInteger.TEN.pow(7);

        BigInteger three = BigInteger.ONE.add(BigInteger.TWO); 

        System.out.println("Starting"); 
        System.out.println("StopPoint: " + stopPoint.toString()); 
        System.out.println("Iteration: " + iteration.toString()); 
        System.out.println("iteration.max(stopPoint): " + iteration.max(stopPoint)); 

        while (iteration.max(stopPoint).equals(stopPoint)) {

            System.out.println("Looping"); 

            BigInteger result = BigInteger.ZERO.add(iteration); 

            while (result.max(iteration).equals(result)) {
                // if highest
                if (result.max(highest).equals(result)) {
                    highest = result.add(BigInteger.ZERO); 
                }
                // if even
                if (result.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                    result = result.multiply(three); 
                    result = result.add(BigInteger.ONE);   
                } 
                // if odd
                else {
                    result = result.divide(BigInteger.TWO); 
                }

            }

            iteration = iteration.add(BigInteger.ONE); 

        } 

        System.out.println("Finished with highest: " + highest.toString()); 
    }
}
