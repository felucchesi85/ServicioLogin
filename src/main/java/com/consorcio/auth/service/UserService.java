package com.consorcio.auth.service;

import com.consorcio.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
