
package soap.tim7.entities.mt103;

import javax.xml.bind.annotation.XmlRegistry;

import soap.tim7.entities.nalogzaplacanje.NalogZaPlacanjeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.tim7.mt103 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.tim7.mt103
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrimiMT103 }
     * 
     */
    public PrimiMT103 createPrimiMT103() {
        return new PrimiMT103();
    }

    /**
     * Create an instance of {@link MT103Type }
     * 
     */
    public MT103Type createMT103Type() {
        return new MT103Type();
    }

	public MT103Type createMT103Type(NalogZaPlacanjeType nzp) {
		MT103Type retVal = new MT103Type();
		retVal.setDatumNaloga(nzp.getDatumNaloga());
		retVal.setDatumValute(nzp.getDatumValute());
		retVal.setIDPoruke(nzp.getIDPoruke());
		
		retVal.setObracunskiRacunBankeDuznika(null);
		retVal.setObracunskiRacunBankePoverioca(null);
		
		retVal.setOsnovaNalogaZaPlacanje(nzp.getOsnovaNalogaZaPlacanje());
		retVal.setSifraValute(nzp.getOznakaValute());
		
		retVal.setSWIFTKodBankeDuznika("");
		retVal.setSWIFTKodBankePoverioca("");
		
		return retVal;
	}

}
