package com.nsu.flightapp.controller;
import com.nsu.flightapp.client.FlightClient;
import com.nsu.flightapp.model.Flight;
import com.nsu.flightapp.model.ListFlightsResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/flights")
public class FlightController {

    private final FlightClient flightClient;

    public FlightController(FlightClient flightClient) {
        this.flightClient = flightClient;
    }

    @GetMapping
    public String listFlights(Model model,
                              @RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "50") int size) {
        // Fetch full list from your SOAP client
        ListFlightsResponse response = flightClient.listFlights();
        List<Flight> allFlights = response.getFlights();

        int total = allFlights.size();
        int totalPages = (int) Math.ceil((double) total / size);
        int fromIndex = Math.min(page * size, total);
        int toIndex   = Math.min(fromIndex + size, total);
        List<Flight> pageList = allFlights.subList(fromIndex, toIndex);

        // build a “windowed” page list with ellipses (-1)
        List<Integer> pages = new ArrayList<>();
        if (totalPages > 0) {
            pages.add(0); // first page
            int start = Math.max(1, page - 2);
            int end   = Math.min(totalPages - 2, page + 2);
            if (start > 1) {
                pages.add(-1); // ellipsis
            }
            for (int i = start; i <= end; i++) {
                pages.add(i);
            }
            if (end < totalPages - 2) {
                pages.add(-1);
            }
            if (totalPages > 1) {
                pages.add(totalPages - 1); // last page
            }
        }

        model.addAttribute("flights", pageList);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("pageSize", size);
        model.addAttribute("pages", pages);
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("flight", new Flight());
        return "flight_form";
    }

    @PostMapping("/create")
    public String createFlight(@ModelAttribute Flight flight) {
        flightClient.createFlight(flight);
        return "redirect:/flights";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("flight", flightClient.getFlight(id));
        return "flight_form";
    }

    @PostMapping("/edit/{id}")
    public String updateFlight(@PathVariable Long id, @ModelAttribute Flight flight) {
        flight.setId(id);
        flightClient.updateFlight(flight);
        return "redirect:/flights";
    }
}
