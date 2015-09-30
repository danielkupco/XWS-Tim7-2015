package soap.tim7.services.banka;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

import soap.tim7.entities.faktura.Faktura;
import soap.tim7.entities.globals.MT9XXType;
import soap.tim7.entities.globals.StatusType;
import soap.tim7.entities.mt102.MT102Type;
import soap.tim7.entities.mt103.MT103Type;
import soap.tim7.entities.nalogzaplacanje.NalogZaPlacanjeType;
import soap.tim7.entities.presek.PresekType;
import soap.tim7.entities.zahtevzaizvod.ZahtevZaIzvodType;
	
/**
 * This class was generated by Apache CXF 2.6.5 2015-08-22T23:27:53.155+02:00
 * Generated source version: 2.6.5
 * 
 */
public final class Banka_BankaPort_Client {

	private static Logger log = Logger.getLogger(Banka_BankaPort_Client.class);
	
	private static final QName SERVICE_NAME = new QName(
			"http://xws/tim7/banka", "BankaService");
	private String wsdlPart = "http://localhost:8080/xws-soap/BankaService?wsdl";
	private String racun;

	public Banka_BankaPort_Client(String racun) {
		this.racun = racun;			// racun kupca, preko njega odredjujemo banku
		log.info("Banka klijent je kreiran za racun: " + racun);
	}

	private Banka getService() {
		Banka port = null;
		try {
			// URL wsdlURL = new URL(String.format(wsdlPart, racun.substring(0, 3)));
			URL wsdlURL = new URL(wsdlPart);
			BankaService ss = new BankaService(wsdlURL, SERVICE_NAME);
			port = ss.getBankaPort();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return port;
	}
	
	public StatusType posaljiNalogZaPlacanje(Faktura faktura) {
		Banka banka = this.getService();		
		soap.tim7.entities.nalogzaplacanje.ObjectFactory factory =  new soap.tim7.entities.nalogzaplacanje.ObjectFactory();
		NalogZaPlacanjeType nzp = factory.createNalogZaPlacanjeType(faktura, racun);
		log.info("BANKA CLIENT: --> salje se nalog za placanje sa ID poruke: " + nzp.getIDPoruke());
		return banka.primiNalogZaPlacanje(nzp);
	}

	public PresekType primiZahtevZaIzvod(XMLGregorianCalendar date, int redniBroj) {
		soap.tim7.entities.zahtevzaizvod.ObjectFactory factory = new soap.tim7.entities.zahtevzaizvod.ObjectFactory();
		ZahtevZaIzvodType zahtevZaIzvod = factory.createZahtevZaIzvodType(racun, date, redniBroj);
		Banka banka = this.getService();
		PresekType retVal = null;
		try {
			retVal = banka.primiZahtevZaIzvod(zahtevZaIzvod);
		} catch (StatusMessage e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	
	/* KORISTI SAMO CENTRALNA BANKA -- delegira Implementaciji */
	
	public StatusType primiMT900(MT9XXType mt900) {
		Banka banka = this.getService();
		return banka.primiMT900(mt900);
	}
	
	public StatusType primiMT910(MT9XXType mt910) {
		Banka banka = this.getService();
		return banka.primiMT910(mt910);
	}
	
	public StatusType primiMT103(MT103Type mt103) {
		Banka banka = this.getService();
		return banka.primiMT103(mt103);
	}
	
	public StatusType primiMT102(MT102Type mt102) {
		Banka banka = this.getService();
		return banka.primiMT102(mt102);
	}
}
