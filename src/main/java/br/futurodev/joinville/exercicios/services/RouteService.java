package br.futurodev.joinville.exercicios.services;

import br.futurodev.joinville.exercicios.models.Route;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    public Route create(Route route) {
        return Route.addRoute(route);
    }

    public List<Route> findAll() {
        return Route.getRoutes();
    }

    public Route findById(Long id) {
        for (Route route : Route.getRoutes()) {
            if (route.getId().equals(id)) {
                return route;
            }
        }
        return null;
    }

}
