package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;
import javax.validation.Valid;
import java.util.List;

public interface UsersService {
    User getById(long id);
    List<User> getAll();

    void save(@Valid User user);

    void delete(long id);

    void update(@Valid User user);

}
