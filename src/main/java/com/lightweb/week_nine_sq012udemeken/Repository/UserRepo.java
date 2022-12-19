package com.lightweb.week_nine_sq012udemeken.Repository;

import com.lightweb.week_nine_sq012udemeken.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
    User findByUser_idAndRole(Long user_id, String role);
}