package com.week_nine.Service.ServiceImpl;

import com.week_nine.Enums.Role;
import com.week_nine.Model.User;
import com.week_nine.Repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    User user;

    @BeforeEach
    void setUp() {
        user = new User();
        user.setRole(Role.ADMIN.name());
        user.setFirstName("Udeme");
        user.setLastName("Kendrick");
        user.setPhoneNumber("08142274320");
        user.setEmail("udemekendrick@gmail.com");
        user.setPassword("UdKen@4320");
    }

    @Test
    void createAdmin() {
        User admin = userRepository.save(user);
        assertThat(admin).isNotNull();
        assertThat(admin.getEmail()).isEqualTo(user.getEmail());
    }

    @Test
    void createCustomer() {
    }
}