//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.10 at 10:02:26 PM CET 
//


package ietf.params.xml.ns.keyprov.pskc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001._04.xmlenc_.EncryptedDataType;


/**
 * <p>Java class for intDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PlainValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="EncryptedValue" type="{http://www.w3.org/2001/04/xmlenc#}EncryptedDataType"/>
 *         &lt;/choice>
 *         &lt;element name="ValueMAC" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intDataType", propOrder = {
    "plainValue",
    "encryptedValue",
    "valueMAC"
})
public class IntDataType {

    @XmlElement(name = "PlainValue")
    protected Integer plainValue;
    @XmlElement(name = "EncryptedValue")
    protected EncryptedDataType encryptedValue;
    @XmlElement(name = "ValueMAC")
    protected byte[] valueMAC;

    /**
     * Gets the value of the plainValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlainValue() {
        return plainValue;
    }

    /**
     * Sets the value of the plainValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlainValue(Integer value) {
        this.plainValue = value;
    }

    /**
     * Gets the value of the encryptedValue property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataType }
     *     
     */
    public EncryptedDataType getEncryptedValue() {
        return encryptedValue;
    }

    /**
     * Sets the value of the encryptedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataType }
     *     
     */
    public void setEncryptedValue(EncryptedDataType value) {
        this.encryptedValue = value;
    }

    /**
     * Gets the value of the valueMAC property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValueMAC() {
        return valueMAC;
    }

    /**
     * Sets the value of the valueMAC property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValueMAC(byte[] value) {
        this.valueMAC = ((byte[]) value);
    }

}