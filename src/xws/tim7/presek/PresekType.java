
package xws.tim7.presek;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import xws.tim7.globals.OsnovaNalogaZaPlacanjeType;


/**
 * <p>Java class for PresekType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresekType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zaglavlje_preseka">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="broj_racuna" type="{http://xws/tim7/globals}TBrojRacuna"/>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="broj_preseka">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="prethodno_stanje" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="broj_promena_u_korist">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ukupno_u_korist" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="broj_promena_na_teret">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ukupno_na_teret" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="novo_stanje" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stavka_preseka" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="osnova_naloga_za_placanje" type="{http://xws/tim7/globals}OsnovaNalogaZaPlacanjeType"/>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="smer">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                         &lt;whiteSpace value="preserve"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresekType", propOrder = {
    "zaglavljePreseka",
    "stavkaPreseka"
})
public class PresekType {

    @XmlElement(name = "zaglavlje_preseka", required = true)
    protected PresekType.ZaglavljePreseka zaglavljePreseka;
    @XmlElement(name = "stavka_preseka")
    protected List<PresekType.StavkaPreseka> stavkaPreseka;

    /**
     * Gets the value of the zaglavljePreseka property.
     * 
     * @return
     *     possible object is
     *     {@link PresekType.ZaglavljePreseka }
     *     
     */
    public PresekType.ZaglavljePreseka getZaglavljePreseka() {
        return zaglavljePreseka;
    }

    /**
     * Sets the value of the zaglavljePreseka property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresekType.ZaglavljePreseka }
     *     
     */
    public void setZaglavljePreseka(PresekType.ZaglavljePreseka value) {
        this.zaglavljePreseka = value;
    }

    /**
     * Gets the value of the stavkaPreseka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stavkaPreseka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStavkaPreseka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresekType.StavkaPreseka }
     * 
     * 
     */
    public List<PresekType.StavkaPreseka> getStavkaPreseka() {
        if (stavkaPreseka == null) {
            stavkaPreseka = new ArrayList<PresekType.StavkaPreseka>();
        }
        return this.stavkaPreseka;
    }


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
     *         &lt;element name="osnova_naloga_za_placanje" type="{http://xws/tim7/globals}OsnovaNalogaZaPlacanjeType"/>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="smer">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *               &lt;whiteSpace value="preserve"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "osnovaNalogaZaPlacanje",
        "datumNaloga",
        "datumValute",
        "smer"
    })
    public static class StavkaPreseka {

        @XmlElement(name = "osnova_naloga_za_placanje", required = true)
        protected OsnovaNalogaZaPlacanjeType osnovaNalogaZaPlacanje;
        @XmlElement(name = "datum_naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;
        @XmlElement(name = "datum_valute", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumValute;
        @XmlElement(required = true)
        protected String smer;

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
         * Gets the value of the smer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmer() {
            return smer;
        }

        /**
         * Sets the value of the smer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmer(String value) {
            this.smer = value;
        }

    }


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
     *         &lt;element name="broj_racuna" type="{http://xws/tim7/globals}TBrojRacuna"/>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="broj_preseka">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="prethodno_stanje" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="broj_promena_u_korist">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ukupno_u_korist" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="broj_promena_na_teret">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ukupno_na_teret" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="novo_stanje" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "brojRacuna",
        "datumNaloga",
        "brojPreseka",
        "prethodnoStanje",
        "brojPromenaUKorist",
        "ukupnoUKorist",
        "brojPromenaNaTeret",
        "ukupnoNaTeret",
        "novoStanje"
    })
    public static class ZaglavljePreseka {

        @XmlElement(name = "broj_racuna", required = true)
        protected String brojRacuna;
        @XmlElement(name = "datum_naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;
        @XmlElement(name = "broj_preseka", required = true)
        protected BigInteger brojPreseka;
        @XmlElement(name = "prethodno_stanje", required = true)
        protected BigDecimal prethodnoStanje;
        @XmlElement(name = "broj_promena_u_korist", required = true)
        protected BigInteger brojPromenaUKorist;
        @XmlElement(name = "ukupno_u_korist", required = true)
        protected BigDecimal ukupnoUKorist;
        @XmlElement(name = "broj_promena_na_teret", required = true)
        protected BigInteger brojPromenaNaTeret;
        @XmlElement(name = "ukupno_na_teret", required = true)
        protected BigDecimal ukupnoNaTeret;
        @XmlElement(name = "novo_stanje", required = true)
        protected BigDecimal novoStanje;

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
         * Gets the value of the brojPreseka property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPreseka() {
            return brojPreseka;
        }

        /**
         * Sets the value of the brojPreseka property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPreseka(BigInteger value) {
            this.brojPreseka = value;
        }

        /**
         * Gets the value of the prethodnoStanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrethodnoStanje() {
            return prethodnoStanje;
        }

        /**
         * Sets the value of the prethodnoStanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrethodnoStanje(BigDecimal value) {
            this.prethodnoStanje = value;
        }

        /**
         * Gets the value of the brojPromenaUKorist property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPromenaUKorist() {
            return brojPromenaUKorist;
        }

        /**
         * Sets the value of the brojPromenaUKorist property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPromenaUKorist(BigInteger value) {
            this.brojPromenaUKorist = value;
        }

        /**
         * Gets the value of the ukupnoUKorist property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoUKorist() {
            return ukupnoUKorist;
        }

        /**
         * Sets the value of the ukupnoUKorist property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoUKorist(BigDecimal value) {
            this.ukupnoUKorist = value;
        }

        /**
         * Gets the value of the brojPromenaNaTeret property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPromenaNaTeret() {
            return brojPromenaNaTeret;
        }

        /**
         * Sets the value of the brojPromenaNaTeret property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPromenaNaTeret(BigInteger value) {
            this.brojPromenaNaTeret = value;
        }

        /**
         * Gets the value of the ukupnoNaTeret property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoNaTeret() {
            return ukupnoNaTeret;
        }

        /**
         * Sets the value of the ukupnoNaTeret property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoNaTeret(BigDecimal value) {
            this.ukupnoNaTeret = value;
        }

        /**
         * Gets the value of the novoStanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNovoStanje() {
            return novoStanje;
        }

        /**
         * Sets the value of the novoStanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNovoStanje(BigDecimal value) {
            this.novoStanje = value;
        }

    }

}
