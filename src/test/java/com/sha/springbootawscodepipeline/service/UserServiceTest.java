package com.sha.springbootawscodepipeline.service;

import com.sha.springbootawscodepipeline.model.User;
import com.sha.springbootawscodepipeline.repository.IUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * @author sa
 * @date 25.01.2021
 * @time 22:41
 */
@SpringBootTest(properties = "spring.profiles.active:test")
@ExtendWith(SpringExtension.class)
public class UserServiceTest
{
    @Autowired
    private IUserService userService;

    @Autowired
    private IUserRepository userRepository;

    @Test
    public void test_saveUser()
    {
        User user = new User();
        user.setName("Test-name");
        user.setUsername("un-1");

        userService.saveUser(user);

        List<User> users = userRepository.findAll();

        Assertions.assertThat(users).hasSize(1);
    }
}
