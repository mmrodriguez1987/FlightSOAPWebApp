package com.nsu.flightapp.controller;


import com.nsu.flightapp.client.FlightClient;
import com.nsu.flightapp.model.Flight;
import com.nsu.flightapp.model.GetFlightResponse;
import com.nsu.flightapp.model.ListFlightsResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/flights")
public class FlightController {

    private final FlightClient flightClient;

    public FlightController(FlightClient flightClient) {
        this.flightClient = flightClient;
    }

    @GetMapping
    public String listFlights(Model model) {
        ListFlightsResponse response = flightClient.listFlights();
        model.addAttribute("flights", response.getFlights());
        return "list";
    }

    @GetMapping("/{id}")
    public String getFlight(@PathVariable Long id, Model model) {
        GetFlightResponse response = flightClient.getFlight(id);
        model.addAttribute("flight", response.getFlight());
        return "redirect:/flights";
    }

    @PostMapping("/add")
    public String addFlight(@ModelAttribute Flight flight) {
        flightClient.createFlight(flight);
        return "redirect:/flights";
    }

    @PostMapping("/update")
    public String updateFlight(@ModelAttribute Flight flight) {
        flightClient.updateFlight(flight);
        return "redirect:/flights";
    }

    @PostMapping("/delete/{id}")
    public String deleteFlight(@PathVariable Long id) {
        flightClient.deleteFlight(id);
        return "redirect:/flights";
    }
}
