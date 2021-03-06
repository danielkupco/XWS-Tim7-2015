
package xws.tim7.entities.mt103;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import xws.tim7.entities.globals.OsnovaNalogaZaPlacanjeType;


/**
 * <p>Java class for MT103Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MT103Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_poruke" type="{http://xws/tim7/globals}TIDPoruke"/>
 *         &lt;element name="SWIFT_kod_banke_duznika" type="{http://xws/tim7/globals}TSWIFTKod"/>
 *         &lt;element name="obracunski_racun_banke_duznika" type="{http://xws/tim7/globals}TBrojRacuna"/>
 *         &lt;element name="SWIFT_kod_banke_poverioca" type="{http://xws/tim7/globals}TSWIFTKod"/>
 *         &lt;element name="obracunski_racun_banke_poverioca" type="{http://xws/tim7/globals}TBrojRacuna"/>
 *         &lt;element name="osnova_naloga_za_placanje" type="{http://xws/tim7/globals}OsnovaNalogaZaPlacanjeType"/>
 *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="sifra_valute" type="{http://xws/tim7/globals}TOznakaValute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MT103Type", propOrder = {
    "idPoruke",
    "swiftKodBankeDuznika",
    "obracunskiRacunBankeDuznika",
    "swiftKodBankePoverioca",
    "obracunskiRacunBankePoverioca",
    "osnovaNalogaZaPlacanje",
    "datumNaloga",
    "datumValute",
    "sifraValute"
})
public class MT103Type {

    @XmlElement(name = "ID_poruke", required = true)
    protected String idPoruke;
    @XmlElement(name = "SWIFT_kod_banke_duznika", required = true)
    protected String swiftKodBankeDuznika;
    @XmlElement(name = "obracunski_racun_banke_duznika", required = true)
    protected String obracunskiRacunBankeDuznika;
    @XmlElement(name = "SWIFT_kod_banke_poverioca", required = true)
    protected String swiftKodBankePoverioca;
    @XmlElement(name = "obracunski_racun_banke_poverioca", required = true)
    protected String obracunskiRacunBankePoverioca;
    @XmlElement(name = "osnova_naloga_za_placanje", required = true)
    protected OsnovaNalogaZaPlacanjeType osnovaNalogaZaPlacanje;
    @XmlElement(name = "datum_naloga", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNaloga;
    @XmlElement(name = "datum_valute", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumValute;
    @XmlElement(name = "sifra_valute", required = true)
    protected String sifraValute;

    /**
     * Gets the value of the idPoruke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPoruke() {
        return idPoruke;
    }

    /**
     * Sets the value of the idPoruke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPoruke(String value) {
        this.idPoruke = value;
    }

    /**
     * Gets the value of the swiftKodBankeDuznika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTKodBankeDuznika() {
        return swiftKodBankeDuznika;
    }

    /**
     * Sets the value of the swiftKodBankeDuznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTKodBankeDuznika(String value) {
        this.swiftKodBankeDuznika = value;
    }

    /**
     * Gets the value of the obracunskiRacunBankeDuznika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObracunskiRacunBankeDuznika() {
        return obracunskiRacunBankeDuznika;
    }

    /**
     * Sets the value of the obracunskiRacunBankeDuznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObracunskiRacunBankeDuznika(String value) {
        this.obracunskiRacunBankeDuznika = value;
    }

    /**
     * Gets the value of the swiftKodBankePoverioca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTKodBankePoverioca() {
        return swiftKodBankePoverioca;
    }

    /**
     * Sets the value of the swiftKodBankePoverioca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTKodBankePoverioca(String value) {
        this.swiftKodBankePoverioca = value;
    }

    /**
     * Gets the value of the obracunskiRacunBankePoverioca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObracunskiRacunBankePoverioca() {
        return obracunskiRacunBankePoverioca;
    }

    /**
     * Sets the value of the obracunskiRacunBankePoverioca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObracunskiRacunBankePoverioca(String value) {
        this.obracunskiRacunBankePoverioca = value;
    }

    /**
     * Gets the value of the osnovaNalogaZaPlacanje property.
     * 
     * @return
     *     possible object is
     *     {@link OsnovaNalogaZaPlacanjeType }
     *     
     */
    public OsnovaNalogaZaPlacanjeType getOsnovaNalogaZaPlacanje() {
        return osnovaNalogaZaPlacanje;
    }

    /**
     * Sets the value of the osnovaNalogaZaPlacanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsnovaNalogaZaPlacanjeType }
     *     
     */
    public void setOsnovaNalogaZaPlacanje(OsnovaNalogaZaPlacanjeType value) {
        this.osnovaNalogaZaPlacanje = value;
    }

    /**
     * Gets the value of the datumNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNaloga() {
        return datumNaloga;
    }

    /**
     * Sets the value of the datumNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNaloga(XMLGregorianCalendar value) {
        this.datumNaloga = value;
    }

    /**
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

    /**
     * Gets the value of the sifraValute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifraValute() {
        return sifraValute;
    }

    /**
     * Sets the value of the sifraValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifraValute(String value) {
        this.sifraValute = value;
    }

}
