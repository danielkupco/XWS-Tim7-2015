/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package xws.tim7.services.banka;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;

import sessionbeans.mt102.MT102DaoLocal;
import sessionbeans.mt103.MT103DaoLocal;
import sessionbeans.nalogzaplacanje.NalogZaPlacanjeDaoLocal;
import sessionbeans.racun_firme.RacunFirmeDaoLocal;
import xws.tim7.entities.globals.StatusType;
import xws.tim7.entities.mt102.MT102Type;
import xws.tim7.entities.mt103.MT103Type;
import xws.tim7.entities.nalogzaplacanje.NalogZaPlacanjeType;
import xws.tim7.entities.presek.PresekType;
import xws.tim7.services.cb.CentralnaBanka_CentralnaBankaPort_Client;

/**
 * This class was generated by Apache CXF 2.6.5 2015-08-22T23:27:53.404+02:00
 * Generated source version: 2.6.5
 * 
 */

@javax.jws.WebService(serviceName = "BankaService", portName = "BankaPort", targetNamespace = "http://xws/tim7/banka", wsdlLocation = "file:/home/danex/Documents/Eclipse_workspaces/XWS/XWS_test/WEB-INF/wsdl/banka.wsdl", endpointInterface = "xws.tim7.banka.Banka")
public class BankaImpl implements Banka {

	@EJB
	private RacunFirmeDaoLocal racuni;

	@EJB
	private MT102DaoLocal Mt102Clearing;	//CUVAMO ONE KOJI TREBA DA SE POSALJU... i primljene
	
	@EJB
	private MT103DaoLocal Mt103Rtgs;
	
	@EJB
	private NalogZaPlacanjeDaoLocal nalogZaPlacanjeDao;

