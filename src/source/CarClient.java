
package source;

/**
 *
 * @author andre
 */
public class CarClient {
    
    public static void main(String[] args) {
        
        CarType type = new CarType();   //Create new Factory
        Car car = type.getCar("BMW");
        
        System.out.println("Wheels: " + car.getWheels().getSpecification() );
        System.out.println("Mirrors: " + car.getMirrors().getSpecification());
        System.out.println("Engine: " + car.getEngine().getSpecification());
        System.out.println("Body: " + car.getBody().getSpecification());
    }
    
}
