package com.nsu.flightapp.config;

import com.nsu.flightapp.client.FlightClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.nsu.flight.model");
        return marshaller;
    }

    @Bean
    public FlightClient flightClient(Jaxb2Marshaller marshaller) {
        FlightClient client = new FlightClient();
        client.setDefaultUri("https://flight-soap-service-e6gvashufkh8cuhj.eastus-01.azurewebsites.net/FlightEndpointImpl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
