package com.demo.Repository;


import com.demo.Model.User;

import java.util.List;

public interface UserDao {

    boolean saveUser(User user);
    User getUser(Long id);
    List<User> getAllUser();
    boolean deleteUser(Long id);
    boolean updateUser(Long id, User user);
}
