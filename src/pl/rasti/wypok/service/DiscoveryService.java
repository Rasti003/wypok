package pl.rasti.wypok.service;

import pl.rasti.wypok.dao.DAOFactory;
import pl.rasti.wypok.dao.DiscoveryDAO;
import pl.rasti.wypok.model.Discovery;
import pl.rasti.wypok.model.User;

import java.util.Date;
import java.sql.Timestamp;

public class DiscoveryService {
    public void addDiscovery(String name, String desc, String url, User user) {
        Discovery discovery = createDiscoveryObject(name, desc, url, user);
        DAOFactory factory = DAOFactory.getDAOFactory();
        DiscoveryDAO discoveryDao = factory.getDiscoveryDAO();
        discoveryDao.create(discovery);
    }

    private Discovery createDiscoveryObject(String name, String desc, String url, User user) {
        Discovery discovery = new Discovery();
        discovery.setName(name);
        discovery.setDescription(desc);
        discovery.setUrl(url);
        User userCopy = new User(user);
        discovery.setUser(userCopy);
        discovery.setTimestamp(new Timestamp(new Date().getTime()));
        return discovery;
    }
}