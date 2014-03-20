
package source;

/**
 * @author andre
 * 
 *Car ----- ABSTRACT CLASS -  The Abstract Product of the Abstract Factory Pattern
 * 
 * Makes use of the mix-in class Parts.
 */


public abstract class Car {
    
    public abstract Parts getWheels();
    public abstract Parts getMirrors();
    public abstract Parts getEngine();
    public abstract Parts getBody();
}
