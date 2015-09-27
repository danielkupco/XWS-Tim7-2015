//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.27 at 07:34:48 PM CEST 
//


package xws.tim7.entities.banka;

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
 *         &lt;element name="ID_banke">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Naziv_banke" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Adresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Obracunski_racun" type="{http://xws/tim7/globals}TBrojRacuna"/>
 *         &lt;element name="SWIFT" type="{http://xws/tim7/globals}TSWIFTKod"/>
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
    "idBanke",
    "nazivBanke",
    "adresa",
    "obracunskiRacun",
    "swift"
})
@XmlRootElement(name = "Banka")
public class Banka extends Identifiable {

    @XmlElement(name = "ID_banke", required = true)
    protected String idBanke;
    @XmlElement(name = "Naziv_banke", required = true)
    protected String nazivBanke;
    @XmlElement(name = "Adresa", required = true)
    protected String adresa;
    @XmlElement(name = "Obracunski_racun", required = true)
    protected String obracunskiRacun;
    @XmlElement(name = "SWIFT", required = true)
    protected String swift;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the idBanke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDBanke() {
        return idBanke;
    }

    /**
     * Sets the value of the idBanke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDBanke(String value) {
        this.idBanke = value;
    }

    /**
     * Gets the value of the nazivBanke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivBanke() {
        return nazivBanke;
    }

    /**
     * Sets the value of the nazivBanke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivBanke(String value) {
        this.nazivBanke = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresa(String value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the obracunskiRacun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObracunskiRacun() {
        return obracunskiRacun;
    }

    /**
     * Sets the value of the obracunskiRacun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObracunskiRacun(String value) {
        this.obracunskiRacun = value;
    }

    /**
     * Gets the value of the swift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFT() {
        return swift;
    }

    /**
     * Sets the value of the swift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFT(String value) {
        this.swift = value;
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

}
