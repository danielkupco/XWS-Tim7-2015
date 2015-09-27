//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.26 at 06:28:24 PM CEST 
//


package xws.tim7.entities.racun_firme;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import xws.tim7.entities.Identifiable;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWIFT_banke" type="{http://xws/tim7/globals}TSWIFTKod"/>
 *         &lt;element name="PIB_firme">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Stanje" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *         &lt;element name="Rezervisana_sredstva" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *         &lt;element name="Broj_racuna" type="{http://xws/tim7/globals}TBrojRacuna"/>
 *         &lt;element name="Poziv_na_broj" type="{http://xws/tim7/globals}TPozivNaBroj"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swiftBanke",
    "pibFirme",
    "stanje",
    "rezervisanaSredstva",
    "brojRacuna",
    "pozivNaBroj"
})
@XmlRootElement(name = "Racun_firme")
public class RacunFirme extends Identifiable {

    @XmlElement(name = "SWIFT_banke", required = true)
    protected String swiftBanke;
    @XmlElement(name = "PIB_firme", required = true)
    protected String pibFirme;
    @XmlElement(name = "Stanje", required = true)
    protected BigDecimal stanje;
    @XmlElement(name = "Rezervisana_sredstva", required = true)
    protected BigDecimal rezervisanaSredstva;
    @XmlElement(name = "Broj_racuna", required = true)
    protected String brojRacuna;
    @XmlElement(name = "Poziv_na_broj", required = true)
    protected String pozivNaBroj;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the swiftBanke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTBanke() {
        return swiftBanke;
    }

    /**
     * Sets the value of the swiftBanke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTBanke(String value) {
        this.swiftBanke = value;
    }

    /**
     * Gets the value of the pibFirme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIBFirme() {
        return pibFirme;
    }

    /**
     * Sets the value of the pibFirme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIBFirme(String value) {
        this.pibFirme = value;
    }

    /**
     * Gets the value of the stanje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStanje() {
        return stanje;
    }

    /**
     * Sets the value of the stanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStanje(BigDecimal value) {
        this.stanje = value;
    }

    /**
     * Gets the value of the rezervisanaSredstva property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRezervisanaSredstva() {
        return rezervisanaSredstva;
    }

    /**
     * Sets the value of the rezervisanaSredstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRezervisanaSredstva(BigDecimal value) {
        this.rezervisanaSredstva = value;
    }

    /**
     * Gets the value of the brojRacuna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojRacuna() {
        return brojRacuna;
    }

    /**
     * Sets the value of the brojRacuna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojRacuna(String value) {
        this.brojRacuna = value;
    }

    /**
     * Gets the value of the pozivNaBroj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozivNaBroj() {
        return pozivNaBroj;
    }

    /**
     * Sets the value of the pozivNaBroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozivNaBroj(String value) {
        this.pozivNaBroj = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }
    
    public BigDecimal getRaspolozivaSredstva() {
    	return stanje.subtract(rezervisanaSredstva);
    }

}
