package com.hoyoon.lee.community.domain;

import com.hoyoon.lee.community.domain.enums.BaseTime;
import com.hoyoon.lee.community.domain.enums.UserRole;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class User extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userId;

    private String name;

    private String password;

    private String nickname;

    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;
}
