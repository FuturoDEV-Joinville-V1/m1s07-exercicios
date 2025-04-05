package br.futurodev.joinville.exercicios.controllers;

import br.futurodev.joinville.exercicios.models.Route;
import br.futurodev.joinville.exercicios.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("routes")
public class RouteController {

    @Autowired
    private RouteService service;

    @GetMapping
    public List<Route> get() {
        return service.findAll();
    }

    @PostMapping
    public Route post(@RequestBody Route route) {
        return service.create(route);
    }

}
