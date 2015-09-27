package sessionbeans.banka;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import sessionbeans.common.GenericDaoLocal;
import xws.tim7.entities.banka.Banka;
import xws.tim7.entities.globals.MT9XXType;
import xws.tim7.entities.globals.RacunType;

public interface BankaDaoLocal extends GenericDaoLocal<Banka, Long> {

	MT9XXType findByObracunskiRacun(RacunType obracunskiRacunBankePoverioca) throws IOException, JAXBException;

	Banka findBankaByObracunskiRacun(String obracunskiRacunBankePoverioca) throws IOException, JAXBException;
	
}
