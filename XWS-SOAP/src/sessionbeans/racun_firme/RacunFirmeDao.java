package sessionbeans.racun_firme;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;

import sessionbeans.common.GenericDao;
import sessionbeans.nalogzaplacanje.NalogZaPlacanjeDaoLocal;
import soap.tim7.entities.racun_firme.RacunFirme;
import soap.tim7.services.banka.BankaImpl;

@Stateless
@Local(RacunFirmeDaoLocal.class)
public class RacunFirmeDao extends GenericDao<RacunFirme, Long> implements RacunFirmeDaoLocal {

	public static final String contextPath = "soap.tim7.entities.racun_firme";
	public static final String schemaName = "racun_firme";
	
	private static Logger log = Logger.getLogger(RacunFirmeDao.class);

	
	public RacunFirmeDao() {
		super(contextPath, schemaName);
	}

	@Override
	public void reserveFunds(String racunKupca, BigDecimal iznos) throws IOException, JAXBException {
		RacunFirme racun = findByRacun(racunKupca);
		racun.setRezervisanaSredstva(racun.getRezervisanaSredstva().add(iznos));
		merge(racun, racun.getId());
	}

	@Override
	public void transferFunds(String racunKupca, String racunDobavljaca, BigDecimal iznos) throws IOException, JAXBException {
		RacunFirme kupac = findByRacun(racunKupca);
		RacunFirme dobavljac = findByRacun(racunDobavljaca);
		log.info("KUPAC --------->" + kupac);
		log.info("DOBAVLJAC ------->"+dobavljac);
		
		log.info("------------------------------------------------------------");
		log.info("KUPAC [getStanje] --------->" + kupac.getStanje());
		log.info("DOBAVLJAC [getStanje]------->"+ dobavljac.getStanje());
		log.info("------------------------------------------------------------");
		
		kupac.setStanje(kupac.getStanje().subtract(iznos));
		dobavljac.setStanje(dobavljac.getStanje().add(iznos));
		
		merge(kupac, kupac.getId());
		merge(dobavljac, dobavljac.getId());
	}

	@Override
	public void skiniSaRacuna(String racunDuznika, BigDecimal iznos) throws IOException, JAXBException {
		RacunFirme racun = findByRacun(racunDuznika);
		racun.setStanje(racun.getStanje().subtract(iznos));
		racun.setRezervisanaSredstva(racun.getRezervisanaSredstva().subtract(iznos));
		merge(racun, racun.getId());
	}

	@Override
	public void uplatiNovac(String racunDobavljaca, BigDecimal iznos) throws IOException, JAXBException {
		RacunFirme racun = findByRacun(racunDobavljaca);
		racun.setStanje(racun.getStanje().add(iznos));
		merge(racun, racun.getId());
	}

	@Override
	public RacunFirme findByRacun(String brojRacuna) throws IOException, JAXBException {
		List<RacunFirme> lista = findAll();
		for(RacunFirme racun : lista) {
			if(racun.getBrojRacuna().equals(brojRacuna)) {
				return racun;
			}
		}
		return null;
	}

}
