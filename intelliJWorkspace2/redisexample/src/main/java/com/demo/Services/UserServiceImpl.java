package com.demo.Services;

import com.demo.Model.User;
import com.demo.Repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {



    @Autowired
    private UserDao userDao;

    @Override
    public boolean saveUser(User user) {

        return  userDao.saveUser(user);

    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public boolean deleteUser(Long id) {
        return userDao.deleteUser(id);
    }

    @Override
    public boolean updateUser(Long id, User user) {
        return userDao.updateUser(id,user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
