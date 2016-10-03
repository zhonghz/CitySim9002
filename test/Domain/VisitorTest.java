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
    
    @Test
    public void ifOneOfFourType() {
        Random mockRandom = mock(Random.class);        
        when(mockRandom.nextInt(4)).thenReturn(3);
        Visitor visitor = new Visitor();
        Assert.assertNotSame("Teacher",visitor.getType(mockRandom));
    }
    
    @Test
    public void ifVisitorTypeIsOneOfTheFourType() {
        Random mockRandom = mock(Random.class);        
        when(mockRandom.nextInt(4)).thenReturn(3);
        Visitor visitor = new Visitor();
        Assert.assertEquals("Blogger",visitor.getType(mockRandom));
    }
    
    
    @Test
    public void ifVisitorLikeTheLocation() {
        Random mockRandom = mock(Random.class);
        Visitor visitor = new Visitor();        
        Assert.assertTrue(visitor.likeLocation("Business Person","Downtown"));
    }
    
    @Test
    public void ifVisitorDislikeTheLocation() {
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock(Visitor.class);
        Location mockLocation = mock(Location.class);
        when(mockVisitor.getType(mockRandom)).thenReturn("Sutdent");
        when(mockLocation.getLocation(mockRandom, 1)).thenReturn("The Cathedral of Learning");
        Assert.assertFalse(mockVisitor.likeLocation("Student", mockLocation.getLocation(mockRandom, 1)));
    }
    
}
