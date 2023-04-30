package com.vn.webappmvc.dao;


import javax.persistence.*;
import com.vn.webappmvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return  entityManager.createQuery("SELECT u from User u", User.class).getResultList();
    }

    @Override
    public void createUser(User user) {
        entityManager.persist(user);
        entityManager.flush();

    }

    @Override
    public void deleteUser(int id) {
        User user = getUser(id);
        entityManager.remove(user);
        entityManager.flush();
    }

    @Override
    public void updateUser(int id, User updatedUser) {
        User userToBeUpdated = getUser(id);
        entityManager.merge(userToBeUpdated);
        entityManager.flush();

//        userToBeUpdated.setName(updatedUser.getName());
//        userToBeUpdated.setSurname(updatedUser.getSurname());
//        userToBeUpdated.setAge(updatedUser.getAge());
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
//        return usersList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
