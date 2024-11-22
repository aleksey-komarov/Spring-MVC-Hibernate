package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void add(User user);
    List<User> listUsers();
    User getUser (long id);
    void updateUser (User user);
    void deleteUser(long id);

}
