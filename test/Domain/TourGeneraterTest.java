/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.List;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Huizhi
 */
public class TourGeneraterTest {
    
    //could store string of visit location information
    @Test
    public void ifRetunedListStoreLocationInfo() {
        Random mockRandom = mock(Random.class);
        TourGenerater tour = new TourGenerater();
        List<String> printlist = tour.generateTour(mockRandom,1, "Student");
        Assert.assertEquals("Visitor 1 is going to Downtown !",printlist.get(printlist.size()-1));
    }

    //could store string of like or dislike information 
    @Test
    public void ifReturnedListStoreLikeInfo() {
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock(Visitor.class);
        TourGenerater tour = new TourGenerater();
        List<String> printlist = tour.generateTour(mockRandom,1, "Student");
        int id =1;
        String newloc = "Downtown";
        //when(mockVisitor.likeLocation("Student", "Downtown")).thenReturn(true);
        printlist.add("Visitor " + id + " did like " + newloc + ".");
        Assert.assertEquals("Visitor 1 did like Downtown.",printlist.get(0));
    }
    
    @Test
    public void ifReturnedListStoreDislikeInfo() {
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock(Visitor.class);
        TourGenerater tour = new TourGenerater();
        List<String> printlist = tour.generateTour(mockRandom,1, "Student");
        int id =1;
        String newloc = "Downtown";
        //when(mockVisitor.likeLocation("Student", "Downtown")).thenReturn(true);
        printlist.add("Visitor " + id + " did like " + newloc + ".");
        Assert.assertEquals("Visitor 1 did not like The Cathedral of Learning.",printlist.get(0));
    }
        
    //When visitor has left the city which means stop of the method
    //The last element of returned list should be "Visitor * has left the city."
    @Test
    public void ifVisitorCanLeaveTheCity() {
        Random mockRandom = mock(Random.class);
        //Location mockLocation = mock(Location.class);
        //Visitor mockVisitor = mock(Visitor.class);
        TourGenerater tour = new TourGenerater();
        List<String> printlist = tour.generateTour(mockRandom,1, "Student");        
        Assert.assertEquals("Visitor 1 has left the city.",printlist.get(printlist.size()-1));
    }
    
    
    
    
    
    
    
}
