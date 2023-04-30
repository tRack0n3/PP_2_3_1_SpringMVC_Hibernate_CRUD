package com.vn.webappmvc.dao;


import com.vn.webappmvc.model.User;
import java.util.List;


public interface UserDao {

    List<User> getAllUsers();

    void createUser(User user);

    void deleteUser(int id);

    void updateUser(int id, User user);

    User getUser(int id);
}
