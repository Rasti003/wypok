package pl.rasti.wypok.service;

import pl.rasti.wypok.dao.DAOFactory;
import pl.rasti.wypok.dao.UserDAO;
import pl.rasti.wypok.model.User;

public class UserService {
    public void addUser(String username, String email, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setActive(true);
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDao = factory.getUserDAO();
        userDao.create(user);
    }
}

