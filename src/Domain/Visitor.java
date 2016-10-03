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
public class Visitor {
    //Generate a visitor type of visitor
    public String getType(Random random) {
        String[] type = new String[4];
        type[0] = "Student";
	type[1] = "Professor";
	type[2] = "Business Person";
	type[3] = "Blogger";
	int num = random.nextInt(4);
	return type[num];
    }
    
    //Identify whether the visitor like the location or not
    public boolean likeLocation(String type, String location) {
        if (type == "Student") {
            if (location == "The Cathedral of Learning") {
                return false;
            } else {
                return true;
            }
        } else if (type == "Professor") {
            return true;		
        } else if (type == "Business Person") {
            if (location == "Squirrel Hill" || location == "Downtown") {
                return true;
            } else {
                return false;
            }						
        } else {
            return false;
        }		
    }
    
}
