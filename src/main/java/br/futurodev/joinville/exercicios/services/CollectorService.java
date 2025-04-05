package br.futurodev.joinville.exercicios.services;

import br.futurodev.joinville.exercicios.models.Collector;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectorService {

    public Collector create(Collector collector) {
        return Collector.addCollector(collector);
    }

    public List<Collector> findAll() {
        return Collector.getCollectors();
    }

    public Collector findById(Long id) {
        for (Collector collector : Collector.getCollectors()) {
            if (collector.getId().equals(id)) {
                return collector;
            }
        }
        return null;
    }

}
