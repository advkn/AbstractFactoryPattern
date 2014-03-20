/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class CarTypeTest {
    
    public CarTypeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCar method, of class CarType.
     */
    @Test
    public void testGetCar() {
        System.out.println("CarType Factory test");
        String carType = "BMW";     //Evaluation string
        CarType type = new CarType();       //Abstract factory creation
        Car car = type.getCar(carType);       //Creation of concrete product from factory
        
        String expResult = "BMW Engine";    //Expected result
        String carSpec = car.getEngine().getSpecification();        //String representation of product returned from factory.
        
        
        assertEquals(expResult, carSpec);       //Test assertion
        
        //Output for human evaluation
        System.out.println("Expected Result: " + expResult);
        System.out.println("Actual Result: " + carSpec);
        
    }
}
