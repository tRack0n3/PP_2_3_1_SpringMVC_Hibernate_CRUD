package com.vn.webappmvc.service;


import com.vn.webappmvc.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createUser(User user);

    void deleteUser(int id);

    void updateUser(int id, User user);

    User getUser(int id);
}
