package lommeregner;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class LommeregnerTest {
    
    Lommeregner lommeregner; 
    
    @Before 
    public void setup() {
        lommeregner = new Lommeregner();
    }
    
    @Test
    public void sumSmåTalTest() throws UgyldigtInputException {
        //Arrange
        //Lommeregner lommeregner = new Lommeregner();
        int expected = 9; 
        
        //Act
        int actual = lommeregner.sum(5,4);
        
        //Assert
        assertEquals(expected, actual);
    }
   
  
    @Test
    public void sumStoreTalTest() throws UgyldigtInputException {
        //Arrange
        //Lommeregner lommeregner = new Lommeregner();
        int expected = 9000; 
        
        //Act
        int actual = lommeregner.sum(5000,4000);
        
        //Assert
        assertEquals(expected, actual);
    }
    
    @Test (expected = UgyldigtInputException.class)
    public void sumNegativeTalTest() throws UgyldigtInputException {
        //Act
        lommeregner.sum(-5, -4);
        
        
        
    }
}
