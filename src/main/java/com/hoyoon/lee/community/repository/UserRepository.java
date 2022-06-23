package com.hoyoon.lee.community.repository;

import com.hoyoon.lee.community.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
