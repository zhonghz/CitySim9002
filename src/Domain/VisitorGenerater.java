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
//Generate list of five visitors
public class VisitorGenerater {
    public List<String> generateVisitors(Random random) {
        List<String> visitorlist = new ArrayList<String>();
        for (int i = 1; i <= 5; i++) {
            Visitor visitor = new Visitor();
            String type = visitor.getType(random);
            visitorlist.add(type);
        }
        return visitorlist;               
    }
    
}
