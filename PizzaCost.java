 /* Created by Jenny Trac
Created on Oct 16 2017
Lets user choose size and number of toppings and will calculate the cost */

import java.util.Scanner;

public class PizzaCost {
  
    public static void main(String[] args)
    {
    // variables
    final double HST = 0.13;
    final double LARGE = 6.00;
    final double EXTRA_LARGE = 10.00;
    final double COST_PER_TOPPING = 0.75;
    final double CHEESE = 0.25;
    double size = 0.0;

    
    // instructions for size
    System.out.println("Choose a size for pizza: 1 for large or 2 for extra large");
    
    // input
    Scanner problem = new Scanner(System.in);
        int input_size = (problem.nextInt());
        
        // instructions for toppings
        System.out.println("Choose up to 4 toppings:");
        int toppings = (problem.nextInt());
        
        // process
        if ((toppings > 4) || (toppings < 0))
            {
            System.out.println("Not an option for toppings");
            }
        else
            {
            if ((input_size == 1) || (input_size == 2))
                {
                if (input_size == 1)
                    {
                    size = LARGE;
                    }
                else if (input_size == 2)
                    {
                    size = EXTRA_LARGE;
                    }
                
                double subtotal = size + (toppings * COST_PER_TOPPING) + CHEESE;
                double hst = subtotal * HST;
                double total = subtotal + hst;
                
                // output
                System.out.println("Subtotal = " + String.format("$%,.2f", subtotal));
                System.out.println("HST = " + String.format("$%,.2f", hst));
                System.out.println("Total = " + String.format("$%,.2f", total));
                }
            else if ((input_size != 1) && (input_size != 2))
                {
                System.out.println("Not a size option");
                }
            }
    }

}
