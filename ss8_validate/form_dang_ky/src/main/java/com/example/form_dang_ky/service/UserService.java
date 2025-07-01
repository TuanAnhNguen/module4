package com.example.form_dang_ky.service;

import com.example.form_dang_ky.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    private final List<User> userList = new ArrayList<>();

    @Override
    public void save(User user) {
        userList.add(user);
    }

    public List<User> findAll() {
        return userList;
    }
}
