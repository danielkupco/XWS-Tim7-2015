
package xws.tim7.entities.globals;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xws.tim7.globals package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xws.tim7.globals
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnStatus }
     * 
     */
    public ReturnStatus createReturnStatus() {
        return new ReturnStatus();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link RacunType }
     * 
     */
    public RacunType createRacunType() {
        return new RacunType();
    }

    /**
     * Create an instance of {@link OsnovaNalogaZaPlacanjeType }
     * 
     */
    public OsnovaNalogaZaPlacanjeType createOsnovaNalogaZaPlacanjeType() {
        return new OsnovaNalogaZaPlacanjeType();
    }

    /**
     * Create an instance of {@link MT9XXType }
     * 
     */
    public MT9XXType createMT9XXType() {
        return new MT9XXType();
    }

}