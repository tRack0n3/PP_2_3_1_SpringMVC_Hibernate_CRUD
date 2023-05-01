package com.vn.webappmvc.service;


import com.vn.webappmvc.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUser(Long id);
}
