
package soap.tim7.entities.zahtevzaizvod;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.tim7.zahtevzaizvod package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.tim7.zahtevzaizvod
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrimiZahtevZaIzvod }
     * 
     */
    public PrimiZahtevZaIzvod createPrimiZahtevZaIzvod() {
        return new PrimiZahtevZaIzvod();
    }

    /**
     * Create an instance of {@link ZahtevZaIzvodType }
     * 
     */
    public ZahtevZaIzvodType createZahtevZaIzvodType() {
        return new ZahtevZaIzvodType();
    }

	public ZahtevZaIzvodType createZahtevZaIzvodType(String racun,
			XMLGregorianCalendar date, int redniBroj) {
		ZahtevZaIzvodType retVal = new ZahtevZaIzvodType();
		retVal.setBrojRacuna(racun);
		retVal.setDatum(date);
		retVal.setRedniBrojPreseka(new BigInteger(String.valueOf(redniBroj)));
		return retVal;
	}

}
