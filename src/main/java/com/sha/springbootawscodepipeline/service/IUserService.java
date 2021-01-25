package com.sha.springbootawscodepipeline.service;

import com.sha.springbootawscodepipeline.model.User;

import java.util.List;

/**
 * @author sa
 * @date 25.01.2021
 * @time 22:17
 */
public interface IUserService
{
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
