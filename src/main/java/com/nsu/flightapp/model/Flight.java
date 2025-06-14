
package com.nsu.flightapp.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for flight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="passengers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferredConnectingCities" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="preferredAirlines" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flightTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specificAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specificFlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flight", propOrder = {
    "id",
    "origin",
    "destination",
    "departureDate",
    "passengers",
    "timeRange",
    "preferredConnectingCities",
    "preferredAirlines",
    "flightTypes",
    "specificAirline",
    "specificFlight"
})
public class Flight {

    protected Long id;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String departureDate;
    protected int passengers;
    protected String timeRange;
    @XmlElement(nillable = true)
    protected List<String> preferredConnectingCities;
    @XmlElement(nillable = true)
    protected List<String> preferredAirlines;
    @XmlElement(nillable = true)
    protected List<String> flightTypes;
    protected String specificAirline;
    protected String specificFlight;

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

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     */
    public void setPassengers(int value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeRange(String value) {
        this.timeRange = value;
    }

    /**
     * Gets the value of the preferredConnectingCities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredConnectingCities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredConnectingCities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreferredConnectingCities() {
        if (preferredConnectingCities == null) {
            preferredConnectingCities = new ArrayList<String>();
        }
        return this.preferredConnectingCities;
    }

    /**
     * Gets the value of the preferredAirlines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredAirlines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredAirlines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreferredAirlines() {
        if (preferredAirlines == null) {
            preferredAirlines = new ArrayList<String>();
        }
        return this.preferredAirlines;
    }

    /**
     * Gets the value of the flightTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightTypes() {
        if (flightTypes == null) {
            flightTypes = new ArrayList<String>();
        }
        return this.flightTypes;
    }

    /**
     * Gets the value of the specificAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificAirline() {
        return specificAirline;
    }

    /**
     * Sets the value of the specificAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificAirline(String value) {
        this.specificAirline = value;
    }

    /**
     * Gets the value of the specificFlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificFlight() {
        return specificFlight;
    }

    /**
     * Sets the value of the specificFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificFlight(String value) {
        this.specificFlight = value;
    }

}
