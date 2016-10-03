/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Domain.Location;
import Domain.Validator;
import Domain.Visitor;
import java.util.Random;

/**
 *
 * @author AsphaltPanthers
 */
public class CitySim9002 {
    public static String errorMessage = "Please enter one integer argument, seed";
    public static void main(String[] args) {
        int seed = 0;
        if (new Validator().validateArguments(args)) {
            seed = Integer.parseInt(args[0]);
            System.out.println("Welcome to CitySim! Your seed is " + seed);	
        }
        else {
            System.out.println(errorMessage);
            System.exit(0);
        }
        Random random = new Random(seed);
        for (int i = 1; i < 6; i++) {
            Visitor visitor = new Visitor();
            Location location = new Location();
            String type = visitor.getType(random);
            System.out.println("Visitor " + i + " is a " + type + ".");
            int count = 1;
            String newloc;
            do{
            	newloc = location.getLocation(random, count);			
            	System.out.println("Visitor " + i + " is going to " + newloc + "!");
            	if(visitor.likeLocation(type, newloc)) {
            		System.out.println("Visitor " + i + " did like " + newloc + ".");
            	} else {
            		System.out.println("Visitor " + i + " did not like " + newloc + ".");
            	}
            	count++;                      	
            }                       							
            while (newloc != "Leaving");
			
            System.out.println("Visitor " + i + " has left the city. ");
            System.out.println("***");
        }
        
    }
}
