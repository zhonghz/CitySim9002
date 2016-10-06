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
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Huizhi
 */
public class TourGeneraterTest {
    
    //Check if string of visit location information is added to returned string list
    //The location information should be the first element of returned string
    //mock random class and stub nextInt method to limit the teration times and set location value
    //The returned string will equal to the given left string
    @Test
    public void ifRetunedListStoreLocationInfo() {
        Random mockRandom = mock(Random.class);
        TourGenerater tour = new TourGenerater();
        Visitor mockVisitor = mock(Visitor.class);
        when(mockRandom.nextInt(any(int.class))).thenReturn(2).thenReturn(4);        
        List<String> printlist = tour.generateTour(mockRandom,3, mockVisitor);
        Assert.assertEquals("Visitor 3 is going to The Point!",printlist.get(0));
    }

    //Check if string of visitors' preference information(like location) is added to returned string list
    //mock random class and stub nextInt method to limit the teration times
    //Choose the location in the second loop to test
    //The returned string will equal to the given left string
    public void ifReturnedListStoreLikeInfo() {
        Random mockRandom = mock(Random.class);
        TourGenerater tour = new TourGenerater();
        Visitor mockVisitor = mock(Visitor.class);
        when(mockVisitor.getType()).thenReturn("Professor");
        when(mockRandom.nextInt(any(int.class))).thenReturn(1).thenReturn(3).thenReturn(1).thenReturn(4);
        List<String> printlist = tour.generateTour(mockRandom,1,mockVisitor);        
        Assert.assertEquals("Visitor 1 did like Downtown.",printlist.get(3));
    }
    
    //Check if string of visitors' preference information(dislike location) is added to returned string list
    //mock random class and stub nextInt method to limit the teration times
    //Choose the location in the first loop to test
    //The returned string will equal to the given left string
    @Test
    public void ifReturnedListStoreDislikeInfo() {
        Random mockRandom = mock(Random.class);
        TourGenerater tour = new TourGenerater();
        Visitor mockVisitor = mock(Visitor.class);
        when(mockVisitor.getType()).thenReturn("Student");
        when(mockRandom.nextInt(any(int.class))).thenReturn(0).thenReturn(1).thenReturn(4);
        List<String> printlist = tour.generateTour(mockRandom,2,mockVisitor);     
        Assert.assertEquals("Visitor 2 did not like The Cathedral of Learning.",printlist.get(1));
    }
        
    //When visitor has left the city which means stop of the method
    //For any type of visitor, the last element of returned list should be "Visitor * has left the city."
    //The returned string will equal to the given left string
    @Test
    public void ifVisitorCanLeaveTheCity() {
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock(Visitor.class);
        TourGenerater tour = new TourGenerater();
        when(mockRandom.nextInt(any(int.class))).thenReturn(0).thenReturn(1).thenReturn(4);
        List<String> printlist = tour.generateTour(mockRandom,1,mockVisitor);        
        Assert.assertEquals("Visitor 1 has left the city.",printlist.get(printlist.size()-1));
    }    
    
    
}
