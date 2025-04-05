package br.futurodev.joinville.exercicios.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Collector {

    @Getter
    private static final List<Collector> collectors = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private String description;

    public Collector() {
        this.id = sequence++;
    }

    public static Collector addCollector(Collector collector) {
        collectors.add(collector);
        return collector;
    }
}
