package com.week_nine.Service;

import com.week_nine.Model.User;
import com.week_nine.Pojo.UserSignupDto;

public interface UserServiceInterface {
    User createAdmin(UserSignupDto userSignupDto);
}