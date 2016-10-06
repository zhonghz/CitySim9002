/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Huizhi
 */
public class TourGenerater {
    //Generate list of tour information
    public List<String> generateTour(Random random, int id, Visitor visitor){
        Visitor newvisitor = visitor;
        
        Location location = new Location();       
        List<String> printlist = new ArrayList<String>(); 
        String newloc;
        int count = 1;
        newloc = location.getLocation(random, count);
        do{           		
            printlist.add("Visitor " + id + " is going to " + newloc + "!");
            if(visitor.likeLocation(newvisitor.getType(), newloc)) {
                printlist.add("Visitor " + id + " did like " + newloc + ".");
            } else {
                printlist.add("Visitor " + id + " did not like " + newloc + ".");
            }
            count++;
            newloc = location.getLocation(random, count);	
        }                       							
        while (newloc != "Leaving");
        
        printlist.add("Visitor " + id + " has left the city.");
        return printlist;
    }
    
}
