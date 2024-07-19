package org.example.userservice.dtos;

import org.example.userservice.models.Role;

import java.util.List;

public class UserDto {
    private String email;
    private String name;
    private List<Role> roles;
}
