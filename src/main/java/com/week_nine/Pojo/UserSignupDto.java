package com.week_nine.Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
@Builder
@Getter
@Setter
public class UserSignupDto {
    @NotNull(message = "First name can not be blank.")
    @Length(min = 2, max = 20)
    private String firstName;

    @NotNull(message = "Last name can not be blank.")
    @Length(min = 2, max = 20)
    private String lastName;

    @NotNull(message = "Gender can not be blank.")
    @Length(min = 2, max = 20)
    private String gender;

    @NotNull(message = "Phone number can not be blank.")
    @Length(min = 2, max = 20)
    private String phoneNumber;

    @Email(message = "Input a valid email address.")
    @NotNull(message = "Email can not be blank.")
    @Length(min = 2, max = 50)
    private String  email;

    @NotNull(message = "Password can not be blank.")
    @Length(min = 2, max = 20)
    private String password;
}