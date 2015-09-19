//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.19 at 04:25:57 PM CEST 
//


package xws.tim7.entities.faktura;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element name="Zaglavlje">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID_poruke" type="{http://xws/tim7/globals}TIDPoruke"/>
 *                   &lt;element name="Kupac" type="{http://xws/tim7/faktura}TFirma"/>
 *                   &lt;element name="Dobavljac" type="{http://xws/tim7/faktura}TFirma"/>
 *                   &lt;element name="Broj_racuna">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="6"/>
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Datum_racuna" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="Vrednost_robe" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="Vrednost_usluga" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="Ukupno_roba_i_usluge" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="Ukupan_rabat" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="Ukupan_porez" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="Oznaka_valute" type="{http://xws/tim7/globals}TOznakaValute"/>
 *                   &lt;element name="Iznos_za_uplatu" type="{http://xws/tim7/globals}TDecimal15_2"/>
 *                   &lt;element name="Uplata_na_racun" type="{http://xws/tim7/globals}TBrojRacuna"/>
 *                   &lt;element name="Datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element ref="{http://xws/tim7/faktura}Stavka" maxOccurs="unbounded"/>
 *         &lt;/sequence>
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
    "zaglavlje",
    "stavka"
})
@XmlRootElement(name = "Faktura")
public class Faktura extends Identifiable {

    @XmlElement(name = "Zaglavlje", required = true)
    protected Faktura.Zaglavlje zaglavlje;
    @XmlElement(name = "Stavka", required = true)
    protected List<Stavka> stavka;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link Faktura.Zaglavlje }
     *     
     */
    public Faktura.Zaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faktura.Zaglavlje }
     *     
     */
    public void setZaglavlje(Faktura.Zaglavlje value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the stavka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stavka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStavka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stavka }
     * 
     * 
     */
    public List<Stavka> getStavka() {
        if (stavka == null) {
            stavka = new ArrayList<Stavka>();
        }
        return this.stavka;
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
     *         &lt;element name="ID_poruke" type="{http://xws/tim7/globals}TIDPoruke"/>
     *         &lt;element name="Kupac" type="{http://xws/tim7/faktura}TFirma"/>
     *         &lt;element name="Dobavljac" type="{http://xws/tim7/faktura}TFirma"/>
     *         &lt;element name="Broj_racuna">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="6"/>
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Datum_racuna" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="Vrednost_robe" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="Vrednost_usluga" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="Ukupno_roba_i_usluge" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="Ukupan_rabat" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="Ukupan_porez" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="Oznaka_valute" type="{http://xws/tim7/globals}TOznakaValute"/>
     *         &lt;element name="Iznos_za_uplatu" type="{http://xws/tim7/globals}TDecimal15_2"/>
     *         &lt;element name="Uplata_na_racun" type="{http://xws/tim7/globals}TBrojRacuna"/>
     *         &lt;element name="Datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "idPoruke",
        "kupac",
        "dobavljac",
        "brojRacuna",
        "datumRacuna",
        "vrednostRobe",
        "vrednostUsluga",
        "ukupnoRobaIUsluge",
        "ukupanRabat",
        "ukupanPorez",
        "oznakaValute",
        "iznosZaUplatu",
        "uplataNaRacun",
        "datumValute"
    })
    public static class Zaglavlje {

        @XmlElement(name = "ID_poruke", required = true)
        protected String idPoruke;
        @XmlElement(name = "Kupac", required = true)
        protected TFirma kupac;
        @XmlElement(name = "Dobavljac", required = true)
        protected TFirma dobavljac;
        @XmlElement(name = "Broj_racuna", required = true)
        protected BigInteger brojRacuna;
        @XmlElement(name = "Datum_racuna", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumRacuna;
        @XmlElement(name = "Vrednost_robe", required = true)
        protected BigDecimal vrednostRobe;
        @XmlElement(name = "Vrednost_usluga", required = true)
        protected BigDecimal vrednostUsluga;
        @XmlElement(name = "Ukupno_roba_i_usluge", required = true)
        protected BigDecimal ukupnoRobaIUsluge;
        @XmlElement(name = "Ukupan_rabat", required = true)
        protected BigDecimal ukupanRabat;
        @XmlElement(name = "Ukupan_porez", required = true)
        protected BigDecimal ukupanPorez;
        @XmlElement(name = "Oznaka_valute", required = true)
        protected String oznakaValute;
        @XmlElement(name = "Iznos_za_uplatu", required = true)
        protected BigDecimal iznosZaUplatu;
        @XmlElement(name = "Uplata_na_racun", required = true)
        protected String uplataNaRacun;
        @XmlElement(name = "Datum_valute", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumValute;

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
         * Gets the value of the kupac property.
         * 
         * @return
         *     possible object is
         *     {@link TFirma }
         *     
         */
        public TFirma getKupac() {
            return kupac;
        }

        /**
         * Sets the value of the kupac property.
         * 
         * @param value
         *     allowed object is
         *     {@link TFirma }
         *     
         */
        public void setKupac(TFirma value) {
            this.kupac = value;
        }

        /**
         * Gets the value of the dobavljac property.
         * 
         * @return
         *     possible object is
         *     {@link TFirma }
         *     
         */
        public TFirma getDobavljac() {
            return dobavljac;
        }

        /**
         * Sets the value of the dobavljac property.
         * 
         * @param value
         *     allowed object is
         *     {@link TFirma }
         *     
         */
        public void setDobavljac(TFirma value) {
            this.dobavljac = value;
        }

        /**
         * Gets the value of the brojRacuna property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojRacuna() {
            return brojRacuna;
        }

        /**
         * Sets the value of the brojRacuna property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojRacuna(BigInteger value) {
            this.brojRacuna = value;
        }

        /**
         * Gets the value of the datumRacuna property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumRacuna() {
            return datumRacuna;
        }

        /**
         * Sets the value of the datumRacuna property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumRacuna(XMLGregorianCalendar value) {
            this.datumRacuna = value;
        }

        /**
         * Gets the value of the vrednostRobe property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrednostRobe() {
            return vrednostRobe;
        }

        /**
         * Sets the value of the vrednostRobe property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrednostRobe(BigDecimal value) {
            this.vrednostRobe = value;
        }

        /**
         * Gets the value of the vrednostUsluga property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrednostUsluga() {
            return vrednostUsluga;
        }

        /**
         * Sets the value of the vrednostUsluga property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrednostUsluga(BigDecimal value) {
            this.vrednostUsluga = value;
        }

        /**
         * Gets the value of the ukupnoRobaIUsluge property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoRobaIUsluge() {
            return ukupnoRobaIUsluge;
        }

        /**
         * Sets the value of the ukupnoRobaIUsluge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoRobaIUsluge(BigDecimal value) {
            this.ukupnoRobaIUsluge = value;
        }

        /**
         * Gets the value of the ukupanRabat property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupanRabat() {
            return ukupanRabat;
        }

        /**
         * Sets the value of the ukupanRabat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupanRabat(BigDecimal value) {
            this.ukupanRabat = value;
        }

        /**
         * Gets the value of the ukupanPorez property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupanPorez() {
            return ukupanPorez;
        }

        /**
         * Sets the value of the ukupanPorez property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupanPorez(BigDecimal value) {
            this.ukupanPorez = value;
        }

        /**
         * Gets the value of the oznakaValute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOznakaValute() {
            return oznakaValute;
        }

        /**
         * Sets the value of the oznakaValute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOznakaValute(String value) {
            this.oznakaValute = value;
        }

        /**
         * Gets the value of the iznosZaUplatu property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIznosZaUplatu() {
            return iznosZaUplatu;
        }

        /**
         * Sets the value of the iznosZaUplatu property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIznosZaUplatu(BigDecimal value) {
            this.iznosZaUplatu = value;
        }

        /**
         * Gets the value of the uplataNaRacun property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUplataNaRacun() {
            return uplataNaRacun;
        }

        /**
         * Sets the value of the uplataNaRacun property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUplataNaRacun(String value) {
            this.uplataNaRacun = value;
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

    }


	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long value) {
		// TODO Auto-generated method stub
		
	}

}
