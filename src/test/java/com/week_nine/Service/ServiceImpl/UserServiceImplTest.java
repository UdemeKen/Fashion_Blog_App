package com.week_nine.Service.ServiceImpl;

import com.week_nine.Enums.Role;
import com.week_nine.Model.User;
import com.week_nine.Pojo.UserSignupDto;
import com.week_nine.Repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

    private User user;
    private UserSignupDto userSignupDto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        user = User.builder()
                .role(Role.ADMIN.name())
                .firstName("Kendrick")
                .lastName("Udeme")
                .gender("Male")
                .phoneNumber("08022608642")
                .email("kendrickudeme@gmail.com")
                .password("KenUd@4320")
                .build();
        userSignupDto = UserSignupDto.builder()
                .firstName("Kendrick")
                .lastName("Udeme")
                .gender("Male")
                .phoneNumber("08022608642")
                .email("kendrickudeme@gmail.com")
                .password("KenUd@4320")
                .build();
        when(userRepository.existsByEmail(anyString())).thenReturn(false);
        when(userRepository.save(user)).thenReturn(user);
    }

    @Test
    void createAdmin() {
        User actual = userService.createAdmin(userSignupDto);
        Assertions.assertEquals(user, actual);
    }
}