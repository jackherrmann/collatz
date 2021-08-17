package com.jack.collatz;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        int iteration = 2; 
        int highest = 2; 
        int stopPoint = 1000000;

        int three = 3; 

        System.out.println("Starting app2"); 

        while (iteration < stopPoint) {

            int result = iteration; 

            while (result < iteration) {
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
    }
}