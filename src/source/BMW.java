
package source;

/**
 *
 * @author andre
 * 
 * BMW -------  Concrete product class
 */
public class BMW extends Car {
    
    @Override
    public Parts getWheels() {
        return new Parts("BMW Wheels");
    }
    
    @Override
    public Parts getMirrors() {
        return new Parts("BMW Mirrors");
    }
    
    @Override
    public Parts getEngine() {
        return new Parts("BMW Engine");
    }
    
    @Override
    public Parts getBody() {
        return new Parts("BMW Body");
    }
}
