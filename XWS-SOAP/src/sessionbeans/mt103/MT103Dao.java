package sessionbeans.mt103;

import java.io.IOException;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBException;

import sessionbeans.banka.BankaDaoLocal;
import sessionbeans.common.GenericDao;
import soap.tim7.entities.mt103.MT103Type;

@Stateless
@Local(MT103DaoLocal.class)
public class MT103Dao extends GenericDao<MT103Type, Long> implements MT103DaoLocal {

	public static final String contextPath = "soap.tim7.entities.mt103";
	public static final String schemaName = "rtgs_mt103";
	
	public MT103Dao() {
		super(contextPath, schemaName);
	}

	@Override
	public MT103Type findByMT910Id(String idPoruke) throws IOException,
			JAXBException {
		List<MT103Type> list = findAll();
		for (MT103Type item : list) {
			if (item.getIDPoruke().equals(idPoruke)) {
				return item;
			}
		}
		return null;
	}

}
