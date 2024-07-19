package org.example.userservice.controllers;

import org.example.userservice.dtos.*;
import org.example.userservice.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        return null;
    }

    public SignupResponseDto signup(SignupRequestDto signupRequestDto) {
        return null;
    }

    public UserDto validateToken(ValidateTokenRequestDto requestDto){
        return null;
    }

    public LogoutResponseDto logout(LogoutRequestDto requestDto){
        return null;
    }
}
