
package com.nsu.flightapp.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateFlightResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateFlightResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updatedFlight" type="{http://soap.nsu.com/flights}flight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateFlightResponse", propOrder = {
    "updatedFlight"
})
public class UpdateFlightResponse {

    protected Flight updatedFlight;

    /**
     * Gets the value of the updatedFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getUpdatedFlight() {
        return updatedFlight;
    }

    /**
     * Sets the value of the updatedFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setUpdatedFlight(Flight value) {
        this.updatedFlight = value;
    }

}
