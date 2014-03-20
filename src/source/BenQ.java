/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author andre
 * 
 * BenQ -------  Concrete product class
 */
public class BenQ extends Car {
    
    @Override
    public Parts getWheels() {
        return new Parts("BenQ Wheels");
    }
    
    @Override
    public Parts getMirrors() {
        return new Parts("BenQ Mirrors");
    }
    
    @Override
    public Parts getEngine() {
        return new Parts("BenQ Engine");
    }
    
    @Override
    public Parts getBody() {
        return new Parts("BenQ Body");
    }
}
