
package xws.tim7.cb;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2015-08-22T23:28:00.980+02:00
 * Generated source version: 2.6.5
 * 
 */
public final class CentralnaBanka_CentralnaBankaPort_Client {

    private static final QName SERVICE_NAME = new QName("http://xws/tim7/cb", "CentralnaBankaService");

    private CentralnaBanka_CentralnaBankaPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CentralnaBankaService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CentralnaBankaService ss = new CentralnaBankaService(wsdlURL, SERVICE_NAME);
        CentralnaBanka port = ss.getCentralnaBankaPort();  
        
        {
        System.out.println("Invoking primiMT102...");
        xws.tim7.mt102.MT102Type _primiMT102_nalogZaGrupnaPlacanja = null;
        xws.tim7.globals.StatusType _primiMT102__return = port.primiMT102(_primiMT102_nalogZaGrupnaPlacanja);
        System.out.println("primiMT102.result=" + _primiMT102__return);


        }
        {
        System.out.println("Invoking primiMT103...");
        xws.tim7.mt103.MT103Type _primiMT103_rtgsMT103 = null;
        xws.tim7.globals.StatusType _primiMT103__return = port.primiMT103(_primiMT103_rtgsMT103);
        System.out.println("primiMT103.result=" + _primiMT103__return);


        }

        System.exit(0);
    }

}