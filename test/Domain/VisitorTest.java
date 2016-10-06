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
    //Test getType(Random random) method
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
    
    //Test getType() method
    //Given type field as "Student"
    //The returned string should equal to given type 
    @Test
    public void ifGetTypeMethodCanGetReturnTypeAttribute() {
        Visitor visitor = new Visitor();
        visitor.type = "Student";
        Assert.assertEquals("Student",visitor.getType());
    }
    
    //Test if likeLocation method works for Business Person
    //Check to verify Business Person likes Downtown
    @Test
    public void ifBusinessPersonLikeTheLocationAssertTrue() {
        Visitor visitor = new Visitor();
        visitor.type = "Business Person";        
        Assert.assertTrue(visitor.likeLocation("Business Person","Downtown"));
    }
    
    //Test if likeLocation method works for Professor
    //Check to verify Professor likes The Point
    @Test
    public void ifProfessorLikeTheLocationAssertTrue() {
        Visitor visitor = new Visitor();
        visitor.type = "Professor";        
        Assert.assertTrue(visitor.likeLocation("Professor","The Point"));
    }
    
    //Test if likeLocation method works for Blogger
    //Check to verify Blogger didn't like the Squirrel Hill
    @Test
    public void ifBloggerDislikeTheLocationAssertFalse() {
        Visitor visitor = new Visitor();
        visitor.type = "Blogger";           
        Assert.assertFalse(visitor.likeLocation("Blogger","Downtown"));
    }
    
    //Test if likeLocation method works for Student
    //Check to verify Student doesn't likes The Cathedral of Learning
    @Test
    public void ifVisitorDislikeTheLocationAssertFalse() {
        Visitor visitor = new Visitor();
        visitor.type = "Student"; 
        Assert.assertFalse(visitor.likeLocation("Student","The Cathedral of Learning"));
    }
    
}
