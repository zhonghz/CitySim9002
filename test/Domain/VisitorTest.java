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
public class VisitorTest {
    //Given a random number between 0-3 as input parameter to get a visitor type
    //Stub the nextint() method to set the random number as 3
    //As the id of "Blogger" is 3, the two strings should equal
    @Test
    public void ifVisitorTypeIsOneOfTheFourType() {
        Random mockRandom = mock(Random.class);        
        when(mockRandom.nextInt(4)).thenReturn(3);
        Visitor visitor = new Visitor();
        Assert.assertEquals("Blogger",visitor.getType(mockRandom));
    }
    
    //Check to verify Business Person likes Downtown
    @Test
    public void ifVisitorLikeTheLocationAssertTrue() {
        Random mockRandom = mock(Random.class);
        Visitor visitor = new Visitor();        
        Assert.assertTrue(visitor.likeLocation("Business Person","Downtown"));
    }
    
    //Check to verify Professor likes The Point
    @Test
    public void ifProfessorLikeTheLocationAssertTrue() {
        Random mockRandom = mock(Random.class);
        Visitor visitor = new Visitor();        
        Assert.assertFalse(visitor.likeLocation("Professor","The Point"));
    }
    
    //Check to verify Blogger didn't like the Squirrel Hill
    @Test
    public void ifBloggerDislikeTheLocationAssertFalse() {
        Random mockRandom = mock(Random.class);
        Visitor visitor = new Visitor();        
        Assert.assertTrue(visitor.likeLocation("Blogger","Downtown"));
    }
    
    //Check to verify Student doesn't likes The Cathedral of Learning
    @Test
    public void ifVisitorDislikeTheLocationAssertFalse() {
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock(Visitor.class);
        Location mockLocation = mock(Location.class);
        when(mockVisitor.getType(mockRandom)).thenReturn("Student");
        when(mockLocation.getLocation(mockRandom, 1)).thenReturn("The Cathedral of Learning");
        Assert.assertFalse(mockVisitor.likeLocation("Student", mockLocation.getLocation(mockRandom, 1)));
    }
    
}
