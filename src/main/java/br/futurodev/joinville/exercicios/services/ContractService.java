package br.futurodev.joinville.exercicios.services;

import br.futurodev.joinville.exercicios.models.Collector;
import br.futurodev.joinville.exercicios.models.Contract;
import br.futurodev.joinville.exercicios.models.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService {

    @Autowired
    private RouteService routeService;

    @Autowired
    private CollectorService collectorService;

    public Contract create(Contract contract) {
        Collector collector = collectorService.findById(contract.getCollector().getId());
        if (collector == null) { return null; }
        else { contract.setCollector(collector); }

        List<Route> routes = new ArrayList<>();
        for (Route route : contract.getRoutes()) {
            Route foundRoute = routeService.findById(route.getId());
            if (foundRoute == null) { return null; }
            else { routes.add(foundRoute); }
        }
        contract.setRoutes(routes);

        return Contract.addContract(contract);
    }

    public List<Contract> findAll() {
        return Contract.getContracts();
    }

}
