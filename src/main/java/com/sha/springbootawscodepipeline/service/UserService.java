package com.sha.springbootawscodepipeline.service;

import com.sha.springbootawscodepipeline.model.User;
import com.sha.springbootawscodepipeline.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author sa
 * @date 25.01.2021
 * @time 22:18
 */
@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public User saveUser(User user)
    {
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username)
    {
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public List<User> findAllUsers()
    {
        return userRepository.findAll();
    }
}
