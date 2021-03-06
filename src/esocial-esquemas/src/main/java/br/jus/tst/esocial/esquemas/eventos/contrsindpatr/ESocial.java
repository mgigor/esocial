//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:30 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.contrsindpatr;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="evtContrSindPatr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indRetif">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrRecibo" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indApuracao">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="perApur">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpAmb">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="procEmi">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="verProc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00}TEmpregador"/>
 *                   &lt;element name="contribSind" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cnpjSindic">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{14}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpContribSind">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vlrContribSind">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="14"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                   &lt;maxInclusive value="999999999999"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "evtContrSindPatr",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00", required = true)
    protected ESocial.EvtContrSindPatr evtContrSindPatr;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtContrSindPatr property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtContrSindPatr }
     *     
     */
    public ESocial.EvtContrSindPatr getEvtContrSindPatr() {
        return evtContrSindPatr;
    }

    /**
     * Sets the value of the evtContrSindPatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtContrSindPatr }
     *     
     */
    public void setEvtContrSindPatr(ESocial.EvtContrSindPatr value) {
        this.evtContrSindPatr = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="ideEvento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="indRetif">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrRecibo" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indApuracao">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="perApur">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpAmb">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="procEmi">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="verProc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00}TEmpregador"/>
     *         &lt;element name="contribSind" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cnpjSindic">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{14}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpContribSind">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="vlrContribSind">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="14"/>
     *                         &lt;fractionDigits value="2"/>
     *                         &lt;maxInclusive value="999999999999"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "contribSind"
    })
    public static class EvtContrSindPatr {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00", required = true)
        protected ESocial.EvtContrSindPatr.IdeEvento ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00", required = true)
        protected List<ESocial.EvtContrSindPatr.ContribSind> contribSind;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtContrSindPatr.IdeEvento }
         *     
         */
        public ESocial.EvtContrSindPatr.IdeEvento getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtContrSindPatr.IdeEvento }
         *     
         */
        public void setIdeEvento(ESocial.EvtContrSindPatr.IdeEvento value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TEmpregador }
         *     
         */
        public TEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TEmpregador }
         *     
         */
        public void setIdeEmpregador(TEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the contribSind property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contribSind property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContribSind().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtContrSindPatr.ContribSind }
         * 
         * 
         */
        public List<ESocial.EvtContrSindPatr.ContribSind> getContribSind() {
            if (contribSind == null) {
                contribSind = new ArrayList<ESocial.EvtContrSindPatr.ContribSind>();
            }
            return this.contribSind;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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
         *         &lt;element name="cnpjSindic">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{14}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpContribSind">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vlrContribSind">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="14"/>
         *               &lt;fractionDigits value="2"/>
         *               &lt;maxInclusive value="999999999999"/>
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
            "cnpjSindic",
            "tpContribSind",
            "vlrContribSind"
        })
        public static class ContribSind {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00", required = true)
            protected String cnpjSindic;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00")
            protected byte tpContribSind;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00", required = true)
            protected BigDecimal vlrContribSind;

            /**
             * Gets the value of the cnpjSindic property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjSindic() {
                return cnpjSindic;
            }

            /**
             * Sets the value of the cnpjSindic property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjSindic(String value) {
                this.cnpjSindic = value;
            }

            /**
             * Gets the value of the tpContribSind property.
             * 
             */
            public byte getTpContribSind() {
                return tpContribSind;
            }

            /**
             * Sets the value of the tpContribSind property.
             * 
             */
            public void setTpContribSind(byte value) {
                this.tpContribSind = value;
            }

            /**
             * Gets the value of the vlrContribSind property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVlrContribSind() {
                return vlrContribSind;
            }

            /**
             * Sets the value of the vlrContribSind property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVlrContribSind(BigDecimal value) {
                this.vlrContribSind = value;
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
         *         &lt;element name="indRetif">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrRecibo" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indApuracao">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="perApur">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpAmb">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="procEmi">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="verProc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
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
            "indRetif",
            "nrRecibo",
            "indApuracao",
            "perApur",
            "tpAmb",
            "procEmi",
            "verProc"
        })
        public static class IdeEvento {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00")
            protected byte indRetif;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00")
            protected String nrRecibo;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00")
            protected byte indApuracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00", required = true)
            protected String perApur;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00")
            protected byte tpAmb;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00")
            protected byte procEmi;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtContrSindPatr/v02_05_00", required = true)
            protected String verProc;

            /**
             * Gets the value of the indRetif property.
             * 
             */
            public byte getIndRetif() {
                return indRetif;
            }

            /**
             * Sets the value of the indRetif property.
             * 
             */
            public void setIndRetif(byte value) {
                this.indRetif = value;
            }

            /**
             * Gets the value of the nrRecibo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecibo() {
                return nrRecibo;
            }

            /**
             * Sets the value of the nrRecibo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecibo(String value) {
                this.nrRecibo = value;
            }

            /**
             * Gets the value of the indApuracao property.
             * 
             */
            public byte getIndApuracao() {
                return indApuracao;
            }

            /**
             * Sets the value of the indApuracao property.
             * 
             */
            public void setIndApuracao(byte value) {
                this.indApuracao = value;
            }

            /**
             * Gets the value of the perApur property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPerApur() {
                return perApur;
            }

            /**
             * Sets the value of the perApur property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPerApur(String value) {
                this.perApur = value;
            }

            /**
             * Gets the value of the tpAmb property.
             * 
             */
            public byte getTpAmb() {
                return tpAmb;
            }

            /**
             * Sets the value of the tpAmb property.
             * 
             */
            public void setTpAmb(byte value) {
                this.tpAmb = value;
            }

            /**
             * Gets the value of the procEmi property.
             * 
             */
            public byte getProcEmi() {
                return procEmi;
            }

            /**
             * Sets the value of the procEmi property.
             * 
             */
            public void setProcEmi(byte value) {
                this.procEmi = value;
            }

            /**
             * Gets the value of the verProc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Sets the value of the verProc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

        }

    }

}
