package xws.tim7.sessionbeans.faktura;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBException;

import xws.tim7.entities.faktura.Stavka;
import xws.tim7.sessionbeans.common.GenericDaoLocal;
import xws.tim7.entities.faktura.Faktura;

public interface FakturaDaoLocal extends GenericDaoLocal<Faktura, Long> {
	
	public Stavka findItemInFaktura(Long fakturaId, Long stavkaId) throws IOException, JAXBException;
	
	public Faktura removeItemFromFaktura(Long FakturaId, BigInteger bigInteger) throws IOException, JAXBException;

	public Faktura createStavka(Long FakturaId, Stavka item) throws IOException, JAXBException;

	public Faktura updateStavka(Long FakturaId, Stavka item) throws IOException, JAXBException;
	
	public List<Faktura> getFaktureByBuyerAndSeller(String buyerPIB, String sellerPIB) throws IOException, JAXBException;

}
