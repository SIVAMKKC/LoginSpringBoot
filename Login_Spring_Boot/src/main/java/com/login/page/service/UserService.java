package com.login.page.service;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.login.page.dto.UserRegistrationDto;
import com.login.page.model.User;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto registrationDto);

	List<User> getAll();
}
