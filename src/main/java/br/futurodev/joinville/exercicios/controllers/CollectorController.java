package br.futurodev.joinville.exercicios.controllers;

import br.futurodev.joinville.exercicios.models.Collector;
import br.futurodev.joinville.exercicios.services.CollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("collectors")
public class CollectorController {

    @Autowired
    private CollectorService service;

    @GetMapping
    public List<Collector> get() {
        return service.findAll();
    }

    @PostMapping
    public Collector post(@RequestBody Collector collector) {
        return service.create(collector);
    }

}
