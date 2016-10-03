/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Random;

/**
 *
 * @author Huizhi
 */
public class Location {
    //Genrate a location for visitor 
    public String getLocation(Random random, int count) {
        String[] loc = new String[5];
	loc[0] = "The Cathedral of Learning";
	loc[1] = "Squirrel Hill";
	loc[2] = "The Point";
	loc[3] = "Downtown";
	loc[4] = "Leaving";
        //For the first visit for a given Visitor, the Visitor cannot leave the City.
        if (count == 1) {
            int num = random.nextInt(4);
            return loc[num];
        } else{
            int num = random.nextInt(5);
            return loc[num];
        }
	
    }
}
