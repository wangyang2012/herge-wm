package com.herge.service.impl;

import com.herge.dao.UserDao;
import com.herge.models.User;
import com.herge.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ywang on 02/03/17.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        List<User> result = new ArrayList<User>();
        Iterable<User> source = userDao.findAll();
        if (source != null) {
            source.forEach((user) -> result.add(user));
        }
        return result;
    }

    /**
     * @param email
     * @return
     */
    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User findOne(long id) {
        return userDao.findOne(id);
    }
}
