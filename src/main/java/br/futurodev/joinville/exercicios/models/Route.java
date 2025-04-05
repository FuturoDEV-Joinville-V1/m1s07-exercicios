package br.futurodev.joinville.exercicios.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Route {

    @Getter
    private static final List<Route> routes = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private Long id;
    private String description;
    private String coverageArea;
    private BigDecimal efficiencyPercentage;

    public Route() {
        this.id = sequence++;
    }

    public static Route addRoute(Route route) {
        routes.add(route);
        return route;
    }
}
