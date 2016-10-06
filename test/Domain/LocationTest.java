/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

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
public class LocationTest {
    
    //For the first visit, the visitor should visit one of the four locations
    //given iteration number 1 and input location id as 3,
    //returned value should equal to "Downtown"
    @Test
    public void firstVisitOneOfFour() {
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(4)).thenReturn(3);
        Location location = new Location();
        Assert.assertEquals("Downtown",location.getLocation(mockRandom, 1));
    }
    
    //For the first visit for a given visitor, the visitor cannot leave the city
    //When count is 1, which means it is in the first iteration
    //The location shall not be "Leaving"
    @Test
    public void canNotLeaveInFirstVisit() {
        Random mockRandom = mock(Random.class);
        Location location = new Location();
        Assert.assertFalse(location.getLocation(mockRandom,1).equals("Leaving"));
    }
    
    //After the first visit, the visitor can leave the city
    //When count is 3, which means it is in the third iteration
    //Location id is 4 should equal to "Leaving"
    @Test
    public void canLeaveCityAfterFirstVisit() {
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(5)).thenReturn(4);
        Location location = new Location();
        Assert.assertEquals("Leaving",location.getLocation(mockRandom, 3));
    }
     
    
}
