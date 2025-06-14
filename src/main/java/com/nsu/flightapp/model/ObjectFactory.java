
package com.nsu.flightapp.model;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.flight.soapclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateFlight_QNAME = new QName("http://soap.nsu.com/flights", "createFlight");
    private final static QName _CreateFlightResponse_QNAME = new QName("http://soap.nsu.com/flights", "createFlightResponse");
    private final static QName _DeleteFlight_QNAME = new QName("http://soap.nsu.com/flights", "deleteFlight");
    private final static QName _DeleteFlightResponse_QNAME = new QName("http://soap.nsu.com/flights", "deleteFlightResponse");
    private final static QName _Flight_QNAME = new QName("http://soap.nsu.com/flights", "flight");
    private final static QName _GetFlight_QNAME = new QName("http://soap.nsu.com/flights", "getFlight");
    private final static QName _GetFlightResponse_QNAME = new QName("http://soap.nsu.com/flights", "getFlightResponse");
    private final static QName _ListFlights_QNAME = new QName("http://soap.nsu.com/flights", "listFlights");
    private final static QName _ListFlightsResponse_QNAME = new QName("http://soap.nsu.com/flights", "listFlightsResponse");
    private final static QName _UpdateFlight_QNAME = new QName("http://soap.nsu.com/flights", "updateFlight");
    private final static QName _UpdateFlightResponse_QNAME = new QName("http://soap.nsu.com/flights", "updateFlightResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.flight.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateFlight }
     * 
     */
    public CreateFlight createCreateFlight() {
        return new CreateFlight();
    }

    /**
     * Create an instance of {@link CreateFlightResponse }
     * 
     */
    public CreateFlightResponse createCreateFlightResponse() {
        return new CreateFlightResponse();
    }

    /**
     * Create an instance of {@link DeleteFlight }
     * 
     */
    public DeleteFlight createDeleteFlight() {
        return new DeleteFlight();
    }

    /**
     * Create an instance of {@link DeleteFlightResponse }
     * 
     */
    public DeleteFlightResponse createDeleteFlightResponse() {
        return new DeleteFlightResponse();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link GetFlight }
     * 
     */
    public GetFlight createGetFlight() {
        return new GetFlight();
    }

    /**
     * Create an instance of {@link GetFlightResponse }
     * 
     */
    public GetFlightResponse createGetFlightResponse() {
        return new GetFlightResponse();
    }

    /**
     * Create an instance of {@link ListFlights }
     * 
     */
    public ListFlights createListFlights() {
        return new ListFlights();
    }

    /**
     * Create an instance of {@link ListFlightsResponse }
     * 
     */
    public ListFlightsResponse createListFlightsResponse() {
        return new ListFlightsResponse();
    }

    /**
     * Create an instance of {@link UpdateFlight }
     * 
     */
    public UpdateFlight createUpdateFlight() {
        return new UpdateFlight();
    }

    /**
     * Create an instance of {@link UpdateFlightResponse }
     * 
     */
    public UpdateFlightResponse createUpdateFlightResponse() {
        return new UpdateFlightResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "createFlight")
    public JAXBElement<CreateFlight> createCreateFlight(CreateFlight value) {
        return new JAXBElement<CreateFlight>(_CreateFlight_QNAME, CreateFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "createFlightResponse")
    public JAXBElement<CreateFlightResponse> createCreateFlightResponse(CreateFlightResponse value) {
        return new JAXBElement<CreateFlightResponse>(_CreateFlightResponse_QNAME, CreateFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "deleteFlight")
    public JAXBElement<DeleteFlight> createDeleteFlight(DeleteFlight value) {
        return new JAXBElement<DeleteFlight>(_DeleteFlight_QNAME, DeleteFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "deleteFlightResponse")
    public JAXBElement<DeleteFlightResponse> createDeleteFlightResponse(DeleteFlightResponse value) {
        return new JAXBElement<DeleteFlightResponse>(_DeleteFlightResponse_QNAME, DeleteFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Flight }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "flight")
    public JAXBElement<Flight> createFlight(Flight value) {
        return new JAXBElement<Flight>(_Flight_QNAME, Flight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "getFlight")
    public JAXBElement<GetFlight> createGetFlight(GetFlight value) {
        return new JAXBElement<GetFlight>(_GetFlight_QNAME, GetFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "getFlightResponse")
    public JAXBElement<GetFlightResponse> createGetFlightResponse(GetFlightResponse value) {
        return new JAXBElement<GetFlightResponse>(_GetFlightResponse_QNAME, GetFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "listFlights")
    public JAXBElement<ListFlights> createListFlights(ListFlights value) {
        return new JAXBElement<ListFlights>(_ListFlights_QNAME, ListFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "listFlightsResponse")
    public JAXBElement<ListFlightsResponse> createListFlightsResponse(ListFlightsResponse value) {
        return new JAXBElement<ListFlightsResponse>(_ListFlightsResponse_QNAME, ListFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "updateFlight")
    public JAXBElement<UpdateFlight> createUpdateFlight(UpdateFlight value) {
        return new JAXBElement<UpdateFlight>(_UpdateFlight_QNAME, UpdateFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.nsu.com/flights", name = "updateFlightResponse")
    public JAXBElement<UpdateFlightResponse> createUpdateFlightResponse(UpdateFlightResponse value) {
        return new JAXBElement<UpdateFlightResponse>(_UpdateFlightResponse_QNAME, UpdateFlightResponse.class, null, value);
    }

}
