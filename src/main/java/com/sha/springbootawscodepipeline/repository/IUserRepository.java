package com.sha.springbootawscodepipeline.repository;

import com.sha.springbootawscodepipeline.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author sa
 * @date 25.01.2021
 * @time 22:14
 */
public interface IUserRepository extends JpaRepository<User, Long>
{
    //findBy + fieldName
    Optional<User> findByUsername(String username);
}
