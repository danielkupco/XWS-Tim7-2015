
package xws.tim7.globals;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OsnovaNalogaZaPlacanjeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsnovaNalogaZaPlacanjeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duznik_nalogodavac" type="{http://xws/tim7/globals}TString255"/>
 *         &lt;element name="poverilac_primalac" type="{http://xws/tim7/globals}TString255"/>
 *         &lt;element name="svrha_placanja" type="{http://xws/tim7/globals}TString255"/>
 *         &lt;element name="racun_duznika" type="{http://xws/tim7/globals}RacunType"/>
 *         &lt;element name="racun_poverioca" type="{http://xws/tim7/globals}RacunType" form="qualified"/>
 *         &lt;element name="iznos" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsnovaNalogaZaPlacanjeType", propOrder = {
    "duznikNalogodavac",
    "poverilacPrimalac",
    "svrhaPlacanja",
    "racunDuznika",
    "racunPoverioca",
    "iznos"
})
public class OsnovaNalogaZaPlacanjeType {

    @XmlElement(name = "duznik_nalogodavac", required = true)
    protected String duznikNalogodavac;
    @XmlElement(name = "poverilac_primalac", required = true)
    protected String poverilacPrimalac;
    @XmlElement(name = "svrha_placanja", required = true)
    protected String svrhaPlacanja;
    @XmlElement(name = "racun_duznika", required = true)
    protected RacunType racunDuznika;
    @XmlElement(name = "racun_poverioca", required = true)
    protected RacunType racunPoverioca;
    @XmlElement(required = true)
    protected BigDecimal iznos;

    /**
     * Gets the value of the duznikNalogodavac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuznikNalogodavac() {
        return duznikNalogodavac;
    }

    /**
     * Sets the value of the duznikNalogodavac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuznikNalogodavac(String value) {
        this.duznikNalogodavac = value;
    }

    /**
     * Gets the value of the poverilacPrimalac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoverilacPrimalac() {
        return poverilacPrimalac;
    }

    /**
     * Sets the value of the poverilacPrimalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoverilacPrimalac(String value) {
        this.poverilacPrimalac = value;
    }

    /**
     * Gets the value of the svrhaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    /**
     * Sets the value of the svrhaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrhaPlacanja(String value) {
        this.svrhaPlacanja = value;
    }

    /**
     * Gets the value of the racunDuznika property.
     * 
     * @return
     *     possible object is
     *     {@link RacunType }
     *     
     */
    public RacunType getRacunDuznika() {
        return racunDuznika;
    }

    /**
     * Sets the value of the racunDuznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link RacunType }
     *     
     */
    public void setRacunDuznika(RacunType value) {
        this.racunDuznika = value;
    }

    /**
     * Gets the value of the racunPoverioca property.
     * 
     * @return
     *     possible object is
     *     {@link RacunType }
     *     
     */
    public RacunType getRacunPoverioca() {
        return racunPoverioca;
    }

    /**
     * Sets the value of the racunPoverioca property.
     * 
     * @param value
     *     allowed object is
     *     {@link RacunType }
     *     
     */
    public void setRacunPoverioca(RacunType value) {
        this.racunPoverioca = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIznos(BigDecimal value) {
        this.iznos = value;
    }

}
