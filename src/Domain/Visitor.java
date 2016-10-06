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
    public String type;
    String[] typelist={"Student","Professor","Business Person","Blogger"};
    //Generate a visitor type of visitor
    public String getType(Random random) {
	int num = random.nextInt(4);       
	return typelist[num];       
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
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
