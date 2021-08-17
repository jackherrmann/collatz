package com.jack.collatz;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        long startTime = System.currentTimeMillis(); 

        System.out.println(args[0]); 
        int maxPow = Integer.parseInt(args[0]); 

        int iteration = 2; 
        int highest = 2; 
        int stopPoint = (int) Math.pow(10, maxPow);

        int three = 3; 

        System.out.println("Starting app2 with max 10^" + args[0]); 

        while (iteration <= stopPoint) {

            int result = iteration; 

            while (result >= iteration) {
                // if highest
                if (result > highest) {
                    highest = result; 
                }
                // if even
                if (result % 2 == 1) {
                    result = result * 3; 
                    result++;   
                } 
                // if odd
                else {
                    result = result / 2; 
                }

            }
            iteration++; 
        } 

        System.out.println("Finished with highest: " + highest.toString()); 
        long endTime = System.currentTimeMillis(); 
        long totalTime = (endTime - startTime); 
        System.out.println("Time: " + totalTime); 
    }
}

