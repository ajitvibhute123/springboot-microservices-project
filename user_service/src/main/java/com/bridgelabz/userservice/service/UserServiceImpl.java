package com.bridgelabz.userservice.service;

import com.bridgelabz.userservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(1311L, "Ajit Vibhute", "23525625"),
            new User(1312L, "Ganesh Vibhute", "99999"),
            new User(1314L, "Anjali Vibhute", "888"),
            new User(1313L, "Sara Gore", "525252"),
            new User(1315L, "Smith Kumar", "656565")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
