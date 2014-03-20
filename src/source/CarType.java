
package source;

/**
 *
 * @author andre
 * 
 * CarType ------  Abstract Factory.  Contains the logic that takes an Abstract Factory and
 * uses it to create the necessary concrete factories.
 */
public class CarType {
    
    /*You will need to create a new Car variable because that is what the factory logic (getCar())
     * will be returning to the client.
     */
    private Car car;
    
    //Main factory logic.  Accepts a String for evaluation.  
    //Return type:  a concrete product that implements the abstract Car class.
    public Car getCar(String carType) {
        
        if(carType.equals("BenQ")) {
            car = new BenQ();
        }
        else if(carType.equals("BMW")) {
            car = new BMW();
        }
        else if(carType.equals("GeneralMotors")) {
            car = new GeneralMotors();
        }
        
        return car;
    }
    
}
