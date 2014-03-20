
package source;

/**
 *
 * @author andre
 * 
 * GeneralMotors -------  Concrete product class
 */
public class GeneralMotors extends Car {
    
    @Override
    public Parts getWheels() {
        return new Parts("GeneralMotors Wheels");
    }
    
    @Override
    public Parts getMirrors() {
        return new Parts("GeneralMotors Mirrors");
    }
    
    @Override
    public Parts getEngine() {
        return new Parts("GeneralMotors Engine");
    }
    
    @Override
    public Parts getBody() {
        return new Parts("GeneralMotors Body");
    }
}
