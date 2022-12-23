package com.week_nine.Service.ServiceImpl;

import com.week_nine.Enums.Role;
import com.week_nine.Exceptions.UserAlreadyExists;
import com.week_nine.Model.User;
import com.week_nine.Pojo.UserSignupDto;
import com.week_nine.Repository.UserRepository;
import com.week_nine.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User createAdmin(UserSignupDto userSignupDto) {
        Boolean existedUser = userRepository.existsByEmail(userSignupDto.getEmail());
        if (existedUser){
            throw new UserAlreadyExists("Kindly create a new account");
        }
        User user = User.builder()
                .role(Role.ADMIN.name())
                .firstName(userSignupDto.getFirstName())
                .lastName(userSignupDto.getLastName())
                .gender(userSignupDto.getGender())
                .phoneNumber(userSignupDto.getPhoneNumber())
                .email(userSignupDto.getEmail())
                .password(userSignupDto.getPassword())
                .build();
        userRepository.save(user);
        return user;
    }
}