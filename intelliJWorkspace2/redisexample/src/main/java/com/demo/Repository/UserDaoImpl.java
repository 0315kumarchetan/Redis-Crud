package com.demo.Repository;

import com.demo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private RedisTemplate redisTemplate;

    private static final String KEY = "USER";



    @Override
    public boolean saveUser(User user) {

        try {
            redisTemplate.opsForHash().put(KEY,user.getId().toString(),user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<User> getAllUser() {
        List<User> users;
        try{
         users =   redisTemplate.opsForHash().values(KEY);
         return users;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {

        try{
            redisTemplate.opsForHash().delete(KEY,id.toString());
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(Long id, User user) {
        try {
            redisTemplate.opsForHash().put(KEY,user.getId().toString(),user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User getUser(Long id) {
        User user;
        try{
           user = (User)redisTemplate.opsForHash().get(KEY , id.toString());
           return user;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
