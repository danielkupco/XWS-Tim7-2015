package xws.tim7.sessionbeans.firma;

import java.io.IOException;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBException;

import xws.tim7.entities.firma.Firma;
import xws.tim7.sessionbeans.common.GenericDao;


@Stateless
@Local(FirmaDaoLocal.class)
public class FirmaDao extends GenericDao<Firma, Long> implements FirmaDaoLocal {

	
	public static final String contextPath = "xws.tim7.entities.firma";
	
	public static final String schemaName = "firma";
	
	public FirmaDao() {
		super(contextPath, schemaName);
	}


	@Override
	public boolean isPartnerWith(Long firmId, Long partnerPIB)
			throws IOException, JAXBException {
		
		Firma frm = findById(firmId);
		
		for(String pib : frm.getPartneri().getPib()) {
			if(pib.equals(partnerPIB))
				return true;
		}
		
		return false;
	}

	@Override
	public Firma findByURL(String url) throws IOException, JAXBException {
		
		List<Firma> firme = findAll();
		
		for(Firma f : firme){
			if(f.getUrl().equals(url))
				return f;
		}
		
		return null;
	}

	@Override
	public Firma findByPIB(String pib) throws IOException, JAXBException {
		
		List<Firma> firme = findAll();
		
		for(Firma f : firme){
			if(f.getPIB().equals(pib))
				return f;
		}
		
		return null;
	}

	
	
	
	
	
}
