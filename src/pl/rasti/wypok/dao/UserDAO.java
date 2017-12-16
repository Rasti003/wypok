package pl.rasti.wypok.dao;

import pl.rasti.wypok.model.User;

import java.util.List;

public interface UserDAO extends GenericDAO<User, Long> {
    List<User> getAll();

    User getUserByUsername(String username);
}
