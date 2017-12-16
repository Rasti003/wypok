package pl.rasti.wypok.dao;

import pl.rasti.wypok.model.User;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public User create(User newObject) {
        return null;
    }

    @Override
    public User read(Long primartKey) {
        return null;
    }

    @Override
    public boolean update(User updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
