package pl.rasti.wypok.dao;

import pl.rasti.wypok.model.Discovery;

import java.util.List;

public interface DiscoveryDAO extends GenericDAO<Discovery, Long> {

    List<Discovery> getAll();

}