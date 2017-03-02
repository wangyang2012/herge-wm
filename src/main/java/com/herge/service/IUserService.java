package com.herge.service;

import com.herge.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ywang on 02/03/17.
 */
@Service
public interface IUserService {

    List<User> getAll();

    public User findByEmail(String email);

    void save(User user);

    void delete(User user);

    User findOne(long id);
}
