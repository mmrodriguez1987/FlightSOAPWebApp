package com.nsu.flightapp.client;

import com.nsu.flightapp.model.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class FlightClient extends WebServiceGatewaySupport {

    public ListFlightsResponse listFlights() {
        ListFlights request = new ListFlights();
        Object response = getWebServiceTemplate().marshalSendAndReceive(request);
        if (response instanceof JAXBElement) {
            return (ListFlightsResponse) ((JAXBElement<?>) response).getValue();
        }
        return (ListFlightsResponse) response;

    }

    public GetFlightResponse getFlight(Long flightId) {
        GetFlight request = new GetFlight();
        request.setId(flightId);
        Object response = getWebServiceTemplate().marshalSendAndReceive(request);
        if (response instanceof JAXBElement) {
            return (GetFlightResponse) ((JAXBElement<?>) response).getValue();
        }
        return (GetFlightResponse) response;

    }

    public CreateFlightResponse createFlight(Flight flight) {
        CreateFlight request = new CreateFlight();
        request.setFlight(flight);
        return (CreateFlightResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public UpdateFlightResponse updateFlight(Flight flight) {
        UpdateFlight request = new UpdateFlight();
        request.setFlight(flight);
        return (UpdateFlightResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public DeleteFlightResponse deleteFlight(Long flightId) {
        DeleteFlight request = new DeleteFlight();
        request.setId(flightId);
        return (DeleteFlightResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
