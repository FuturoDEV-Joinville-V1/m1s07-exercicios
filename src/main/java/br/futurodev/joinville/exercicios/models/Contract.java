package br.futurodev.joinville.exercicios.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Contract {

    @Getter
    private static final List<Contract> contracts = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private Long id;
    private Collector collector;
    private List<Route> routes = new ArrayList<>();

    public Contract() {
        this.id = sequence++;
    }

    public static Contract addContract(Contract contract) {
        contracts.add(contract);
        return contract;
    }
}
