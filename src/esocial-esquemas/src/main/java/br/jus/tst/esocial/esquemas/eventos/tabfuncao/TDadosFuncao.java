//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:44 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.tabfuncao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informa\u00e7\u00f5es da Fun\u00e7\u00e3o
 * 
 * <p>Java class for TDadosFuncao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDadosFuncao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dscFuncao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codCBO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{4,6}"/>
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
@XmlType(name = "TDadosFuncao", namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_05_00", propOrder = {
    "dscFuncao",
    "codCBO"
})
public class TDadosFuncao {

    @XmlElement(required = true)
    protected String dscFuncao;
    @XmlElement(required = true)
    protected String codCBO;

    /**
     * Gets the value of the dscFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscFuncao() {
        return dscFuncao;
    }

    /**
     * Sets the value of the dscFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscFuncao(String value) {
        this.dscFuncao = value;
    }

    /**
     * Gets the value of the codCBO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCBO() {
        return codCBO;
    }

    /**
     * Sets the value of the codCBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCBO(String value) {
        this.codCBO = value;
    }

}
