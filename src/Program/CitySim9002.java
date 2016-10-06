/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Domain.Location;
import Domain.TourGenerater;
import Domain.VisitorGenerater;
import Domain.Validator;
import Domain.Visitor;
import java.util.ArrayList;
import java.util.List;
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
        
        //Generate five visitors
        VisitorGenerater visitors = new VisitorGenerater();
        List<String> visitorlist = visitors.generateVisitors(random);        
        
        //Display information of visitors one by one
        for (int i = 1; i <= visitorlist.size(); i++) {
            String type = visitorlist.get(i - 1);
            System.out.println("Visitor " + i + " is a " + type + ".");
            
            //Gnerate locations of the tour
            Visitor visitor = new Visitor();
            visitor.setType(type);
            TourGenerater tour = new TourGenerater();
            List<String> printlist = tour.generateTour(random,i,visitor);
            for(int j = 0;j < printlist.size();j++){
                System.out.println(printlist.get(j));
            } 
            System.out.println("***");
        }
        
    }
}
