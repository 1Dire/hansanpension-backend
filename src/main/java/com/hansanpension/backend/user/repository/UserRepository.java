package com.hansanpension.backend.user.repository;

import com.hansanpension.backend.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByKakaoId(String kakaoId);
    Optional<User> findByRole(User.Role role);
}
