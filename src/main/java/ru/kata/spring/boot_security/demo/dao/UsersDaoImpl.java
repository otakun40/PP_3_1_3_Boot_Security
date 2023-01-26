package ru.kata.spring.boot_security.demo.dao;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.User;
import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UsersDaoImpl implements UsersDao {
//    @PersistenceContext
    private EntityManager em;

    public UsersDaoImpl() {
    }

    @Override
    public User getById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> getAll() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public void delete(long id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }

    @Override
    public void update(User user) {
        em.merge(user);
    }
}
