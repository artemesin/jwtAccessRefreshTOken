package com.epam.jwtrefreshtoken.repository;

import com.epam.jwtrefreshtoken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
