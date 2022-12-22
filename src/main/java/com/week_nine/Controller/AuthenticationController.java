package com.week_nine.Controller;

import com.week_nine.Pojo.UserSignupDto;
import com.week_nine.Service.ServiceImpl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/v1/user")
@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final UserServiceImpl userService;

    @GetMapping("/")
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<>("Welcome to LIGHTWEB! Please signup.", HttpStatus.OK);
    }

    @PostMapping("/adminSignup")
    public ResponseEntity<String> createAdmin(@Valid @RequestBody UserSignupDto userDto){
        userService.createAdmin(userDto);
        return  new ResponseEntity<>("Admin created successfully", HttpStatus.CREATED);
    }
}