	private static final Logger LOG = Logger.getLogger(BankaImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see xws.tim7.banka.Banka#obaviClearing(*
	 */
	public void obaviClearing() {
		LOG.info("Executing operation obaviClearing");
		try {
			// pokupi MT102 iz Dao, prosledi CB
			for (MT102Type mt102 : Mt102Clearing.findAll()) {
				CentralnaBanka_CentralnaBankaPort_Client client = new CentralnaBanka_CentralnaBankaPort_Client("");
				client.primiMT102(mt102);
			}
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xws.tim7.banka.Banka#primiNalogZaPlacanje(xws.tim7.nalogzaplacanje.
	 * NalogZaPlacanjeType nalogZaPlacanje )*
	 */
	public xws.tim7.entities.globals.StatusType primiNalogZaPlacanje(
			xws.tim7.entities.nalogzaplacanje.NalogZaPlacanjeType nalogZaPlacanje) {
		LOG.info("Executing operation primiNalogZaPlacanje");
		System.out.println(nalogZaPlacanje);

		try {
			// KAD PRIMI MT900 TRAZI U NALOZI ZA PLACANJE
			nalogZaPlacanjeDao.persist(nalogZaPlacanje);	//cuvaj sve naloge
			
			xws.tim7.entities.globals.StatusType _return = new StatusType();

			String racunKupca = nalogZaPlacanje.getOsnovaNalogaZaPlacanje()
					.getRacunDuznika().getBrojRacuna();
			String racunDobavljaca = nalogZaPlacanje
					.getOsnovaNalogaZaPlacanje().getRacunPoverioca()
					.getBrojRacuna();

			boolean istaBanka = racunKupca.substring(0, 3).equals(
					racunDobavljaca.substring(0, 3));

			if (nalogZaPlacanje.isHitno()
					|| nalogZaPlacanje.getOsnovaNalogaZaPlacanje().getIznos()
							.compareTo(new BigDecimal(250000)) > 0) {
				// CB, RTGS
				// RacunDao.reserveFunds(racunKupca,
				// naloZaPlacanje.getOsnovaNalogaZaPlacanje.getIznos());
				// CBClient = new CBClient(racunKupca.substring(0, 3));
				// //kupac.racun.prve-tri-cifre
				// CBClient.primiMT103(nalogZaPlacanje); // client napravi MT103
				// od toga, prosledi implementaciji

				racuni.reserveFunds(racunKupca, nalogZaPlacanje
						.getOsnovaNalogaZaPlacanje().getIznos());
				CentralnaBanka_CentralnaBankaPort_Client cbClient = new CentralnaBanka_CentralnaBankaPort_Client(
						racunKupca.substring(0, 3));
				
				_return = cbClient.primitMT103(nalogZaPlacanje);

			} else if (!istaBanka) {
				
				//TODO treba swift i obracunski tih banaka !!!
				Mt102Clearing.addNalog(nalogZaPlacanje); // nadji na osnovu
															// banke
															// kupca/dobavljaca
															// u odredjeni MT102
															// da gura stavku
				_return.setPoruka("[CLEARING] SACUVAN NALOG ZA PLACANJE");
				_return.setStatusKod(new BigInteger("304"));

			} else {
				racuni.transferFunds(racunKupca, racunDobavljaca,
						nalogZaPlacanje.getOsnovaNalogaZaPlacanje().getIznos());

				_return = new StatusType();
				_return.setPoruka("[ISTA BANKA] USPESNO PREBACEN NOVAC");
				_return.setStatusKod(new BigInteger("200"));
			}

			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xws.tim7.banka.Banka#primiZahtevZaIzvod(xws.tim7.zahtevzaizvod.
	 * ZahtevZaIzvodType zahtevZaIzvod )*
	 */
	public xws.tim7.entities.presek.PresekType primiZahtevZaIzvod(
			xws.tim7.entities.zahtevzaizvod.ZahtevZaIzvodType zahtevZaIzvod) throws StatusMessage {
		LOG.info("Executing operation primiZahtevZaIzvod");
		System.out.println(zahtevZaIzvod);
		try {
			xws.tim7.entities.presek.PresekType _return = null;
			
			List<NalogZaPlacanjeType> naloziZaPlacanje = nalogZaPlacanjeDao.findByRacunAndDate(zahtevZaIzvod.getBrojRacuna(), zahtevZaIzvod.getDatum());
			List<NalogZaPlacanjeType> naloziZaPlacanjePreTrazenog = nalogZaPlacanjeDao.findOlderByRacunAndDate(zahtevZaIzvod.getBrojRacuna(), zahtevZaIzvod.getDatum());
			
			double prethodnoStanje = 0.0;
			
			for(NalogZaPlacanjeType nalog : naloziZaPlacanjePreTrazenog){
				
				if(nalog.getOsnovaNalogaZaPlacanje().getRacunPoverioca().equals(zahtevZaIzvod.getBrojRacuna())){
					prethodnoStanje += nalog.getOsnovaNalogaZaPlacanje().getIznos().doubleValue();
				}else{
					prethodnoStanje -= nalog.getOsnovaNalogaZaPlacanje().getIznos().doubleValue();
				}
				
			}
			
			LOG.info("Prethodno stanje : " + prethodnoStanje);
			
			
			List<PresekType> listaPreseka = new ArrayList<PresekType>();
			
			int brojPreseka = naloziZaPlacanje.size() % 5 == 0 ? naloziZaPlacanje.size()/5 : naloziZaPlacanje.size()/5 +1;
			
			for(int i = 0; i < brojPreseka ; ++i){
				
				PresekType presek = new PresekType();
				
				PresekType.ZaglavljePreseka zaglavlje = new PresekType.ZaglavljePreseka();
				
				zaglavlje.setBrojRacuna(zahtevZaIzvod.getBrojRacuna());
				zaglavlje.setDatumNaloga(zahtevZaIzvod.getDatum());
				zaglavlje.setBrojPreseka(BigInteger.valueOf(i+1));
				zaglavlje.setPrethodnoStanje(i == 0 ? BigDecimal.valueOf(prethodnoStanje) : listaPreseka.get(i-1).getZaglavljePreseka().getNovoStanje());
				
				int brojPromenaUKorist = 0;
				int brojPromenaNaTeret = 0;
				double ukupnoUKorist = 0.0;
				double ukupnoNaTeret = 0.0;
				
				List<PresekType.StavkaPreseka> listaStavkiPreseka = new ArrayList<PresekType.StavkaPreseka>();
				
				for(int j = 0+5*i; j < naloziZaPlacanje.size() || listaStavkiPreseka.size() == 5; ++j){
					
					PresekType.StavkaPreseka stavkaPreseka = new PresekType.StavkaPreseka();
					
					if(naloziZaPlacanje.get(j).getOsnovaNalogaZaPlacanje().getRacunPoverioca().equals(zahtevZaIzvod.getBrojRacuna())){
						++brojPromenaUKorist;
						ukupnoUKorist = naloziZaPlacanje.get(j).getOsnovaNalogaZaPlacanje().getIznos().doubleValue();
						stavkaPreseka.setSmer("K");
					}else{
						++brojPromenaNaTeret;
						ukupnoNaTeret = naloziZaPlacanje.get(j).getOsnovaNalogaZaPlacanje().getIznos().doubleValue();
						stavkaPreseka.setSmer("T");
					}
					
					stavkaPreseka.setOsnovaNalogaZaPlacanje(naloziZaPlacanje.get(j).getOsnovaNalogaZaPlacanje());
					stavkaPreseka.setDatumNaloga(naloziZaPlacanje.get(j).getDatumNaloga());
					stavkaPreseka.setDatumValute(naloziZaPlacanje.get(j).getDatumValute());
					
					
					listaStavkiPreseka.add(stavkaPreseka);
				}
				
				zaglavlje.setBrojPromenaNaTeret(BigInteger.valueOf(brojPromenaNaTeret));
				zaglavlje.setBrojPromenaUKorist(BigInteger.valueOf(brojPromenaUKorist));
				zaglavlje.setUkupnoNaTeret(BigDecimal.valueOf(ukupnoNaTeret));
				zaglavlje.setUkupnoUKorist(BigDecimal.valueOf(ukupnoUKorist));
				zaglavlje.setNovoStanje(BigDecimal.valueOf(zaglavlje.getPrethodnoStanje().doubleValue() + ukupnoUKorist - ukupnoNaTeret ));
				
				presek.setZaglavljePreseka(zaglavlje);
				presek.setStavkaPreseka(listaStavkiPreseka);
				listaPreseka.add(presek);
			}
			
			
			return listaPreseka.get(zahtevZaIzvod.getRedniBrojPreseka().intValue()-1);
			
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new StatusMessage("POGRESNO FORMIRAN ZAHTEV ZA IZVOD...");
		}
	}

	/* POZIVA SAMO CENTRALNA BANKA */

	/*
	 * (non-Javadoc)
	 * 
	 * @see xws.tim7.banka.Banka#primiMT900(xws.tim7.globals.MT9XXType
	 * porukaOZaduzenjuMT900 )*
	 */
	public xws.tim7.entities.globals.StatusType primiMT900(
			xws.tim7.entities.globals.MT9XXType porukaOZaduzenjuMT900) {
		LOG.info("Executing operation primiMT900");
		System.out.println(porukaOZaduzenjuMT900);
		try {
			xws.tim7.entities.globals.StatusType _return = new StatusType();

			// RTGS ili clearing
			// primi MT900 poruku o zaduzenju i skini novce sa odredjenog racuna
			NalogZaPlacanjeType nzp = nalogZaPlacanjeDao.findByNalog(porukaOZaduzenjuMT900.getIDPorukeNaloga());

			String racunDuznika = nzp.getOsnovaNalogaZaPlacanje().getRacunDuznika().getBrojRacuna();
			BigDecimal iznos = porukaOZaduzenjuMT900.getIznos();
			
			if(iznos.compareTo(porukaOZaduzenjuMT900.getIznos()) == 0) {
				racuni.skiniSaRacuna(racunDuznika, iznos);
				_return.setPoruka("USPESNO PRIMLJEN MT900");
				_return.setStatusKod(new BigInteger("200"));
			} else {
				_return.setPoruka("NE SLAZE SE IZNOS");
				_return.setStatusKod(new BigInteger("400"));
			}
			
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(new StatusMessage("[BANKA] GRESKA PRI PRIJEMU MT900"));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xws.tim7.banka.Banka#primiMT910(xws.tim7.globals.MT9XXType
	 * porukaOOdobrenjuMT910 )*
	 */
	public xws.tim7.entities.globals.StatusType primiMT910(
			xws.tim7.entities.globals.MT9XXType porukaOOdobrenjuMT910) {
		LOG.info("Executing operation primiMT910");
		System.out.println(porukaOOdobrenjuMT910);
		try {
			xws.tim7.entities.globals.StatusType _return = null;

			MT103Type rtgs = null;
			MT102Type clearing = null;
			if ( (rtgs = Mt103Rtgs.findByMT910Id(porukaOOdobrenjuMT910.getIDPoruke())) !=null ) {
				String racunDobavljaca = rtgs.getOsnovaNalogaZaPlacanje().getRacunPoverioca().getBrojRacuna();
				BigDecimal iznos = rtgs.getOsnovaNalogaZaPlacanje().getIznos();
				racuni.uplatiNovac(racunDobavljaca, iznos);				
			} else if ( (clearing = Mt102Clearing.findByMT910Id(porukaOOdobrenjuMT910.getIDPoruke())) != null) {
				for (NalogZaPlacanjeType nzp : clearing.getNalogZaPlacanje()) {
					String racunDobavljaca = nzp.getOsnovaNalogaZaPlacanje().getRacunPoverioca().getBrojRacuna();
					BigDecimal iznos = nzp.getOsnovaNalogaZaPlacanje().getIznos();
					racuni.uplatiNovac(racunDobavljaca, iznos);
				}
			} else {
				throw new StatusMessage("NIJE PRONADJEN MT102/103 NA OSNOVU KOG JE POTREBNO UPLATITI NOVAC");
			}
			
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(new StatusMessage("[BANKA] GRESKA PRI PRIJEMU MT910"));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xws.tim7.banka.Banka#primiMT103(xws.tim7.mt103.MT103Type rtgsMT103
	 * )*
	 */
	public xws.tim7.entities.globals.StatusType primiMT103(
			xws.tim7.entities.mt103.MT103Type rtgsMT103) {
		LOG.info("Executing operation primiMT103");
		System.out.println(rtgsMT103);
		try {
			xws.tim7.entities.globals.StatusType _return = null;

			// Aha, sad znam da Firmi X iz MT103 trebam da prebacim novce...
			Mt103Rtgs.persist(rtgsMT103);

			_return = new StatusType();
			_return.setPoruka("USPESNO PRIMLJEN MT103");
			_return.setStatusKod(new BigInteger("200"));
			
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(new StatusMessage("GRESKA PRI PRIJEMU MT103"));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xws.tim7.banka.Banka#primiMT102(xws.tim7.mt102.MT102Type
	 * nalogZaGrupnaPlacanja )*
	 */
	public xws.tim7.entities.globals.StatusType primiMT102(
			xws.tim7.entities.mt102.MT102Type nalogZaGrupnaPlacanja) {
		LOG.info("Executing operation primiMT102");
		System.out.println(nalogZaGrupnaPlacanja);
		try {
			xws.tim7.entities.globals.StatusType _return = null;

			// aha, sad znam da firmi X izMT102 trebam da prebacim novce...
			Mt102Clearing.persist(nalogZaGrupnaPlacanja);

			_return = new StatusType();
			_return.setPoruka("USPESNO PRIMLJEN MT102");
			_return.setStatusKod(new BigInteger("200"));
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(new StatusMessage("GRESKA PRI PRIJEMU MT102"));
		}
	}

}
