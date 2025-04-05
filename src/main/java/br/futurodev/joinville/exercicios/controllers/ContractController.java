package br.futurodev.joinville.exercicios.controllers;

import br.futurodev.joinville.exercicios.models.Contract;
import br.futurodev.joinville.exercicios.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contracts")
public class ContractController {

    @Autowired
    private ContractService service;

    @GetMapping
    public List<Contract> get() {
        return service.findAll();
    }

    @PostMapping
    public Contract post(@RequestBody Contract contract) {
        return service.create(contract);
    }

}
