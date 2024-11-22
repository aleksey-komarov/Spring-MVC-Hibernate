package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.model.User;

import java.util.List;

public interface UserRepository {

    void add(User user);
    List<User> listUsers();
    User getUser (long id);
    void updateUser (User user);
    void deleteUser(long id);
}
