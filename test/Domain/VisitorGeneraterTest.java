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

public class VisitorGeneraterTest {
    //generateVisitors should generate five visitors
    //The size of returned list should be five.
    @Test
    public void ifSizeOfReturnedListEqualsFive() {
        VisitorGenerater visitors = new VisitorGenerater();
        Random mockRandom = mock(Random.class);   
        Assert.assertEquals(5,visitors.generateVisitors(mockRandom).size());
    }
    
    //generateVisitors should generate five visitors and stpr type of each generated visitor into the returned list.
    //The string in the returned list should be the type of visitor.
    @Test
    public void ifReturnListStoresTypeName() {
        VisitorGenerater visitors = new VisitorGenerater();
        Visitor mockVisitor = mock(Visitor.class);
        Random mockRandom = mock(Random.class);  
        when(mockVisitor.getType(mockRandom)).thenReturn("Student");        
        Assert.assertEquals("Student",visitors.generateVisitors(mockRandom).get(0));
    }
    
    
    
    
}
