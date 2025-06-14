
package com.nsu.flightapp.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createFlightResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createFlightResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newFlight" type="{http://soap.nsu.com/flights}flight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createFlightResponse", propOrder = {
    "newFlight"
})
public class CreateFlightResponse {

    protected Flight newFlight;

    /**
     * Gets the value of the newFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getNewFlight() {
        return newFlight;
    }

    /**
     * Sets the value of the newFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setNewFlight(Flight value) {
        this.newFlight = value;
    }

}
