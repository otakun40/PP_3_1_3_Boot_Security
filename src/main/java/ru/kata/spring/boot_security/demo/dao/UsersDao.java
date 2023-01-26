package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UsersDao {
    User getById(long id);
    List<User> getAll();
    void save(User user);
    void delete(long id);
    void update(User user);
}
