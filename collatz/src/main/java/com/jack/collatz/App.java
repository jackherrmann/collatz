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
        long startTime = System.currentTimeMillis(); 

        System.out.println(args[0]); 
        int maxPow = Integer.parseInt(args[0]); 

        BigInteger iteration = BigInteger.TWO; 
        BigInteger highest = BigInteger.TWO; 
        BigInteger stopPoint = BigInteger.TEN.pow(maxPow);

        BigInteger three = BigInteger.ONE.add(BigInteger.TWO); 

        System.out.println("Starting app1 with max 10^" + args[0]); 

        while (iteration.max(stopPoint).equals(stopPoint)) {

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
        System.out.println("2^64=" + BigInteger.TWO.pow(64).toString()); 
        long endTime = System.currentTimeMillis(); 
        long totalTime = (endTime - startTime); 
        System.out.println("Time: " + totalTime); 
    }
}
