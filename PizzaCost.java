/* Created by Jenny Trac
Created on Oct 16 2017
Lets user choose size and number of toppings and will calculate the cost */

import java.util.Scanner;

public class PizzaCost {
  
    public static void main(String[] args)
    {
    // variables
    double HST = 0.13;
    double LARGE = 6.00;
    double EXTRA_LARGE = 10.00;
    double COST_PER_TOPPING = 0.75;
    double CHEESE = 0.25;

    
    // instructions for size
    System.out.println("Choose a size for pizza: 1 for large or 2 for extra large");
    
    // input
    Scanner problem = new Scanner(System.in);
        int input_size = (problem.nextInt());
        
        System.out.println("Choose up to 4 toppings:");
        int toppings = (problem.nextInt());
        
        // process
        
        if ((toppings > 4) || (toppings < 0))
            {
            System.out.println("Not an option for toppings");
            }
        else
            {
            if ((input_size != 1) && (input_size != 2))
                {
                System.out.println("Not a size option");
                }
            else if (input_size == 1)
                {
                double size = LARGE;
                double subtotal = size + (toppings * COST_PER_TOPPING) + CHEESE;
                double hst = subtotal * HST;
                double total = subtotal + hst;
                // output
                System.out.println("Subtotal = " + String.format("$%,.2f", subtotal));
                System.out.println("HST = " + String.format("$%,.2f", hst));
                System.out.println("Total = " + String.format("$%,.2f", total));
                }
            else if (input_size == 2)
                {
                double size = EXTRA_LARGE;
                double subtotal = size + (toppings * COST_PER_TOPPING) + CHEESE;
                double hst = subtotal * HST;
                double total = subtotal + hst;
                // output
                System.out.println("Subtotal = " + String.format("$%,.2f", subtotal));
                System.out.println("HST = " + String.format("$%,.2f", hst));
                System.out.println("Total = " + String.format("$%,.2f", total));
                }
            }
            // SIR IM SORRY THAT I REPEATED CODE BUT THERE WAS NO OTHER WAY I COULD FIND
            // THE PROGRAM WOULDNT LET ME DEFINE VARIABLES IN AN IF STATEMENT LIKE PYTHONISTA WOULD
    }

}
