package com.hoyoon.lee.community.dto;

import com.hoyoon.lee.community.domain.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private String userId;
    private String name;
    private String password;
    private String nickname;
    private String email;
    private UserRole role;
}
