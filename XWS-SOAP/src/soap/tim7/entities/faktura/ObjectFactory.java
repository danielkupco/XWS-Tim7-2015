//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.22 at 02:30:23 PM CEST 
//


package soap.tim7.entities.faktura;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.tim7.faktura package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.tim7.faktura
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Faktura }
     * 
     */
    public Faktura createFaktura() {
        return new Faktura();
    }

    /**
     * Create an instance of {@link Faktura.Zaglavlje }
     * 
     */
    public Faktura.Zaglavlje createFakturaZaglavlje() {
        return new Faktura.Zaglavlje();
    }

    /**
     * Create an instance of {@link Stavka }
     * 
     */
    public Stavka createStavka() {
        return new Stavka();
    }

    /**
     * Create an instance of {@link TFirma }
     * 
     */
    public TFirma createTFirma() {
        return new TFirma();
    }

}