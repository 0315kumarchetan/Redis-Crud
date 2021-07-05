package com.demo.Services;

import com.demo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface UserService {

    boolean saveUser(User user);
    User getUser(Long id);
    List<User> getAllUser();
    boolean deleteUser(Long id);
    boolean updateUser(Long id, User user);
}
